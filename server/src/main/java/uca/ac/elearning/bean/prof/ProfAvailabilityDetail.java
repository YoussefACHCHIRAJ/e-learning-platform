package uca.ac.elearning.bean.prof;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uca.ac.elearning.bean.common.Day;

import java.time.LocalTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProfAvailabilityDetail {
    @Id
    @GeneratedValue
    private long id;
    private LocalTime startTimeSlot;
    private LocalTime endTimeSlot;
    @ManyToOne
    private ProfAvailability profAvailability;
}
