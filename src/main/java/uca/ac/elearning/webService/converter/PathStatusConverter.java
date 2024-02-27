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

    public PathStatus toBean(PathStatusDto pathStatusDto) {
        return modelMapper.map(pathStatusDto, PathStatus.class);
    }

    public List<PathStatus> toBean(List<PathStatusDto> pathStatusDtos) {
        return pathStatusDtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public PathStatusDto toDto(PathStatus pathStatus) {
        return modelMapper.map(pathStatus, PathStatusDto.class);
    }

    public List<PathStatusDto> toDto(List<PathStatus> pathStatuses) {
        return pathStatuses.stream().map(this::toDto).collect(Collectors.toList());
    }
}
