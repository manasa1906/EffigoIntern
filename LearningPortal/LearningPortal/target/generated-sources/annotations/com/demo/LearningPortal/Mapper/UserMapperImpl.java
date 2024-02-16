package com.demo.LearningPortal.Mapper;

import com.demo.LearningPortal.Entities.UserEntity;
import com.demo.LearningPortal.dto.UserDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-16T20:14:54+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240129-0421, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto userEntityToUserDto(UserEntity user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setRole( user.getRole() );
        userDto.setUsername( user.getUsername() );
        userDto.setPassword( user.getPassword() );

        userDto.setCreatedOn( dateTimeformatter.formatTimestamp(user.getCreatedOn()) );
        userDto.setUpdatedOn( dateTimeformatter.formatTimestamp(user.getUpdatedOn()) );

        return userDto;
    }

    @Override
    public UserEntity userDtoToUserEntity(UserDto userdto) {
        if ( userdto == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setCreatedOn( userdto.getCreatedOn() );
        userEntity.setUpdatedOn( userdto.getUpdatedOn() );
        userEntity.setUsername( userdto.getUsername() );
        userEntity.setPassword( userdto.getPassword() );
        userEntity.setRole( userdto.getRole() );

        return userEntity;
    }
}
