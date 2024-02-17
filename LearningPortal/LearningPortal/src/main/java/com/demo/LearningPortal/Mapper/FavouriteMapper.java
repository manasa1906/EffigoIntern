<<<<<<< HEAD
package com.demo.LearningPortal.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.demo.LearningPortal.Entities.FavoriteEntity;
import com.demo.LearningPortal.Entities.UserEntity;
import com.demo.LearningPortal.dto.FavouriteDto;

@Mapper(componentModel = "spring", uses= {UserMapper.class, CourseMapper.class})
public interface FavouriteMapper {
	FavouriteMapper MAPPER = Mappers.getMapper(FavouriteMapper.class);
	FavoriteEntity favourites =new FavoriteEntity();
	UserEntity user=new UserEntity();

	@Mapping(target = "createdOn" , expression = "java(dateTimeformatter.formatTimestamp(user.getCreatedOn()))")
	@Mapping(target = "updatedOn" , expression = "java(dateTimeformatter.formatTimestamp(user.getupdatedOn()))")
	@Mapping(source = "favourites.Learner.userId", target="User_Id")
	FavouriteDto favouriteEntityToFavouritesDto(FavoriteEntity favourite);
	
	FavoriteEntity favouriteDtoTofavouriteEntity(FavouriteDto favourite);

}
=======
package com.demo.LearningPortal.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.demo.LearningPortal.Entities.FavoriteEntity;
import com.demo.LearningPortal.Entities.UserEntity;
import com.demo.LearningPortal.dto.FavouriteDto;

@Mapper(componentModel = "spring", uses= {UserMapper.class, CourseMapper.class})
public interface FavouriteMapper {
	FavouriteMapper MAPPER = Mappers.getMapper(FavouriteMapper.class);
	FavoriteEntity favourites =new FavoriteEntity();
	UserEntity user=new UserEntity();

	@Mapping(target = "createdOn" , expression = "java(dateTimeformatter.formatTimestamp(user.getCreatedOn()))")
	@Mapping(target = "updatedOn" , expression = "java(dateTimeformatter.formatTimestamp(user.getupdatedOn()))")
	@Mapping(source = "favourites.Learner.userId", target="User_Id")
	FavouriteDto favouriteEntityToFavouritesDto(FavoriteEntity favourite);
	
	FavoriteEntity favouriteDtoTofavouriteEntity(FavouriteDto favourite);

}
>>>>>>> aea42ef8228639dacf311d0230d00b4371719e8e
