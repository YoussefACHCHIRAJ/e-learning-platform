package uca.ac.elearning.webService.dto;

import jakarta.persistence.ManyToOne;
import uca.ac.elearning.bean.GroupeEtudiantDetail;
import uca.ac.elearning.bean.InscriptionEtudiant;
import uca.ac.elearning.bean.Parcours;
import uca.ac.elearning.bean.Prof;

import java.time.LocalDate;

public class GroupeEtudiantDto {

    private long id;
    private String libelle;
    private LocalDate date;

    private Prof prof;
    private GroupeEtudiantDetail groupeEtudiantDetail;


    private InscriptionEtudiant inscriptionEtudiant;


    private Parcours parcours;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Prof getProf() {
        return prof;
    }

    public void setProf(Prof prof) {
        this.prof = prof;
    }

    public GroupeEtudiantDetail getGroupeEtudiantDetail() {
        return groupeEtudiantDetail;
    }

    public void setGroupeEtudiantDetail(GroupeEtudiantDetail groupeEtudiantDetail) {
        this.groupeEtudiantDetail = groupeEtudiantDetail;
    }

    public InscriptionEtudiant getInscriptionEtudiant() {
        return inscriptionEtudiant;
    }

    public void setInscriptionEtudiant(InscriptionEtudiant inscriptionEtudiant) {
        this.inscriptionEtudiant = inscriptionEtudiant;
    }

    public Parcours getParcours() {
        return parcours;
    }

    public void setParcours(Parcours parcours) {
        this.parcours = parcours;
    }
}

