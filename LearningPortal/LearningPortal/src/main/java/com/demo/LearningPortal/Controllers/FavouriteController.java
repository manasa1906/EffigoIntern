<<<<<<< HEAD
package com.demo.LearningPortal.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.LearningPortal.Entities.FavoriteEntity;
import com.demo.LearningPortal.Service.FavouriteService;
import com.demo.LearningPortal.dto.FavouriteDto;

@RestController
@RequestMapping("/favourites")
public class FavouriteController {
	
	   @Autowired
	    private FavouriteService  favouriteService;
	   
	   @PostMapping("/createFavourite")
	   public ResponseEntity<String> createFavourite(@RequestBody FavouriteDto favouritedto) {
		   favouriteService.createFavorites(favouritedto);
			return ResponseEntity.status(HttpStatus.CREATED).body("Favourites got created");
		}


	    @DeleteMapping("/delete/{favoriteId}")
	    public void deleteCourse(@PathVariable Long favouriteId) {
	    	favouriteService.deleteFavourite(favouriteId);
	    }

	    @GetMapping("/{favouriteId}")
	    public FavoriteEntity getCourseById(@PathVariable Long favouriteId) {
	        return favouriteService.getFavouritesById(favouriteId);
	    }

	    @GetMapping("/all")
	    public List<FavoriteEntity> getAllfavourites() {
	        return favouriteService.getAllFavourites();
	    }
}
=======
package com.demo.LearningPortal.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.LearningPortal.Entities.FavoriteEntity;
import com.demo.LearningPortal.Service.FavouriteService;
import com.demo.LearningPortal.dto.FavouriteDto;

@RestController
@RequestMapping("/favourites")
public class FavouriteController {
	
	   @Autowired
	    private FavouriteService  favouriteService;
	   
	   @PostMapping("/createFavourite")
	   public ResponseEntity<String> createFavourite(@RequestBody FavouriteDto favouritedto) {
		   favouriteService.createFavorites(favouritedto);
			return ResponseEntity.status(HttpStatus.CREATED).body("Favourites got created");
		}


	    @DeleteMapping("/delete/{favoriteId}")
	    public void deleteCourse(@PathVariable Long favouriteId) {
	    	favouriteService.deleteFavourite(favouriteId);
	    }

	    @GetMapping("/{favouriteId}")
	    public FavoriteEntity getCourseById(@PathVariable Long favouriteId) {
	        return favouriteService.getFavouritesById(favouriteId);
	    }

	    @GetMapping("/all")
	    public List<FavoriteEntity> getAllfavourites() {
	        return favouriteService.getAllFavourites();
	    }
}
>>>>>>> aea42ef8228639dacf311d0230d00b4371719e8e
