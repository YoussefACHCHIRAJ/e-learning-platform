package uca.ac.elearning.webService.dto;

import uca.ac.elearning.bean.DisponibiliteProf;

import java.util.Date;

public class DisponibiliteProfDetailDto {
    private long id;
    private String jour;

    private Date trancheHoraireDebut;
    private Date trancheHoraireFin;
    private DisponibiliteProf disponibiliteProf;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public DisponibiliteProf getDisponibiliteProf() {
        return disponibiliteProf;
    }

    public void setDisponibiliteProf(DisponibiliteProf disponibiliteProf) {
        this.disponibiliteProf = disponibiliteProf;
    }
}
