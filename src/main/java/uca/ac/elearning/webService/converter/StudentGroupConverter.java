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

    public StudentGroup toBean(StudentGroupDto dto) {
        return modelMapper.map(dto, StudentGroup.class);
    }

    public List<StudentGroup> toBean(List<StudentGroupDto> Dtos) {
        return Dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public StudentGroupDto toDto(StudentGroup bean) {
        return modelMapper.map(bean, StudentGroupDto.class);
    }

    public List<StudentGroupDto> toDto(List<StudentGroup> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
