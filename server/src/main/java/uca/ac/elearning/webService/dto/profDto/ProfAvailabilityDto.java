package uca.ac.elearning.webService.dto.profDto;

import lombok.Data;
import uca.ac.elearning.webService.dto.userDto.UserDto;

import java.util.Date;

@Data
public class ProfAvailabilityDto {
    private long id;
    private Date startDate;
    private Date endDate;
    private UserDto prof;
}