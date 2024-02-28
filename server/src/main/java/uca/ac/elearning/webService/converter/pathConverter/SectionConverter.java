package uca.ac.elearning.webService.converter.pathConverter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.path.Section;
import uca.ac.elearning.webService.dto.pathDto.SectionDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SectionConverter {
    private final ModelMapper modelMapper = new ModelMapper();

    public Section toBean(SectionDto sectionDto) {
        return modelMapper.map(sectionDto, Section.class);
    }

    public List<Section> toBean(List<SectionDto> sectionDtos) {
        return sectionDtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public SectionDto toDto(Section section) {
        return modelMapper.map(section, SectionDto.class);
    }

    public List<SectionDto> toDto(List<Section> sections) {
        return sections.stream().map(this::toDto).collect(Collectors.toList());
    }

}
