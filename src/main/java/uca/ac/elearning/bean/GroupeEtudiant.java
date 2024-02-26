package uca.ac.elearning.bean;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;


@Entity
@Data
public class GroupeEtudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String libelle;
    private LocalDate date;

    @ManyToOne
    private Prof prof;

    @ManyToOne
    private GroupeEtudiantDetail groupeEtudiantDetail;

    @ManyToOne
    private StudentInscription inscriptionEtudiant;

    @ManyToOne
    private Parcours parcours;
}
