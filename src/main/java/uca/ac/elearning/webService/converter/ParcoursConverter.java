package uca.ac.elearning.webService.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.Parcours;
import uca.ac.elearning.webService.dto.ParcoursDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ParcoursConverter {
    private final ModelMapper modelMapper = new ModelMapper();
    public Parcours toBean(ParcoursDto dto) {
        return modelMapper.map(dto, Parcours.class);
    }

    public List<Parcours> toBean(List<ParcoursDto> dtos) {
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public ParcoursDto toDto(Parcours bean) {
        return modelMapper.map(bean, ParcoursDto.class);
    }

    public List<ParcoursDto> toDto(List<Parcours> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
