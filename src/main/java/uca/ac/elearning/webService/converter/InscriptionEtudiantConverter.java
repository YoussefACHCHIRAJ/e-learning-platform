package uca.ac.elearning.webService.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.Etudiant;
import uca.ac.elearning.bean.InscriptionEtudiant;
import uca.ac.elearning.webService.dto.EtudiantDto;
import uca.ac.elearning.webService.dto.InscriptionEtudiantDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class InscriptionEtudiantConverter {

    public InscriptionEtudiantDto toDto(InscriptionEtudiant inscriptionEtudiant){
        return (new ModelMapper()).map(inscriptionEtudiant, InscriptionEtudiantDto.class);
    }
    public InscriptionEtudiant toBean(InscriptionEtudiantDto inscriptionEtudiantDto){
        return (new ModelMapper()).map(inscriptionEtudiantDto, InscriptionEtudiant.class);
    }
    public List<InscriptionEtudiantDto> toDtos(List<InscriptionEtudiant> inscreptionEtudiants){
        return inscreptionEtudiants.stream().map(this::toDto).collect(Collectors.toList());
    }
    public List<InscriptionEtudiant> toBeans(List<InscriptionEtudiantDto> inscriptionEtudiantDtos){
        return inscriptionEtudiantDtos.stream().map(this::toBean).collect(Collectors.toList());
    }
}
