package uca.ac.elearning.bean;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String libelle;
    private String pathMultimedia;
    private String content;
    @ManyToOne
    private TypeMutimedia typeMultimedia;
   @ManyToOne
    private Cours cours;
   @ManyToOne
   private Category category;
}







