package uca.ac.elearning.webService.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.PathStatus;
import uca.ac.elearning.webService.dto.PathStatusDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PathStatusConverter {
    private final ModelMapper modelMapper = new ModelMapper();

    public PathStatus toBean(PathStatusDto dto) {
        return modelMapper.map(dto, PathStatus.class);
    }

    public List<PathStatus> toBean(List<PathStatusDto> dtos) {
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public PathStatusDto toDto(PathStatus bean) {
        return modelMapper.map(bean, PathStatusDto.class);
    }

    public List<PathStatusDto> toDto(List<PathStatus> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
