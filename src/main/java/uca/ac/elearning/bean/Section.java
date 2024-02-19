package uca.ac.elearning.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Section {
    @Id
    private long id;
    private String libelle;
    private String pathMultimedia;
    private String typeMultimedia;
    private String content;
    private String categorie;


}
