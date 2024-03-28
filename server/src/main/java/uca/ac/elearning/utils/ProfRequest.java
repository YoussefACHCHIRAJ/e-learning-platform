package uca.ac.elearning.utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProfRequest {
    private String profEmail;
    private List<RequestProfAvailabilityDetail> profAvailabilitiesDetails;
}

