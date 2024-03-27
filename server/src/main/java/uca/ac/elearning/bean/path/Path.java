package uca.ac.elearning.bean.path;

import jakarta.persistence.*;
import lombok.Data;
import uca.ac.elearning.bean.common.Admin;

@Entity
@Data
public class Path {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String label;
    private String code;
    @Column(length = 500)
    private String description;
    @ManyToOne
    private Admin admin;
    @ManyToOne
    private PathStatus pathStatus;
}
