package uca.ac.elearning.webService.dto;

import uca.ac.elearning.bean.Cours;
import uca.ac.elearning.bean.Etudiant;

import java.util.Date;

public class InscriptionEtudiantDto {
    private long id;
    private Date dateInscription;
    private Cours coursActuel;
    private Etudiant etudiant;

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cours getCoursActuel() {
        return coursActuel;
    }

    public void setCoursActuel(Cours coursActuel) {
        this.coursActuel = coursActuel;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
}
