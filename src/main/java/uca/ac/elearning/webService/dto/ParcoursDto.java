package uca.ac.elearning.webService.dto;

import lombok.Data;
import uca.ac.elearning.bean.Admin;
import uca.ac.elearning.bean.EtatParcours;

@Data
public class ParcoursDto {
    private long id;
    private String libelle;
    private String description;
    private EtatParcours etatParcours;
    private Admin admin;

}
