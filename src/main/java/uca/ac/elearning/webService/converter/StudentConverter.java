package uca.ac.elearning.webService.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.Student;
import uca.ac.elearning.webService.dto.StudentDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentConverter {
    private final ModelMapper modelMapper = new ModelMapper();

    public StudentDto toDto(Student student) {
        return modelMapper.map(student, StudentDto.class);
    }

    public List<StudentDto> toDto(List<Student> students) {
        return students.stream().map(this::toDto).collect(Collectors.toList());
    }

    public Student toBean(StudentDto studentDto) {
        return modelMapper.map(studentDto, Student.class);
    }

    public List<Student> toBean(List<StudentDto> studentsDtos) {
        return studentsDtos.stream().map(this::toBean).collect(Collectors.toList());
    }
}
