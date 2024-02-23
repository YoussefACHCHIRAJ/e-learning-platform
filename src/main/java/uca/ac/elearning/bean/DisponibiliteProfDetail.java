package uca.ac.elearning.bean;

import jakarta.persistence.*;

import java.time.LocalTime;
import java.util.Date;

@Entity
public class DisponibiliteProfDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String jour;

    private LocalTime trancheHoraireDebut;
    private LocalTime trancheHoraireFin;
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

    public LocalTime getTrancheHoraireDebut() {
        return trancheHoraireDebut;
    }

    public void setTrancheHoraireDebut(LocalTime trancheHoraireDebut) {
        this.trancheHoraireDebut = trancheHoraireDebut;
    }

    public LocalTime getTrancheHoraireFin() {
        return trancheHoraireFin;
    }

    public void setTrancheHoraireFin(LocalTime trancheHoraireFin) {
        this.trancheHoraireFin = trancheHoraireFin;
    }
}
