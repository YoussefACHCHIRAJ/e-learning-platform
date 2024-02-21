package uca.ac.elearning.webService.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.Category;
import uca.ac.elearning.webService.dto.CategoryDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategoryConverter {
    public Category toBean(CategoryDto dto){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(dto, Category.class);
    }

    public List<Category> toBeans(List<CategoryDto> dtos){
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public CategoryDto toDto(Category bean) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(bean,CategoryDto.class);
    }

    public List<CategoryDto> toDtos(List<Category> beans){
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
