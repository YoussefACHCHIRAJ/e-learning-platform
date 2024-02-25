package uca.ac.elearning.webService.dto;

import jakarta.persistence.ManyToOne;
import lombok.Data;
import uca.ac.elearning.bean.Category;
import uca.ac.elearning.bean.Cours;
import uca.ac.elearning.bean.TypeMutimedia;

@Data
public class SectionDto {
    private long id;
    private String libelle;
    private String pathMultimedia;
    private String content;
    private TypeMutimedia typeMultimedia;
    private Cours cours;


    private Category category;


}


