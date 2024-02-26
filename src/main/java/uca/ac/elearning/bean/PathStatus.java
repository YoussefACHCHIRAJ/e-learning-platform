package uca.ac.elearning.bean;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class PathStatus {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String Label;
    private String code;
    @OneToMany
    private List<Path> paths;
}
