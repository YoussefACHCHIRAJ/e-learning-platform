package uca.ac.elearning.webService.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.StudentGroupDetail;
import uca.ac.elearning.webService.dto.StudentGroupDetailDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentGroupDetailConverter {
    private final ModelMapper modelMapper = new ModelMapper();

    public StudentGroupDetail toBean(StudentGroupDetailDto dto) {
        return modelMapper.map(dto, StudentGroupDetail.class);
    }

    public List<StudentGroupDetail> toBeans(List<StudentGroupDetailDto> dtos) {
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public StudentGroupDetailDto toDto(StudentGroupDetail beans) {
        return modelMapper.map(beans, StudentGroupDetailDto.class);
    }

    public List<StudentGroupDetailDto> toDtos(List<StudentGroupDetail> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
