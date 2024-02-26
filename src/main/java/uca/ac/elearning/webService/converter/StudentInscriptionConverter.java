package uca.ac.elearning.webService.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.StudentInscription;
import uca.ac.elearning.webService.dto.StudentInscriptionDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentInscriptionConverter {
    private final ModelMapper modelMapper = new ModelMapper();
    public StudentInscriptionDto toDto(StudentInscription studentInscription){
        return modelMapper.map(studentInscription, StudentInscriptionDto.class);
    }
    public StudentInscription toBean(StudentInscriptionDto studentInscriptionDto){
        return modelMapper.map(studentInscriptionDto, StudentInscription.class);
    }
    public List<StudentInscriptionDto> toDto(List<StudentInscription> studentsInscription){
        return studentsInscription.stream().map(this::toDto).collect(Collectors.toList());
    }
    public List<StudentInscription> toBean(List<StudentInscriptionDto> studentsInscriptionDtos){
        return studentsInscriptionDtos.stream().map(this::toBean).collect(Collectors.toList());
    }
}
