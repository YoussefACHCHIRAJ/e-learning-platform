package uca.ac.elearning.webService.dto.studentDto;

import lombok.Data;
import uca.ac.elearning.bean.student.StudentGroupDetail;
import uca.ac.elearning.bean.student.StudentInscription;
import uca.ac.elearning.bean.path.Path;
import uca.ac.elearning.bean.prof.Prof;

import java.time.LocalDate;

@Data
public class StudentGroupDto {
    private long id;
    private String label;
    private LocalDate date;
    private Prof prof;
    private StudentGroupDetail studentGroupDetail;
    private StudentInscription studentInscription;
    private Path path;
}

