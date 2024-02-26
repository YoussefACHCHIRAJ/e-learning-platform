package uca.ac.elearning.webService.dto;

import lombok.Data;

@Data
public class ProfDto {
    private long id;
    private String fullName;
    private String username;
    private String password;
    private String email;

}
