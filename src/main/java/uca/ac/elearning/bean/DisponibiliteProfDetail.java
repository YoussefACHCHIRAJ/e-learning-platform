package uca.ac.elearning.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class DisponibiliteProfDetail {
    @Id
    private long id;
    @ManyToOne
    private DisponibiliteProf dispoProf;
    private String jour;

    private Date trancheHoraireDebut;
    private Date trancheHoraireFin;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public DisponibiliteProf getDispoProf() {
        return dispoProf;
    }

    public void setDispoProf(DisponibiliteProf dispoProf) {
        this.dispoProf = dispoProf;
    }

    public String getJour() {
        return jour;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }

    public Date getTrancheHoraireDebut() {
        return trancheHoraireDebut;
    }

    public void setTrancheHoraireDebut(Date trancheHoraireDebut) {
        this.trancheHoraireDebut = trancheHoraireDebut;
    }

    public Date getTrancheHoraireFin() {
        return trancheHoraireFin;
    }

    public void setTrancheHoraireFin(Date trancheHoraireFin) {
        this.trancheHoraireFin = trancheHoraireFin;
    }
}
