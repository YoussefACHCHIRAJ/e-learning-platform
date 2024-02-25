package uca.ac.elearning.bean;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class DisponibiliteProf {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Date dateDebut;
    private Date dateFin;
    @ManyToOne
    private Prof prof;
}
