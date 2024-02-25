package uca.ac.elearning.webService.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.Cours;
import uca.ac.elearning.bean.GroupeEtudiantDetail;
import uca.ac.elearning.webService.dto.AdminDto;
import uca.ac.elearning.webService.dto.GroupeEtudiantDetailDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GroupeEtudiantDetailConverter {
    private final ModelMapper modelMapper = new ModelMapper();
    public GroupeEtudiantDetail toBean(GroupeEtudiantDetailDto dto) {
        return modelMapper.map(dto, GroupeEtudiantDetail.class);
    }

    public List<GroupeEtudiantDetail> toBeans(List<GroupeEtudiantDetailDto> dtos) {
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public GroupeEtudiantDetailDto toDto(GroupeEtudiantDetail beans) {
        return modelMapper.map(beans, GroupeEtudiantDetailDto.class);
    }

    public List<GroupeEtudiantDetailDto> toDtos(List<GroupeEtudiantDetail> beans) {
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
