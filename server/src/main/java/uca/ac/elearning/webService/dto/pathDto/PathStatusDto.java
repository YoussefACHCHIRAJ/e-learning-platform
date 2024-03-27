package uca.ac.elearning.webService.dto.pathDto;


import lombok.Data;
import uca.ac.elearning.bean.path.Path;

import java.util.List;

@Data
public class PathStatusDto {
    private long id;
    private String label;
    private String code;
    private List<Path> paths;
}
