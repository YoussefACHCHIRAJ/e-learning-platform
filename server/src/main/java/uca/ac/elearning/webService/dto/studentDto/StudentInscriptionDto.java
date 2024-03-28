package uca.ac.elearning.webService.dto.studentDto;

import lombok.Data;
import uca.ac.elearning.bean.path.Course;
import uca.ac.elearning.webService.dto.userDto.UserDto;

import java.util.Date;

@Data
public class StudentInscriptionDto {
    private long id;
    private Date inscriptionDate;
    private Course currentCourse;
    private UserDto student;
}
