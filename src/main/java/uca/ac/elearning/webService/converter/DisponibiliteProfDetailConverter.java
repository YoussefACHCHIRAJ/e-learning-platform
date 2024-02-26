package uca.ac.elearning.webService.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.ProfAvailabilityDetail;
import uca.ac.elearning.webService.dto.DisponibiliteProfDetailDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DisponibiliteProfDetailConverter {
    private final ModelMapper modelMapper = new ModelMapper();
    public ProfAvailabilityDetail toBean(DisponibiliteProfDetailDto dto) {
        return modelMapper.map(dto, ProfAvailabilityDetail.class);
    }

    public List<ProfAvailabilityDetail> toBeans(List<DisponibiliteProfDetailDto> dtos) {
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public DisponibiliteProfDetailDto toDto(ProfAvailabilityDetail bean) {
        return modelMapper.map(bean, DisponibiliteProfDetailDto.class);
    }

    public List<DisponibiliteProfDetailDto> toDtos(List<ProfAvailabilityDetail> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
