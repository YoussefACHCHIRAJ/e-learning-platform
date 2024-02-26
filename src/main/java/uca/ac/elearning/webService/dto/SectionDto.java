package uca.ac.elearning.webService.dto;

import lombok.Data;
import uca.ac.elearning.bean.Category;
import uca.ac.elearning.bean.Course;
import uca.ac.elearning.bean.MultimediaType;
import uca.ac.elearning.bean.MultimediaType;

@Data
public class SectionDto {
    private long id;
    private String label;
    private String pathMultimedia;
    private String content;
    private MultimediaType typeMultimedia;
    private Course course;


    private Category category;


}


