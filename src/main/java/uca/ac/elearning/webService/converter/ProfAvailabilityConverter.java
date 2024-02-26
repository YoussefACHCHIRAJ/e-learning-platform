package uca.ac.elearning.webService.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.Admin;
import uca.ac.elearning.bean.ProfAvailability;
import uca.ac.elearning.webService.dto.AdminDto;
import uca.ac.elearning.webService.dto.ProfAvailabilityDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProfAvailabilityConverter {
    private final ModelMapper modelMapper = new ModelMapper();

    public ProfAvailability toBean(ProfAvailabilityDto dto) {
        return modelMapper.map(dto, ProfAvailability.class);
    }

    public List<ProfAvailability> toBean(List<ProfAvailabilityDto> dtos) {
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public ProfAvailabilityDto toDto(ProfAvailability bean) {
        return modelMapper.map(bean, ProfAvailabilityDto.class);
    }

    public List<ProfAvailabilityDto> toDto(List<ProfAvailability> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
