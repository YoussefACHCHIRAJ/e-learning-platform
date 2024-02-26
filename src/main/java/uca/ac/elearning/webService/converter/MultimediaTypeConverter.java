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
    public MultimediaType toBean(MultimediaTypeDto dto) {
        return modelMapper.map(dto, MultimediaType.class);
    }

    public List<MultimediaType> toBean(List<MultimediaTypeDto> dtos) {
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public MultimediaTypeDto toDto(MultimediaType bean) {
        return modelMapper.map(bean, MultimediaTypeDto.class);
    }

    public List<MultimediaTypeDto> toDto(List<MultimediaType> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());

    }
}
