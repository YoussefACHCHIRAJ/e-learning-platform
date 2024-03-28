package uca.ac.elearning.bean.prof;

import jakarta.persistence.*;
import lombok.Data;
import uca.ac.elearning.bean.common.Day;

import java.time.LocalTime;

@Entity
@Data
public class ProfAvailabilityDetail {
    @Id
    @GeneratedValue
    private long id;
    private LocalTime startTimeSlot;
    private LocalTime endTimeSlot;
    @ManyToOne
    private ProfAvailability profAvailability;


}
