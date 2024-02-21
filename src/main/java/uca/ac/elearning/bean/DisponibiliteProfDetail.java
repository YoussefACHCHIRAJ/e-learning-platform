package uca.ac.elearning.bean;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class DisponibiliteProfDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String jour;

    private Date trancheHoraireDebut;
    private Date trancheHoraireFin;
    @ManyToOne
    private DisponibiliteProf disponibiliteProf;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public DisponibiliteProf getDisponibiliteProf() {
        return disponibiliteProf;
    }

    public void setDisponibiliteProf(DisponibiliteProf disponibiliteProf) {
        this.disponibiliteProf = disponibiliteProf;
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
