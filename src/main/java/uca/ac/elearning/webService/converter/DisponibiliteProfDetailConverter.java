package uca.ac.elearning.webService.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.DisponibiliteProfDetail;
import uca.ac.elearning.webService.dto.DisponibiliteProfDetailDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DisponibiliteProfDetailConverter {
    public DisponibiliteProfDetail toBean(DisponibiliteProfDetailDto dto) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(dto, DisponibiliteProfDetail.class);
    }

    public List<DisponibiliteProfDetail> toBeans(List<DisponibiliteProfDetailDto> dtos) {
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public DisponibiliteProfDetailDto toDto(DisponibiliteProfDetail bean) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(bean, DisponibiliteProfDetailDto.class);
    }

    public List<DisponibiliteProfDetailDto> toDtos(List<DisponibiliteProfDetail> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
