package uca.ac.elearning.webService.dto.pathDto;

import lombok.Data;
import uca.ac.elearning.bean.path.Path;

@Data
public class CourseDto {
    private String label;
    private String code;
    private Path path;
}
