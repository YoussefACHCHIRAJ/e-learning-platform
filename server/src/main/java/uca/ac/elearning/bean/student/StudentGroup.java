package uca.ac.elearning.bean.student;

import jakarta.persistence.*;
import lombok.Data;
import uca.ac.elearning.bean.path.Path;
import uca.ac.elearning.bean.users.User;

import java.time.LocalDate;


@Entity
@Data
public class StudentGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String label;
    private String code;
    private LocalDate dateCreation;
    private int availablePlaces;
    @ManyToOne
    private User prof;
    @ManyToOne
    private Path path;

    @OneToOne
    private StudentGroupDetail studentGroupDetail;

    @ManyToOne
    private StudentGroupCategory studentGroupCategory;


}
