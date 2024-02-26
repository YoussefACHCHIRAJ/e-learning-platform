package uca.ac.elearning.bean;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String label;
    private String code;
    @ManyToOne
    private Path path;
}
