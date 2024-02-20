package uca.ac.elearning.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TypeMutimedia {
    @Id
    private long id;

    private String libelle;

    private String code;

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

}
