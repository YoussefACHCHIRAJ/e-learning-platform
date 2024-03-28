package uca.ac.elearning.utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uca.ac.elearning.bean.users.Role;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthenticationResponse {

    private int statusCode;
    private String token;
    private String message;
    private Role role;
}
