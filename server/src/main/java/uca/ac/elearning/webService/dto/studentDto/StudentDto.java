package uca.ac.elearning.webService.dto.studentDto;

import lombok.Data;

@Data
public class StudentDto {
    private long id;
    private String fullName;
    private String username;
    private String email;
}
