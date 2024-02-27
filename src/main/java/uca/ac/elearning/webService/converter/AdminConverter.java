package uca.ac.elearning.webService.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.Admin;
import uca.ac.elearning.webService.dto.AdminDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AdminConverter {
    private final ModelMapper modelMapper = new ModelMapper();

    public Admin toBean(AdminDto adminDto) {
        return modelMapper.map(adminDto, Admin.class);
    }

    public List<Admin> toBean(List<AdminDto> adminDtos) {
        return adminDtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public AdminDto toDto(Admin admin) {
        return modelMapper.map(admin, AdminDto.class);
    }

    public List<AdminDto> toDto(List<Admin> admins) {
        return admins.stream().map(this::toDto).collect(Collectors.toList());
    }
}
