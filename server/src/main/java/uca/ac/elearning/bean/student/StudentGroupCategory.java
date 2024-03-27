package uca.ac.elearning.bean.student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class StudentGroupCategory {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Label;
    private String code;
    private int studentNumbers;

}
