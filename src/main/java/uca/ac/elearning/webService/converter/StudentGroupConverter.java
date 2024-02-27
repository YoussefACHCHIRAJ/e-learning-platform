package uca.ac.elearning.webService.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.StudentGroup;
import uca.ac.elearning.webService.dto.StudentGroupDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentGroupConverter {
    private final ModelMapper modelMapper = new ModelMapper();

    public StudentGroup toBean(StudentGroupDto studentGroupDto) {
        return modelMapper.map(studentGroupDto, StudentGroup.class);
    }

    public List<StudentGroup> toBean(List<StudentGroupDto> studentGroupDtos) {
        return studentGroupDtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public StudentGroupDto toDto(StudentGroup studentGroup) {
        return modelMapper.map(studentGroup, StudentGroupDto.class);
    }

    public List<StudentGroupDto> toDto(List<StudentGroup> studentGroups) {
        return studentGroups.stream().map(this::toDto).collect(Collectors.toList());
    }
}
