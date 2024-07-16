package com.demo.LearningPortal.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.demo.LearningPortal.dto.CourseDto;
import com.demo.LearningPortal.dto.EnrollmentDto;
import com.demo.LearningPortal.entities.CourseEntity;
import com.demo.LearningPortal.entities.EnrollmentEntity;
@Mapper(componentModel = "spring")
public interface EnrollmentMapper extends EntityMapper<EnrollmentDto,EnrollmentEntity> {
	EnrollmentDto toDto(EnrollmentEntity entity);
	EnrollmentEntity toEntity(EnrollmentDto dto);
	List<EnrollmentDto> toDto(List<EnrollmentEntity> entitylist);
	List<EnrollmentEntity> toEntity(List<EnrollmentDto> dtolist);
}
