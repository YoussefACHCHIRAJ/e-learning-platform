package uca.ac.elearning.webService.dto.userDto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import uca.ac.elearning.bean.users.Role;

@Data
public class UserDto {
    private String firstname;
    private String lastname;
    private String email;
    @Enumerated(EnumType.STRING)
    private Role role;
}
