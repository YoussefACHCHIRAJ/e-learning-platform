package uca.ac.elearning.ws.converter;

import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.Category;
import uca.ac.elearning.ws.dto.CategoryDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategoryConverter {
    public Category toBean(CategoryDto dto){
        Category bean = new Category();
        bean.setId(dto.getId());
        bean.setLibelle(dto.getLibelle());
        bean.setCode(dto.getCode());
        return bean;
    }

    public List<Category> toBeans(List<CategoryDto> dtos){
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public CategoryDto toDto(Category bean) {
        CategoryDto dto = new CategoryDto();
        dto.setId(bean.getId());
        dto.setLibelle(bean.getLibelle());
        dto.setCode(bean.getCode());
        return dto;
    }

    public List<CategoryDto> toDtos(List<Category> beans){
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
