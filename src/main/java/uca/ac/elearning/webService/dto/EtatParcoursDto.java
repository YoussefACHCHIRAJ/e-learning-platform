package uca.ac.elearning.webService.dto;


import uca.ac.elearning.bean.Parcours;

import java.util.List;

public class EtatParcoursDto {

    private long id;
    private String libelle;
    private String code;

    private List<Parcours> parcours;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Parcours> getParcours() {
        return parcours;
    }

    public void setParcours(List<Parcours> parcours) {
        this.parcours = parcours;
    }
}
