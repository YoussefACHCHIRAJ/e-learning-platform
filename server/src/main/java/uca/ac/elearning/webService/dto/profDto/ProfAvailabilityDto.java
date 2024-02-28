package uca.ac.elearning.webService.dto.profDto;

import lombok.Data;

import java.util.Date;

@Data
public class ProfAvailabilityDto {
    private long id;
    private Date startDate;
    private Date endDate;
}
