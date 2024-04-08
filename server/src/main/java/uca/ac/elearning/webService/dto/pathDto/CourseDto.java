package uca.ac.elearning.webService.dto.pathDto;

import jakarta.persistence.Column;
import lombok.Data;
import uca.ac.elearning.bean.path.Path;

@Data
public class CourseDto {
    private String label;
    private String code;
    private String description;
    private Path path;
}
