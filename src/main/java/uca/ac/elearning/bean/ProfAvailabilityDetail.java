package uca.ac.elearning.bean;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;
import java.util.Date;

@Entity
@Data
public class ProfAvailabilityDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Date day;

    private LocalTime startTimeSlot;
    private LocalTime endTimeSlot;
    @ManyToOne
    private ProfAvailability profAvailability;
    
}
