package uca.ac.elearning.webService.dto.profDto;

import lombok.Data;
import uca.ac.elearning.bean.common.Day;
import uca.ac.elearning.webService.dto.userDto.UserDto;

import java.util.Date;

@Data
public class ProfAvailabilityDto {
    private long id;
    private Day day;
    private UserDto prof;
}