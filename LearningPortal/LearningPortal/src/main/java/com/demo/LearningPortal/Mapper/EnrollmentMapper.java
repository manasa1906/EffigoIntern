<<<<<<< HEAD
package com.demo.LearningPortal.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.demo.LearningPortal.Entities.EnrollmentEntity;
import com.demo.LearningPortal.Entities.UserEntity;
import com.demo.LearningPortal.dto.EnrollmentDto;

@Mapper(componentModel = "spring", uses = {UserMapper.class, CourseMapper.class})
public interface EnrollmentMapper {
EnrollmentMapper MAPPER = Mappers.getMapper(EnrollmentMapper.class);
	UserEntity user = new UserEntity();
	@Mapping(target = "createdOn" , expression = "java(dateTimeformatter.formatTimestamp(user.getCreatedOn()))")
	@Mapping(target = "updatedOn" , expression = "java(dateTimeformatter.formatTimestamp(user.getOn()))")
	@Mapping(source="enrollment.user.userId", target = "User_id")
	EnrollmentDto enrollmentEntityToEnrollmentDto(EnrollmentEntity enrollment);
	EnrollmentEntity enrollmentDtoToEnrollmentEntity(EnrollmentDto enrollmentDto);

}
=======
package com.demo.LearningPortal.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.demo.LearningPortal.Entities.EnrollmentEntity;
import com.demo.LearningPortal.Entities.UserEntity;
import com.demo.LearningPortal.dto.EnrollmentDto;

@Mapper(componentModel = "spring", uses = {UserMapper.class, CourseMapper.class})
public interface EnrollmentMapper {
EnrollmentMapper MAPPER = Mappers.getMapper(EnrollmentMapper.class);
	UserEntity user = new UserEntity();
	@Mapping(target = "createdOn" , expression = "java(dateTimeformatter.formatTimestamp(user.getCreatedOn()))")
	@Mapping(target = "updatedOn" , expression = "java(dateTimeformatter.formatTimestamp(user.getOn()))")
	@Mapping(source="enrollment.user.userId", target = "User_id")
	EnrollmentDto enrollmentEntityToEnrollmentDto(EnrollmentEntity enrollment);
	EnrollmentEntity enrollmentDtoToEnrollmentEntity(EnrollmentDto enrollmentDto);

}
>>>>>>> aea42ef8228639dacf311d0230d00b4371719e8e
