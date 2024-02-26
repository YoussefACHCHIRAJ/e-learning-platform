package uca.ac.elearning.webService.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.ProfAvailabilityDetail;
import uca.ac.elearning.webService.dto.ProfAvailabilityDetailDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProfAvailabilityDetailConverter {
    private final ModelMapper modelMapper = new ModelMapper();

    public ProfAvailabilityDetail toBean(ProfAvailabilityDetailDto dto) {
        return modelMapper.map(dto, ProfAvailabilityDetail.class);
    }

    public List<ProfAvailabilityDetail> toBeans(List<ProfAvailabilityDetailDto> dtos) {
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public ProfAvailabilityDetailDto toDto(ProfAvailabilityDetail bean) {
        return modelMapper.map(bean, ProfAvailabilityDetailDto.class);
    }

    public List<ProfAvailabilityDetailDto> toDtos(List<ProfAvailabilityDetail> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
