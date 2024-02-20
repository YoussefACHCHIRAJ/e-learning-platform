package uca.ac.elearning.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jdk.jfr.Category;

@Entity
public class Section {
    @Id
    private long id;
    private String libelle;
    private String pathMultimedia;
    private String content;

    @ManyToOne
    private TypeMutimedia typeMultimedia;

   @ManyToOne
    private Cours cours;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getPathMultimedia() {
        return pathMultimedia;
    }

    public void setPathMultimedia(String pathMultimedia) {
        this.pathMultimedia = pathMultimedia;
    }

    public String getTypeMultimedia() {
        return typeMultimedia;
    }

    public void setTypeMultimedia(String typeMultimedia) {
        this.typeMultimedia = typeMultimedia;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
}
