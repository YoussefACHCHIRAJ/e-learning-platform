package uca.ac.elearning.webService.converter.usersConverter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.student.StudentGroup;
import uca.ac.elearning.bean.users.User;
import uca.ac.elearning.webService.dto.studentDto.StudentGroupDto;
import uca.ac.elearning.webService.dto.userDto.UserDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserConverter {

    private final ModelMapper modelMapper = new ModelMapper();

    public User toBean(UserDto userDto) {
        return modelMapper.map(userDto, User.class);
    }

    public List<User> toBean(List<UserDto> userDtos) {
        return userDtos.stream().map(this::toBean).toList();
    }

    public UserDto toDto(User user) {
        return modelMapper.map(user, UserDto.class);
    }

    public List<UserDto> toDto(List<User> users) {
        return users.stream().map(this::toDto).toList();
    }
}
