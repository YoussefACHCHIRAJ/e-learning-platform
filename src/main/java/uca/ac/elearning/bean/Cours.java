package uca.ac.elearning.bean;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String libelle;
    private String code;
    @ManyToOne
    private Parcours parcours;
}
