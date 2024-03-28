package uca.ac.elearning.bean.student;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;

@Entity
@Data
public class StudentGroupDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private LocalTime startTimeSlot;
    private LocalTime endTimeSlot;
    private boolean active;
    @ManyToOne
    private StudentGroup studentGroup;
    @ManyToOne
    private StudentInscription studentInscription;

}
