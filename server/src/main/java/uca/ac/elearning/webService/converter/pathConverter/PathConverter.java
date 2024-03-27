package uca.ac.elearning.webService.converter.pathConverter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.path.Path;
import uca.ac.elearning.webService.dto.pathDto.PathDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PathConverter {
    private final ModelMapper modelMapper = new ModelMapper();

    public Path toBean(PathDto pathDto) {
        return modelMapper.map(pathDto, Path.class);
    }

    public List<Path> toBeans(List<PathDto> pathDtos) {
        return pathDtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public PathDto toDto(Path path) {
        return modelMapper.map(path, PathDto.class);
    }

    public List<PathDto> toDtos(List<Path> paths) {
        return paths.stream().map(this::toDto).collect(Collectors.toList());
    }
}
