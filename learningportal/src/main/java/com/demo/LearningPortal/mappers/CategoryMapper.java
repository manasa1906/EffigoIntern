package com.demo.LearningPortal.mappers;

import java.util.List;
import org.mapstruct.Mapper;
import com.demo.LearningPortal.dto.CategoryDto;
import com.demo.LearningPortal.entities.CategoryEntity;

@Mapper(componentModel = "spring")
public interface CategoryMapper extends EntityMapper<CategoryDto,CategoryEntity> {
	CategoryDto toDto(CategoryEntity entity);
	CategoryEntity toEntity(CategoryDto dto);
	List<CategoryDto> toDto(List<CategoryEntity> entitylist);
	List<CategoryEntity> toEntity(List<CategoryDto> dtolist);
}
