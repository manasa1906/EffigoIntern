package com.demo.LearningPortal.mappers;

import java.util.List;
import org.mapstruct.Mapper;
import com.demo.LearningPortal.dto.CourseDto;
import com.demo.LearningPortal.dto.FavouriteDto;
import com.demo.LearningPortal.entities.CourseEntity;
import com.demo.LearningPortal.entities.FavouriteEntity;
@Mapper(componentModel = "spring")
public interface CourseMapper extends EntityMapper<CourseDto,CourseEntity>{
	CourseDto toDto(CourseEntity entity);
	CourseEntity toEntity(CourseDto dto);
	List<CourseDto> toDto(List<CourseEntity> entitylist);
	List<CourseEntity> toEntity(List<CourseDto> dtolist);
}
