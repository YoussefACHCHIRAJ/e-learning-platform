package uca.ac.elearning.webService.converter.pathConverter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.path.Course;
import uca.ac.elearning.webService.dto.pathDto.CourseDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CourseConverter {
    private final ModelMapper modelMapper = new ModelMapper();

    public Course toBean(CourseDto courseDto) {
        return modelMapper.map(courseDto, Course.class);
    }

    public List<Course> toBean(List<CourseDto> courseDtos) {
        return courseDtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public CourseDto toDto(Course course) {
        return modelMapper.map(course, CourseDto.class);
    }

    public List<CourseDto> toDto(List<Course> courses) {
        return courses.stream().map(this::toDto).collect(Collectors.toList());
    }
}
