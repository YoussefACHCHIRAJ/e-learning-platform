package uca.ac.elearning.utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uca.ac.elearning.bean.users.Role;
import uca.ac.elearning.webService.dto.userDto.UserDto;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthenticationResponse {

    private int statusCode;
    private String token;
    private String message;
    private UserDto authUser;
}
