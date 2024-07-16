package com.demo.LearningPortal.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.LearningPortal.Repositories.FavouriteRepository;
import com.demo.LearningPortal.dto.FavouriteDto;
import com.demo.LearningPortal.entities.CourseEntity;
import com.demo.LearningPortal.entities.EnrollmentEntity;
import com.demo.LearningPortal.entities.FavouriteEntity;
import com.demo.LearningPortal.mappers.FavouriteMapper;

@Service
public class FavouriteService {
	@Autowired
	private FavouriteRepository favouriteRepository;
	@Autowired
	private FavouriteMapper favouriteMapper;
	
      public FavouriteDto saveFavourite(FavouriteDto dto) {
    	  FavouriteEntity entity = favouriteMapper.toEntity(dto);
    	  favouriteRepository.save(entity);
        entity.setCreatedOn(LocalDateTime.now());
		entity.setUpdatedOn(LocalDateTime.now());
        return favouriteMapper.toDto(entity);
        
	}

	public FavouriteDto getFavouriteById(Long favouriteId) {
		Optional<FavouriteEntity> FavouriteOptional = favouriteRepository.findById(favouriteId);
		FavouriteEntity Favourite = FavouriteOptional.get();
	    return favouriteMapper.toDto(Favourite);
	}

	public List<FavouriteDto> getAllFavourites() {
		List<FavouriteEntity> entitylist= favouriteRepository.findAll();
		return favouriteMapper.toDto(entitylist);
	}
	public void deleteFavourite(Long id) {
		favouriteRepository.deleteById(id);
	}

	    public List<FavouriteDto> getFavouritesByUserId(Long userId) {
	        return favouriteRepository.findFavouritesByUserId(userId);
	    }
	 
	    
}


