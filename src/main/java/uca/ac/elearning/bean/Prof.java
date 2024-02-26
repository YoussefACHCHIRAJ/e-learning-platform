package uca.ac.elearning.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Prof {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String fullName;
    private String username;
    private String password;
    private String email;
}
