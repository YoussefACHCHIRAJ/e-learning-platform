package uca.ac.elearning.webService.dto;

import uca.ac.elearning.bean.Admin;
import uca.ac.elearning.bean.EtatParcours;

public class ParcoursDto {
    private long id;
    private String libelle;
    private String description;

    private EtatParcours etatParcours;

    private Admin admin;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EtatParcours getEtatParcours() {
        return etatParcours;
    }

    public void setEtatParcours(EtatParcours etatParcours) {
        this.etatParcours = etatParcours;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}
