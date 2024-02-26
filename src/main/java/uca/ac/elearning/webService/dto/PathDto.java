package uca.ac.elearning.webService.dto;

import lombok.Data;
import uca.ac.elearning.bean.Admin;
import uca.ac.elearning.bean.PathStatus;

@Data
public class PathDto {
    private long id;
    private String label;
    private String description;
    private PathStatus pathStatus;
    private Admin admin;

}
