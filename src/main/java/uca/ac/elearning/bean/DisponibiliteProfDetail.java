package uca.ac.elearning.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class DisponibiliteProfDetail {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private LocalDate jour;
    private LocalTime tranchHoraireDebut;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getJour() {
        return jour;
    }

    public void setJour(LocalDate jour) {
        this.jour = jour;
    }

    public LocalTime getTranchHoraireDebut() {
        return tranchHoraireDebut;
    }

    public void setTranchHoraireDebut(LocalTime tranchHoraireDebut) {
        this.tranchHoraireDebut = tranchHoraireDebut;
    }

    public LocalTime getTranchHoraireFin() {
        return tranchHoraireFin;
    }

    public void setTranchHoraireFin(LocalTime tranchHoraireFin) {
        this.tranchHoraireFin = tranchHoraireFin;
    }

    private LocalTime tranchHoraireFin;





}
