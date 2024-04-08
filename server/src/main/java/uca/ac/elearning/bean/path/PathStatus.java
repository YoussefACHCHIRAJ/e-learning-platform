package uca.ac.elearning.bean.path;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PathStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String label;
    private String code;
}
