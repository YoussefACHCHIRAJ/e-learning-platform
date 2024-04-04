package uca.ac.elearning.bean.path;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uca.ac.elearning.bean.users.User;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Path {
    @Id
    @GeneratedValue()
    private long id;
    private String label;
    private String code;
    @Column(length = 500)
    private String description;
    @ManyToOne
    private User admin;
    @ManyToOne
    private PathStatus pathStatus;
}
