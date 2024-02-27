package uca.ac.elearning.webService.converter;

import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.MultimediaType;

import org.modelmapper.ModelMapper;
import uca.ac.elearning.webService.dto.MultimediaTypeDto;


import java.util.List;
import java.util.stream.Collectors;

@Component
public class MultimediaTypeConverter {
    private final ModelMapper modelMapper = new ModelMapper();

    public MultimediaType toBean(MultimediaTypeDto multimediaTypeDto) {
        return modelMapper.map(multimediaTypeDto, MultimediaType.class);
    }

    public List<MultimediaType> toBean(List<MultimediaTypeDto> multimediaTypeDtos) {
        return multimediaTypeDtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public MultimediaTypeDto toDto(MultimediaType multimediaType) {
        return modelMapper.map(multimediaType, MultimediaTypeDto.class);
    }

    public List<MultimediaTypeDto> toDto(List<MultimediaType> multimediaTypes) {
        return multimediaTypes.stream().map(this::toDto).collect(Collectors.toList());

    }
}
