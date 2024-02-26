package uca.ac.elearning.bean;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Path {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String label;
    private String course;
    @ManyToOne
    private Admin admin;
    @ManyToOne
    private PathStatus pathStatus;
}
