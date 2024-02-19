package uca.ac.elearning.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class GroupeEtudiantDetail {
    @Id
    private long id;

    private boolean active;

    @OneToOne
    private GroupeEtudiant groupeEtudiant;

}
