package uca.ac.elearning.utils;

import lombok.Data;

import java.time.LocalTime;

@Data
public class RequestProfAvailabilityDetail {
    private String dayCode;
    private LocalTime startTimeSlot;
    private LocalTime endTimeSlot;
}
