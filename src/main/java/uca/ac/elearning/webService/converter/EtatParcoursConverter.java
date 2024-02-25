package uca.ac.elearning.webService.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.EtatParcours;
import uca.ac.elearning.webService.dto.EtatParcoursDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EtatParcoursConverter {
    public EtatParcours toBean(EtatParcoursDto dto) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(dto, EtatParcours.class);
    }

    public List<EtatParcours> toBeans(List<EtatParcoursDto> dtos) {
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public EtatParcoursDto toDto(EtatParcours bean) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(bean, EtatParcoursDto.class);
    }

    public List<EtatParcoursDto> toDtos(List<EtatParcours> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
