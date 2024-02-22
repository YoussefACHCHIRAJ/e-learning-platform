package uca.ac.elearning.webService.converter;

import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.TypeMutimedia;
import org.modelmapper.ModelMapper;
import uca.ac.elearning.webService.dto.TypeMultimediaDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TypeMultimediaConverter {

    public TypeMutimedia toBean(TypeMultimediaDto dto) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(dto, TypeMutimedia.class);
    }

    public List<TypeMutimedia> toBeans(List<TypeMultimediaDto> dtos) {
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public TypeMultimediaDto toDto(TypeMutimedia bean) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(bean, TypeMultimediaDto.class);
    }

    public List<TypeMultimediaDto> toDtos(List<TypeMutimedia> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());

    }
}
