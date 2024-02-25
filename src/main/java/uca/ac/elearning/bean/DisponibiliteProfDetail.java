package uca.ac.elearning.bean;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;
import java.util.Date;

@Entity
@Data
public class DisponibiliteProfDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String jour;

    private LocalTime trancheHoraireDebut;
    private LocalTime trancheHoraireFin;
    @ManyToOne
    private DisponibiliteProf disponibiliteProf;
    
}
