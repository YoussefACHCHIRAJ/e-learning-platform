package uca.ac.elearning.webService.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.Path;
import uca.ac.elearning.webService.dto.ParcoursDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ParcoursConverter {
    private final ModelMapper modelMapper = new ModelMapper();
    public Path toBean(ParcoursDto dto) {
        return modelMapper.map(dto, Path.class);
    }

    public List<Path> toBean(List<ParcoursDto> dtos) {
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public ParcoursDto toDto(Path bean) {
        return modelMapper.map(bean, ParcoursDto.class);
    }

    public List<ParcoursDto> toDto(List<Path> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
