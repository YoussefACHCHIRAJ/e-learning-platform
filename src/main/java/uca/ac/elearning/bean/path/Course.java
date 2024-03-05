package uca.ac.elearning.bean.path;

import jakarta.persistence.*;
import lombok.Data;
import uca.ac.elearning.bean.path.Path;

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
