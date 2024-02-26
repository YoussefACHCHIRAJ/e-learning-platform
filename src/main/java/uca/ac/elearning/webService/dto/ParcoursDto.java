package uca.ac.elearning.webService.dto;

import lombok.Data;
import uca.ac.elearning.bean.Admin;
import uca.ac.elearning.bean.PathStatus;

@Data
public class ParcoursDto {
    private long id;
    private String libelle;
    private String description;
    private PathStatus etatParcours;
    private Admin admin;

}
