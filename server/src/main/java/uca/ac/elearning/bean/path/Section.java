package uca.ac.elearning.bean.path;

import jakarta.persistence.*;
import lombok.Data;
import uca.ac.elearning.bean.common.CategorySection;
import uca.ac.elearning.bean.common.MultimediaType;
import uca.ac.elearning.bean.path.Course;

@Entity
@Data
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String label;
    private String pathMultimedia;
    @Column(length = 1000)
    private String content;
    @ManyToOne
    private MultimediaType multimediaType;
    @ManyToOne
    private Course course;
    @ManyToOne
    private CategorySection categorySection;
}







