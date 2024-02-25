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
    private final ModelMapper modelMapper = new ModelMapper();
    public InscriptionEtudiantDto toDto(InscriptionEtudiant inscriptionEtudiant){
        return modelMapper.map(inscriptionEtudiant, InscriptionEtudiantDto.class);
    }
    public InscriptionEtudiant toBean(InscriptionEtudiantDto inscriptionEtudiantDto){
        return modelMapper.map(inscriptionEtudiantDto, InscriptionEtudiant.class);
    }
    public List<InscriptionEtudiantDto> toDto(List<InscriptionEtudiant> inscreptionEtudiants){
        return inscreptionEtudiants.stream().map(this::toDto).collect(Collectors.toList());
    }
    public List<InscriptionEtudiant> toBean(List<InscriptionEtudiantDto> inscriptionEtudiantDtos){
        return inscriptionEtudiantDtos.stream().map(this::toBean).collect(Collectors.toList());
    }
}
