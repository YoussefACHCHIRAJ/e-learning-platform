package uca.ac.elearning.webService.converter.userConverter;


import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.student.User;
import uca.ac.elearning.webService.dto.studentDto.StudentGroupDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserConverter {
    private final ModelMapper modelMapper = new ModelMapper();

    public User toBean(StudentGroupDto studentGroupDto) {
        return modelMapper.map(studentGroupDto, User.class);
    }

    public List<User> toBean(List<StudentGroupDto> studentGroupDtos) {
        return studentGroupDtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public StudentGroupDto toDto(User studentGroup) {
        return modelMapper.map(studentGroup, StudentGroupDto.class);
    }

    public List<StudentGroupDto> toDto(List<User> studentGroups) {
        return studentGroups.stream().map(this::toDto).collect(Collectors.toList());
    }
}
