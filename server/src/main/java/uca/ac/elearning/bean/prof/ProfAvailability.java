package uca.ac.elearning.bean.prof;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uca.ac.elearning.bean.common.Day;
import uca.ac.elearning.bean.users.User;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProfAvailability {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    private Day day;
    @ManyToOne
    private User prof;
}
