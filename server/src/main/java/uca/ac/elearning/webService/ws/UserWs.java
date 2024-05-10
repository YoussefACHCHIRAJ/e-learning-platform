package uca.ac.elearning.webService.ws;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import uca.ac.elearning.bean.users.User;

import uca.ac.elearning.service.facade.UserService;

import uca.ac.elearning.webService.converter.usersConverter.UserConverter;

import uca.ac.elearning.webService.dto.userDto.UserDto;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor // automatically generates a constructor for the final arguments
public class UserWs {
    private final UserService userService;
    private final UserConverter userConverter;

    @GetMapping("/profs")
    public List<UserDto> findAllProfs() {
        List<User> Profs = userService.findAllProfs();
        return userConverter.toDto(Profs);
    }
    @GetMapping("/students")
    public List<UserDto> findAllStudents() {
        List<User> Students = userService.findAllStudents();
        return userConverter.toDto(Students);
    }

    
}
