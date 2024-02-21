package uca.ac.elearning.webService.dto;

import uca.ac.elearning.bean.Cours;
import uca.ac.elearning.bean.Etudiant;

public class InscriptionEtudiantDto {
    private long id;
    private Cours coursActuel;
    private Etudiant etudiant;

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
