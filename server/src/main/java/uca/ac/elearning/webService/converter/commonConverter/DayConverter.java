package uca.ac.elearning.webService.converter.commonConverter;

import org.modelmapper.ModelMapper;
import uca.ac.elearning.bean.common.Day;
import uca.ac.elearning.webService.dto.commonDto.DayDto;

import java.util.List;
import java.util.stream.Collectors;

public class DayConverter {
    private final ModelMapper modelMapper = new ModelMapper();

    public Day toBean(DayDto dayDto) {
        return modelMapper.map(dayDto, Day.class);
    }

    public List<Day> toBean(List<DayDto> dayDtos) {
        return dayDtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public DayDto toDto(Day day) {
        return modelMapper.map(day, DayDto.class);
    }

    public List<DayDto> toDto(List<Day> days) {
        return days.stream().map(this::toDto).collect(Collectors.toList());
    }
}
