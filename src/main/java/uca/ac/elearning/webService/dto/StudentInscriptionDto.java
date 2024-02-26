package uca.ac.elearning.webService.dto;

import lombok.Data;
import uca.ac.elearning.bean.Course;
import uca.ac.elearning.bean.Student;

import java.util.Date;

@Data
public class StudentInscriptionDto {
    private long id;
    private Date inscriptionDate;
    private Course currentCourse;
    private Student student;
}
