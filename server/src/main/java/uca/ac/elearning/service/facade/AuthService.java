package uca.ac.elearning.service.facade;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import uca.ac.elearning.utils.AuthenticationRequest;
import uca.ac.elearning.utils.AuthenticationResponse;
import uca.ac.elearning.utils.RegisterRequest;

public interface AuthService {
    AuthenticationResponse register(@RequestBody RegisterRequest request);

    AuthenticationResponse authenticate(@RequestBody AuthenticationRequest request);
}
