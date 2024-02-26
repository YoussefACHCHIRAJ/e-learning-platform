package uca.ac.elearning.bean;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;


@Entity
@Data
public class  StudentGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String libelle;
    private LocalDate date;

    @ManyToOne
    private Prof prof;

    @ManyToOne
    private StudentGroupDetail studentGroupDetail;

    @ManyToOne
    private StudentInscription studentInscription;

    @ManyToOne
    private Parcours parcours;
}
