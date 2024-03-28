package uca.ac.elearning.webService.dto.pathDto;

import lombok.Data;
import uca.ac.elearning.bean.path.PathStatus;
import uca.ac.elearning.webService.dto.userDto.UserDto;

@Data
public class PathDto {
    private long id;
    private String label;
    private String description;
    private PathStatus pathStatus;
    private UserDto admin;

}
