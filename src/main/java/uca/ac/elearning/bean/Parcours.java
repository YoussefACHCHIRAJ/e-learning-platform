package uca.ac.elearning.bean;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Parcours {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String libelle;
    private String description;
    @ManyToOne
    private Admin admin;
    @ManyToOne
    private EtatParcours etatParcours;
}
