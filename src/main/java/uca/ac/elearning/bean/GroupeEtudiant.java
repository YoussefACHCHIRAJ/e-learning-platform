package uca.ac.elearning.bean;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class GroupeEtudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String libelle;
    private Date date;

    @ManyToOne
    private Prof prof;

    @ManyToOne
    private GroupeEtudiantDetail groupeEtudiantDetail;

    @ManyToOne
    private InscriptionEtudiant inscriptionEtudiant;

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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
}
