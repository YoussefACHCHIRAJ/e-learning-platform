package uca.ac.elearning.webService.dto;


import lombok.Data;
import uca.ac.elearning.bean.Path;

import java.util.List;

@Data
public class EtatParcoursDto {

    private long id;
    private String libelle;
    private String code;

    private List<Path> parcours;
}
