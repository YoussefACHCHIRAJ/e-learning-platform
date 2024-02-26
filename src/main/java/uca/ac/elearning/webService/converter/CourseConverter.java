package uca.ac.elearning.webService.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.Course;
import uca.ac.elearning.webService.dto.CourseDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CourseConverter {
    private final ModelMapper modelMapper = new ModelMapper();

    public Course toBean(CourseDto dto) {
        return modelMapper.map(dto, Course.class);
    }

    public List<Course> toBean(List<CourseDto> Dtos) {
        return Dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public CourseDto toDto(Course bean) {
        return modelMapper.map(bean, CourseDto.class);
    }

    public List<CourseDto> toDto(List<Course> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
