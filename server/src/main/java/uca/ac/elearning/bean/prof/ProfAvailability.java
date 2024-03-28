package uca.ac.elearning.bean.prof;

import jakarta.persistence.*;
import lombok.Data;
import uca.ac.elearning.bean.common.Day;
import uca.ac.elearning.bean.users.User;

import java.time.LocalDate;

@Entity
@Data
public class ProfAvailability {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    private Day day;
    @ManyToOne
    private User prof;
}
