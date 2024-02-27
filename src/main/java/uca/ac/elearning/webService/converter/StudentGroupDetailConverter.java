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

    public StudentGroupDetail toBean(StudentGroupDetailDto studentGroupDetailDto) {
        return modelMapper.map(studentGroupDetailDto, StudentGroupDetail.class);
    }

    public List<StudentGroupDetail> toBean(List<StudentGroupDetailDto> studentGroupDetailDtos) {
        return studentGroupDetailDtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public StudentGroupDetailDto toDto(StudentGroupDetail studentGroupDetail) {
        return modelMapper.map(studentGroupDetail, StudentGroupDetailDto.class);
    }

    public List<StudentGroupDetailDto> toDto(List<StudentGroupDetail> studentGroupDetails) {
        return studentGroupDetails.stream().map(this::toDto).collect(Collectors.toList());
    }
}
