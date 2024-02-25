package uca.ac.elearning.webService.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import uca.ac.elearning.bean.DisponibiliteProf;
import uca.ac.elearning.webService.dto.DisponibiliteProfDto;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class DisponibiliteProfConverter {
    private final ModelMapper modelMapper = new ModelMapper();
    public DisponibiliteProf toBean(DisponibiliteProfDto dto) {
        return modelMapper.map(dto, DisponibiliteProf.class);
    }

    public List<DisponibiliteProf> toBean(List<DisponibiliteProfDto> dtos) {
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public DisponibiliteProfDto toDto(DisponibiliteProf bean) {
        return modelMapper.map(bean, DisponibiliteProfDto.class);
    }

    public List<DisponibiliteProfDto> toDto(List<DisponibiliteProf> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
