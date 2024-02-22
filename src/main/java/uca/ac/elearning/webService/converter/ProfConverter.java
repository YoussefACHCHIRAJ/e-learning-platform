package uca.ac.elearning.webService.converter;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.Prof;
import uca.ac.elearning.webService.dto.ProfDto;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProfConverter {
    public Prof toBean(ProfDto dto) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(dto, Prof.class);
    }

    public List<Prof> toBeans(List<ProfDto> Dtos) {
        return Dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public ProfDto toDto(Prof bean) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(bean, ProfDto.class);
    }

    public List<ProfDto> toDtos(List<Prof> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
