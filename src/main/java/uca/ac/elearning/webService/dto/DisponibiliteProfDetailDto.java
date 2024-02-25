package uca.ac.elearning.webService.dto;

import lombok.Data;
import uca.ac.elearning.bean.DisponibiliteProf;

import java.util.Date;

@Data
public class DisponibiliteProfDetailDto {
    private long id;
    private String jour;
    private Date trancheHoraireDebut;
    private Date trancheHoraireFin;
    private DisponibiliteProf disponibiliteProf;
    }
