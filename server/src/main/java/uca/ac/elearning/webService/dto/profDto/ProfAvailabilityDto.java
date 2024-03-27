package uca.ac.elearning.webService.dto.profDto;

import lombok.Data;
import uca.ac.elearning.bean.users.User;

import java.util.Date;

@Data
public class ProfAvailabilityDto {
    private long id;
    private Date startDate;
    private Date endDate;
    private User prof;
}