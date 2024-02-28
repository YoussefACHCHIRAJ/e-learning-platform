package uca.ac.elearning.bean.student;

import jakarta.persistence.*;
import lombok.Data;
import uca.ac.elearning.bean.path.Path;
import uca.ac.elearning.bean.prof.Prof;

import java.time.LocalDate;


@Entity
@Data
public class StudentGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String label;
    private LocalDate dateCreation;
    @ManyToOne
    private Prof prof;
    @ManyToOne
    private Path path;

}
