package uca.ac.elearning.webService.dto;

import lombok.Data;

import java.util.Date;

@Data
public class DisponibiliteProfDto {
    private long id;
    private Date dateDebut;
    private Date dateFin;
}
