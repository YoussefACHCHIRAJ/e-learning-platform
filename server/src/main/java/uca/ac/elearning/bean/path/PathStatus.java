package uca.ac.elearning.bean.path;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class PathStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String label;
    private String code;
}
