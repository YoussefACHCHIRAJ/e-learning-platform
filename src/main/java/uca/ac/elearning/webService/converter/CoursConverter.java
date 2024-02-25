package uca.ac.elearning.webService.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.Admin;
import uca.ac.elearning.bean.Cours;
import uca.ac.elearning.webService.dto.AdminDto;
import uca.ac.elearning.webService.dto.CoursDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CoursConverter {
    private final ModelMapper modelMapper = new ModelMapper();
    public Cours toBean(CoursDto dto) {
        return modelMapper.map(dto, Cours.class);
    }

    public List<Cours> toBean(List<CoursDto> Dtos) {
        return Dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public CoursDto toDto(Cours bean) {
        return modelMapper.map(bean, CoursDto.class);
    }

    public List<CoursDto> toDto(List<Cours> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
