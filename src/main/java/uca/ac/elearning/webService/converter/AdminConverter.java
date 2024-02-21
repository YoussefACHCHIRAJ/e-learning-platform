package uca.ac.elearning.webService.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.Admin;
import uca.ac.elearning.webService.dto.AdminDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AdminConverter {
    public Admin toBean(AdminDto dto) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(dto, Admin.class);
    }

    public List<Admin> toBeans(List<AdminDto> dtos) {
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public AdminDto toDto(Admin bean) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(bean, AdminDto.class);
    }

    public List<AdminDto> toDtos(List<Admin> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
