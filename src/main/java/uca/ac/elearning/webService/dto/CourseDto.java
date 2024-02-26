package uca.ac.elearning.webService.dto;

import lombok.Data;
import uca.ac.elearning.bean.Path;

@Data
public class CourseDto {
    private long id;
    private String label;
    private String code;
    private Path path;
}
