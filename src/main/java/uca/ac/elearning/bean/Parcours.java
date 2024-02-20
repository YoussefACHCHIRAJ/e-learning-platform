package uca.ac.elearning.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Parcours {
    @Id
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
