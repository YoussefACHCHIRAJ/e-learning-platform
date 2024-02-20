package uca.ac.elearning.bean;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class DisponibiliteProf {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
