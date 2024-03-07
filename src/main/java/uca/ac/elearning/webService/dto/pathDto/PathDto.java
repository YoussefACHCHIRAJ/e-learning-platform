package uca.ac.elearning.webService.dto.pathDto;

import lombok.Data;
import uca.ac.elearning.bean.common.Admin;
import uca.ac.elearning.bean.path.PathStatus;

@Data
public class PathDto {
    private long id;
    private String label;
    private String description;
    private PathStatus pathStatus;
    private Admin admin;

}
