package uca.ac.elearning.bean.path;

import jakarta.persistence.*;
import lombok.Data;
import uca.ac.elearning.bean.users.User;

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
    private User admin;
    @ManyToOne
    private PathStatus pathStatus;
}
