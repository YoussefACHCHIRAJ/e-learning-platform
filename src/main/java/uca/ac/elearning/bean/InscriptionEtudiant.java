package uca.ac.elearning.bean;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class InscriptionEtudiant {
    @Id
    private long id;
    @ManyToOne
    private Etudiant etudiant;
    @ManyToOne
    private Parcours parcours;
    private String coursActuel;
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