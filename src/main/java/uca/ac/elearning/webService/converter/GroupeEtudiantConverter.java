package uca.ac.elearning.webService.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.GroupeEtudiant;
import uca.ac.elearning.webService.dto.GroupeEtudiantDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GroupeEtudiantConverter {
    private final ModelMapper modelMapper = new ModelMapper();
    public GroupeEtudiant toBean(GroupeEtudiantDto dto) {
        return modelMapper.map(dto, GroupeEtudiant.class);
    }

    public List<GroupeEtudiant> toBean(List<GroupeEtudiantDto> Dtos) {
        return Dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public GroupeEtudiantDto toDto(GroupeEtudiant bean) {
        return modelMapper.map(bean, GroupeEtudiantDto.class);
    }

    public List<GroupeEtudiantDto> toDto(List<GroupeEtudiant> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
