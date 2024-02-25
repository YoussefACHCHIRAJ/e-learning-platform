package uca.ac.elearning.webService.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.Category;
import uca.ac.elearning.webService.dto.CategoryDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategoryConverter {

    private final ModelMapper modelMapper = new ModelMapper();
    public Category toBean(CategoryDto dto){
        return modelMapper.map(dto, Category.class);
    }

    public List<Category> toBean(List<CategoryDto> dtos){
        return dtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public CategoryDto toDto(Category bean) {
        return modelMapper.map(bean,CategoryDto.class);
    }

    public List<CategoryDto> toDto(List<Category> beans){
        return beans.stream().map(this::toDto).collect(Collectors.toList());
    }
}
