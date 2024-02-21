package uca.ac.elearning.webService.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.Etudiant;
import uca.ac.elearning.webService.dto.EtudiantDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EtudiantConverter {

    public EtudiantDto toDto(Etudiant etudiant){
        return (new ModelMapper()).map(etudiant, EtudiantDto.class);
    }
    public Etudiant toBean(EtudiantDto etudiantDto){
        return (new ModelMapper()).map(etudiantDto, Etudiant.class);
    }
    public List<EtudiantDto> toDtos(List<Etudiant> etudiants){
        return etudiants.stream().map(this::toDto).collect(Collectors.toList());
    }
    public List<Etudiant> toBeans(List<EtudiantDto> etudiantDtos){
        return etudiantDtos.stream().map(this::toBean).collect(Collectors.toList());
    }
}
