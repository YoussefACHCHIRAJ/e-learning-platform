package uca.ac.elearning.webService.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.GroupeEtudiant;
import uca.ac.elearning.webService.dto.GroupeEtudiantDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GroupeEtudiantConverter {
    public GroupeEtudiant toBean(GroupeEtudiantDto dto) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(dto, GroupeEtudiant.class);
    }

    public List<GroupeEtudiant> toBeans(List<GroupeEtudiantDto> Dtos) {
        return Dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public GroupeEtudiantDto toDto(GroupeEtudiant bean) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(bean, GroupeEtudiantDto.class);
    }

    public List<GroupeEtudiantDto> toDtos(List<GroupeEtudiant> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
