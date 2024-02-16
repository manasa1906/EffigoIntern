package com.demo.LearningPortal.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.LearningPortal.Entities.FavoriteEntity;
import com.demo.LearningPortal.Mapper.FavouriteMapper;
import com.demo.LearningPortal.Repositories.FavouriteRepository;
import com.demo.LearningPortal.dto.FavouriteDto;


@Service
public class FavouriteService {
	@Autowired
	private FavouriteRepository favouriteRepository;
	
	/*
	 * @Autowired private FavouriteMapper FavouriteMapper;
	 */
	public FavoriteEntity saveFavourite(FavoriteEntity favourites)
	{
		favourites.setCreatedOn(LocalDateTime.now());
		favourites.setUpdatedOn(LocalDateTime.now());
		return favouriteRepository.save(favourites);
	}
	public FavoriteEntity getFavouritesById(long favouriteId)
	{
		return favouriteRepository.findById(favouriteId).orElse(null);
	}
	public List<FavoriteEntity> getAllFavourites()
	{
		return favouriteRepository.findAll();
	}
	public void createFavorites(FavouriteDto favouriteDto)
	{
		FavoriteEntity favouriteEntity=FavouriteMapper.MAPPER.favouriteDtoTofavouriteEntity(favouriteDto);
		favouriteRepository.save(favouriteEntity);
	}
	public void deleteFavourite(Long favouriteId) {
		 Optional<FavoriteEntity> existingFavourite = favouriteRepository.findById(favouriteId);
	        if (!existingFavourite.isPresent()) {
	            throw new IllegalArgumentException("Favourite with ID " + favouriteId + " not found.");
	        }
	     favouriteRepository.deleteById(favouriteId);
		
}
}