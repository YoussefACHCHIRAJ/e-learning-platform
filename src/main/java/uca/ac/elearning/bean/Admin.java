package uca.ac.elearning.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {
    @Id
    private long id;

    private String username;
    private String email;
    private String password;

}
