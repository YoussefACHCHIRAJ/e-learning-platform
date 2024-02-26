package uca.ac.elearning.webService.dto;

import lombok.Data;
import uca.ac.elearning.bean.StudentGroupDetail;
import uca.ac.elearning.bean.StudentInscription;
import uca.ac.elearning.bean.Path;
import uca.ac.elearning.bean.Prof;

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

