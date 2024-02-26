package uca.ac.elearning.webService.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.PathStatus;
import uca.ac.elearning.webService.dto.EtatParcoursDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EtatParcoursConverter {
    private final ModelMapper modelMapper = new ModelMapper();
    public PathStatus toBean(EtatParcoursDto dto) {
        return modelMapper.map(dto, PathStatus.class);
    }

    public List<PathStatus> toBean(List<EtatParcoursDto> dtos) {
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public EtatParcoursDto toDto(PathStatus bean) {
        return modelMapper.map(bean, EtatParcoursDto.class);
    }

    public List<EtatParcoursDto> toDto(List<PathStatus> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
