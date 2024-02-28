package uca.ac.elearning.webService.dto.pathDto;

import lombok.Data;
import uca.ac.elearning.bean.common.CategorySection;
import uca.ac.elearning.bean.path.Course;
import uca.ac.elearning.bean.common.MultimediaType;

@Data
public class SectionDto {
    private long id;
    private String label;
    private String pathMultimedia;
    private String content;
    private MultimediaType typeMultimedia;
    private Course course;
    private CategorySection category;


}


