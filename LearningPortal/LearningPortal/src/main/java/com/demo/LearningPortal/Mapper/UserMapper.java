<<<<<<< HEAD
package com.demo.LearningPortal.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.demo.LearningPortal.Entities.UserEntity;
import com.demo.LearningPortal.dto.UserDto;

@Mapper(componentModel = "spring")

public interface UserMapper {
UserMapper MAPPER = Mappers.getMapper(UserMapper.class);

    UserEntity user=new UserEntity();
    
	@Mapping(target = "createdOn" , expression = "java(dateTimeformatter.formatTimestamp(user.getCreatedOn()))")
	@Mapping(target = "updatedOn" , expression = "java(dateTimeformatter.formatTimestamp(user.getUpdatedOn()))")
	@Mapping(source="user.role", target="role")
	UserDto userEntityToUserDto(UserEntity user);
    UserEntity userDtoToUserEntity(UserDto userdto);
	
	
}
=======
package com.demo.LearningPortal.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.demo.LearningPortal.Entities.UserEntity;
import com.demo.LearningPortal.dto.UserDto;

@Mapper(componentModel = "spring")

public interface UserMapper {
UserMapper MAPPER = Mappers.getMapper(UserMapper.class);

    UserEntity user=new UserEntity();
    
	@Mapping(target = "createdOn" , expression = "java(dateTimeformatter.formatTimestamp(user.getCreatedOn()))")
	@Mapping(target = "updatedOn" , expression = "java(dateTimeformatter.formatTimestamp(user.getUpdatedOn()))")
	@Mapping(source="user.role", target="role")
	UserDto userEntityToUserDto(UserEntity user);
    UserEntity userDtoToUserEntity(UserDto userdto);
	
	
}
>>>>>>> aea42ef8228639dacf311d0230d00b4371719e8e
