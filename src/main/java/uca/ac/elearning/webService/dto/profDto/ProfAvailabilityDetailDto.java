package uca.ac.elearning.webService.dto.profDto;

import lombok.Data;
import uca.ac.elearning.bean.prof.ProfAvailability;

import java.util.Date;

@Data
public class ProfAvailabilityDetailDto {
    private long id;
    private String jour;
    private Date startTimeSlot;
    private Date endTimeSlot;
    private ProfAvailability profAvailability;
}
