package uca.ac.elearning.bean;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class GroupeEtudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String libelle;
    private LocalDate date;
    @OneToOne
    private GroupeEtudiantDetail groupeEtudiantDetail;
    @ManyToOne
    private Parcours parcours;

}
