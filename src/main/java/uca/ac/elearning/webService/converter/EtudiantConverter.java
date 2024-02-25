package uca.ac.elearning.webService.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.Etudiant;
import uca.ac.elearning.webService.dto.EtudiantDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EtudiantConverter {
    private final ModelMapper modelMapper = new ModelMapper();
    public EtudiantDto toDto(Etudiant etudiant){
        return modelMapper.map(etudiant, EtudiantDto.class);
    }
    public Etudiant toBean(EtudiantDto etudiantDto){
        return modelMapper.map(etudiantDto, Etudiant.class);
    }
    public List<EtudiantDto> toDto(List<Etudiant> etudiants){
        return etudiants.stream().map(this::toDto).collect(Collectors.toList());
    }
    public List<Etudiant> toBean(List<EtudiantDto> etudiantDtos){
        return etudiantDtos.stream().map(this::toBean).collect(Collectors.toList());
    }
}
