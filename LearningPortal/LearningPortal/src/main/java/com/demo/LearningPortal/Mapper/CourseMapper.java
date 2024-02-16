package com.demo.LearningPortal.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.demo.LearningPortal.Entities.CourseEntity;
import com.demo.LearningPortal.Entities.UserEntity;
import com.demo.LearningPortal.dto.CourseDto;


@Mapper(componentModel = "spring")
public interface CourseMapper {
  CourseMapper MAPPER = Mappers.getMapper(CourseMapper.class);
 CourseEntity course = new CourseEntity();
    @Mapping(target = "createdOn" , expression = "java(dateTimeformatter.formatTimestamp(course.getCreatedOn()))")
	@Mapping(target = "updatedOn" , expression = "java(dateTimeformatter.formatTimestamp(course.getupdatedOn()))")
	CourseDto courseEntityToCourseDto(CourseEntity course);
	CourseEntity courseDtoToCourseentity(CourseDto course);

}
