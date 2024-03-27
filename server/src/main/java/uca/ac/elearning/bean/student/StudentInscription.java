package uca.ac.elearning.bean.student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.Data;
import uca.ac.elearning.bean.path.Course;
import uca.ac.elearning.bean.users.User;

import java.time.LocalDate;

@Entity
@Data
public class StudentInscription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private LocalDate inscriptionDate;
    @ManyToOne
    private Course currentCourse;
    @ManyToOne
    private User student;


}

