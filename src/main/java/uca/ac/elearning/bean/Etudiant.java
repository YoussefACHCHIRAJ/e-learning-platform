package uca.ac.elearning.bean;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;
    private String email;
    private String password;
}
