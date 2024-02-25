package uca.ac.elearning.webService.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.Section;
import uca.ac.elearning.webService.dto.SectionDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SectionConverter {
    public Section toBean(SectionDto dto) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(dto, Section.class);
    }

    public List<Section> toBeans(List<SectionDto> Dtos) {
        return Dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public SectionDto toDto(Section bean) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(bean, SectionDto.class);
    }

    public List<SectionDto> toDtos(List<Section> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
    
}
