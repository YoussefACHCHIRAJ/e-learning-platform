package uca.ac.elearning.webService.converter.commonConverter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.common.CategorySection;
import uca.ac.elearning.webService.dto.commonDto.CategoryDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategoryConverter {

    private final ModelMapper modelMapper = new ModelMapper();

    public CategorySection toBean(CategoryDto categoryDto) {
        return modelMapper.map(categoryDto, CategorySection.class);
    }

    public List<CategorySection> toBean(List<CategoryDto> categoryDtos) {
        return categoryDtos.stream().map(this::toBean).collect(Collectors.toList());
    }

    public CategoryDto toDto(CategorySection category) {
        return modelMapper.map(category, CategoryDto.class);
    }

    public List<CategoryDto> toDto(List<CategorySection> categories) {
        return categories.stream().map(this::toDto).collect(Collectors.toList());
    }
}
