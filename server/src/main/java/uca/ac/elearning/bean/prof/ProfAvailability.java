package uca.ac.elearning.bean.prof;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class ProfAvailability {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private LocalDate startDate;
    private LocalDate endDate;
    @ManyToOne
    private Prof prof;
}
