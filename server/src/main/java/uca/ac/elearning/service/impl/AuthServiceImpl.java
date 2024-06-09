package uca.ac.elearning.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import uca.ac.elearning.bean.users.Role;
import uca.ac.elearning.bean.users.User;
import uca.ac.elearning.config.JwtService;
import uca.ac.elearning.dao.users.UserDao;
import uca.ac.elearning.service.facade.AuthService;
import uca.ac.elearning.utils.AuthenticationRequest;
import uca.ac.elearning.utils.AuthenticationResponse;
import uca.ac.elearning.utils.RegisterRequest;
import uca.ac.elearning.webService.converter.usersConverter.UserConverter;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserDao userDao;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    private final UserConverter userConverter;

    @Override
    public AuthenticationResponse register(@RequestBody RegisterRequest request){
//        if(userDao.findByEmail(request.getEmail()) != null){
//            return AuthenticationResponse.builder().token("").build();
//        }
        var user = User.builder()
                .firstname(request.getFirstname())
                .lastname(request.getLastname())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.STUDENT)
                .build();

        userDao.save(user);
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder().token(jwtToken).build();
    }

    @Override
    public AuthenticationResponse authenticate(@RequestBody AuthenticationRequest request) {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            request.getEmail(),
                            request.getPassword()
                    )
            );

            var user = userDao.findByEmail(request.getEmail())
                    .orElseThrow(() -> new UsernameNotFoundException("User not found"));
            var authUser = userConverter.toDto(user);
            var tokenMap = new HashMap<String, Object>();
            tokenMap.put("authUser", authUser);
            var jwtToken = jwtService.generateToken(tokenMap, user);

            return AuthenticationResponse.builder()
                    .token(jwtToken)
                    .statusCode(200)
                    .message("successfully")
                    .build();
        } catch (AuthenticationException e) {
            // Handle authentication failure
            return AuthenticationResponse.builder()
                    .token(null)
                    .statusCode(403)
                    .message("incorrect credentials")
                    .build();
        }
    }
}
