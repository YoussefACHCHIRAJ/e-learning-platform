package uca.ac.elearning.webService.dto;

import jakarta.persistence.ManyToOne;
import uca.ac.elearning.bean.Category;
import uca.ac.elearning.bean.Cours;
import uca.ac.elearning.bean.TypeMutimedia;

public class SectionDto {
    private long id;
    private String libelle;
    private String pathMultimedia;
    private String content;
    private TypeMutimedia typeMultimedia;
    private Cours cours;


    private Category category;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public TypeMutimedia getTypeMultimedia() {
        return typeMultimedia;
    }

    public void setTypeMultimedia(TypeMutimedia typeMultimedia) {
        this.typeMultimedia = typeMultimedia;
    }

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}


