package uca.ac.elearning.bean.users;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

public enum Role{
    ADMIN,
    STUDENT,
    PROF
}
