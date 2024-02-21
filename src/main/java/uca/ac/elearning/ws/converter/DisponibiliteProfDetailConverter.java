package uca.ac.elearning.ws.converter;

import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.DisponibiliteProfDetail;
import uca.ac.elearning.ws.dto.DisponibiliteProfDetailDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DisponibiliteProfDetailConverter {
    public DisponibiliteProfDetail toBean(DisponibiliteProfDetailDto dto){
        DisponibiliteProfDetail bean = new DisponibiliteProfDetail();
        bean.setId(dto.getId());
        bean.setJour(dto.getJour());
        bean.setTrancheHoraireDebut(dto.getTrancheHoraireDebut());
        bean.setTrancheHoraireFin(dto.getTrancheHoraireFin());
        bean.setDisponibiliteProf(dto.getDisponibiliteProf());
        return bean;
    }

    public List<DisponibiliteProfDetail> toBeans(List<DisponibiliteProfDetailDto> dtos){
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public DisponibiliteProfDetailDto toDto(DisponibiliteProfDetail bean) {
        DisponibiliteProfDetailDto dto = new DisponibiliteProfDetailDto();
        dto.setId(bean.getId());
        dto.setJour(bean.getJour());
        dto.setTrancheHoraireDebut(bean.getTrancheHoraireDebut());
        dto.setTrancheHoraireFin(bean.getTrancheHoraireFin());
        dto.setDisponibiliteProf(bean.getDisponibiliteProf());
        return dto;
    }

    public List<DisponibiliteProfDetailDto> toDtos(List<DisponibiliteProfDetail> beans){
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
