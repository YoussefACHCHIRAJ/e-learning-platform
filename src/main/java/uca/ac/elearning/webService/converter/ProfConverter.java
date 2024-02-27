package uca.ac.elearning.webService.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.Prof;
import uca.ac.elearning.webService.dto.ProfDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProfConverter {
    private final ModelMapper modelMapper = new ModelMapper();

    public Prof toBean(ProfDto profDto) {
        return modelMapper.map(profDto, Prof.class);
    }

    public List<Prof> toBean(List<ProfDto> profDtos) {
        return profDtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public ProfDto toDto(Prof prof) {
        return modelMapper.map(prof, ProfDto.class);
    }

    public List<ProfDto> toDto(List<Prof> profs) {
        return profs.stream().map(this::toDto).collect(Collectors.toList());
    }
}
