package uca.ac.elearning.bean;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String label;
    private String pathMultimedia;
    private String content;
    @ManyToOne
    private MultimediaType typeMultimedia;
   @ManyToOne
    private Course course;
   @ManyToOne
   private Category category;
}







