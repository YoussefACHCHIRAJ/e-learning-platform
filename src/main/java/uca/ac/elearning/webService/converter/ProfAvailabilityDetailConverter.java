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

    public ProfAvailabilityDetail toBean(ProfAvailabilityDetailDto profAvailabilityDetailDto) {
        return modelMapper.map(profAvailabilityDetailDto, ProfAvailabilityDetail.class);
    }

    public List<ProfAvailabilityDetail> toBean(List<ProfAvailabilityDetailDto> profAvailabilityDetailDtos) {
        return profAvailabilityDetailDtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public ProfAvailabilityDetailDto toDto(ProfAvailabilityDetail profAvailabilityDetail) {
        return modelMapper.map(profAvailabilityDetail, ProfAvailabilityDetailDto.class);
    }

    public List<ProfAvailabilityDetailDto> toDto(List<ProfAvailabilityDetail> profAvailabilityDetails) {
        return profAvailabilityDetails.stream().map(this::toDto).collect(Collectors.toList());
    }
}
