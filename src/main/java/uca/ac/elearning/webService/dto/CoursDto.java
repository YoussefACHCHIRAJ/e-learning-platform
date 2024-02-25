package uca.ac.elearning.webService.dto;

import lombok.Data;
import uca.ac.elearning.bean.Parcours;

@Data
public class CoursDto {
    private long id;
    private String libelle;
    private String code;
    private Parcours parcours;
}
