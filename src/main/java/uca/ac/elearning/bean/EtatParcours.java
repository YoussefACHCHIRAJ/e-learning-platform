package uca.ac.elearning.bean;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class EtatParcours {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String libelle;
    private String code;
    @OneToMany
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
