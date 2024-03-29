package uca.ac.elearning.webService.converter.profConverter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.prof.ProfAvailability;
import uca.ac.elearning.webService.dto.profDto.ProfAvailabilityDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProfAvailabilityConverter {
    private final ModelMapper modelMapper = new ModelMapper();

    public ProfAvailability toBean(ProfAvailabilityDto profAvailabilityDto) {
        return modelMapper.map(profAvailabilityDto, ProfAvailability.class);
    }

    public List<ProfAvailability> toBean(List<ProfAvailabilityDto> profAvailabilityDtos) {
        return profAvailabilityDtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public ProfAvailabilityDto toDto(ProfAvailability profAvailability) {
        return modelMapper.map(profAvailability, ProfAvailabilityDto.class);
    }

    public List<ProfAvailabilityDto> toDto(List<ProfAvailability> profAvailabilities) {
        return profAvailabilities.stream().map(this::toDto).collect(Collectors.toList());
    }
}
