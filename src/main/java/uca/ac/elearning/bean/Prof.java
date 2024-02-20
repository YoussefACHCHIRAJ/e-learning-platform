package uca.ac.elearning.bean;

import jakarta.persistence.*;

@Entity
public class Prof {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;
    private String email;
    private String password;
    @ManyToOne
    private DisponibiliteProf disponibiliteProf;
}
