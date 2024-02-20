package uca.ac.elearning.bean;

import jakarta.persistence.*;

@Entity
public class Parcours {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String libelle;
    private String description;
    @ManyToOne
    private EtatParcours etatParcours;

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
}
