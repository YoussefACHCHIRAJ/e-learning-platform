package uca.ac.elearning.bean;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class EtatParcours {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String libelle;
    private String code;
    @OneToMany
    private List<Parcours> parcours;
}
