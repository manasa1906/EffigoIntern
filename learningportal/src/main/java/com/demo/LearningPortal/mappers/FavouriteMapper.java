package com.demo.LearningPortal.mappers;

import java.util.List;
import org.mapstruct.Mapper;
import com.demo.LearningPortal.dto.FavouriteDto;
import com.demo.LearningPortal.entities.FavouriteEntity;
@Mapper(componentModel = "spring")
public interface FavouriteMapper extends EntityMapper<FavouriteDto,FavouriteEntity>{
	FavouriteDto toDto(FavouriteEntity entity);
	FavouriteEntity toEntity(FavouriteDto dto);
	List<FavouriteDto> toDto(List<FavouriteEntity> entitylist);
	List<FavouriteEntity> toEntity(List<FavouriteDto> dtolist);
}
