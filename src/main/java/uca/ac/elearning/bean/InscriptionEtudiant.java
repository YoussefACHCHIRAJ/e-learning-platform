package uca.ac.elearning.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;


@Entity
public class InscriptionEtudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String coursActuel;

    @ManyToOne
    private Etudiant etudiant;
    @ManyToOne
    private Parcours parcours;

    @ManyToOne
    private Prof prof;
    @ManyToOne
    private GroupeEtudiant groupeEtudiant;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Parcours getParcours() {
        return parcours;
    }

    public void setParcours(Parcours parcours) {
        this.parcours = parcours;
    }

    public String getCoursActuel() {
        return coursActuel;
    }

    public void setCoursActuel(String coursActuel) {
        this.coursActuel = coursActuel;
    }

    public Prof getProf() {
        return prof;
    }

    public void setProf(Prof prof) {
        this.prof = prof;
    }

    public GroupeEtudiant getGroupeEtudiant() {
        return groupeEtudiant;
    }

    public void setGroupeEtudiant(GroupeEtudiant groupeEtudiant) {
        this.groupeEtudiant = groupeEtudiant;
    }
}

