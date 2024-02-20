package uca.ac.elearning.bean;

import jakarta.persistence.*;
import jdk.jfr.Category;

@Entity
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
}







