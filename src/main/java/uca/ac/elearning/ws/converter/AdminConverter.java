package uca.ac.elearning.ws.converter;

import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.Admin;
import uca.ac.elearning.ws.dto.AdminDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AdminConverter {
    public Admin toBean(AdminDto dto){
        Admin bean = new Admin();
        bean.setId(dto.getId());
        bean.setUsername(dto.getUsername());
        bean.setEmail(dto.getEmail());
        return bean;
    }

    public List<Admin> toBeans(List<AdminDto> dtos){
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public AdminDto toDto(Admin bean) {
        AdminDto dto = new AdminDto();
        dto.setId(bean.getId());
        dto.setUsername(bean.getUsername());
        dto.setEmail(bean.getEmail());
        return dto;
    }

    public List<AdminDto> toDtos(List<Admin> beans){
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
