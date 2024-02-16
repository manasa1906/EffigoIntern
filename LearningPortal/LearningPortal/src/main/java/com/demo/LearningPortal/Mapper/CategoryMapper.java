package com.demo.LearningPortal.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.demo.LearningPortal.Entities.CategoryEntity;
import com.demo.LearningPortal.Entities.UserEntity;
import com.demo.LearningPortal.dto.CategoryDto;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
	
CategoryMapper MAPPER =Mappers.getMapper(CategoryMapper.class);
UserEntity user=new UserEntity();
@Mapping(target = "createdOn" , expression = "java(dateTimeformatter.formatTimestamp(user.getCreatedOn()))")
@Mapping(target = "updatedOn" , expression = "java(dateTimeformatter.formatTimestamp(user.getupdatedOn()))")
	CategoryDto categoryEntityTocategoryDto(CategoryEntity category);
	CategoryEntity categoryDtoTocategoryEntity(CategoryDto category);
}
