package uca.ac.elearning.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class DisponibiliteProf {
    @Id
    private long id;

    @ManyToOne
    private Prof prof;
    private Date dateDebut;
    private Date dateFin;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Prof getProf() {
        return prof;
    }

    public void setProf(Prof prof) {
        this.prof = prof;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
}
