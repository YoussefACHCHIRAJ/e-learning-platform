package uca.ac.elearning.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class StudentInscription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Date inscriptionDate;
    @ManyToOne
    private Cours coursActuel;
    @ManyToOne
    private Student student;
    @ManyToOne
    private StudentGroup studentGroup;
}

