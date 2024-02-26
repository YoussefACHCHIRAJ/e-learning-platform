package uca.ac.elearning.webService.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.Path;
import uca.ac.elearning.webService.dto.PathDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PathConverter {
    private final ModelMapper modelMapper = new ModelMapper();

    public Path toBean(PathDto dto) {
        return modelMapper.map(dto, Path.class);
    }

    public List<Path> toBean(List<PathDto> dtos) {
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public PathDto toDto(Path bean) {
        return modelMapper.map(bean, PathDto.class);
    }

    public List<PathDto> toDto(List<Path> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
