package com.LearningPortal.example.Repositories.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.LearningPortal.example.Entities.FavouriteEntity;
import com.LearningPortal.example.Entities.UserEntity;
import com.LearningPortal.example.service.FavouriteService;

@RestController
@RequestMapping("/favorites")
public class FavouriteController {

    @Autowired
    private FavouriteService favouriteService;

    @PostMapping("/add")
    public ResponseEntity<FavouriteEntity> addCourseToFavorites(@RequestParam Long userId, @RequestParam Long courseId) {
        FavouriteEntity favouriteEntity = favouriteService.addCourseToFavorites(userId, courseId);
        return ResponseEntity.ok(favouriteEntity);
    }

    @DeleteMapping("/remove/{favoriteId}")
    public ResponseEntity<String> removeCourseFromFavorites(@PathVariable Long favoriteId) {
        favouriteService.removeCourseFromFavorites(favoriteId);
        return ResponseEntity.ok("Favorite removed successfully");
    }

    @GetMapping("/{user_id}")
    public ResponseEntity<List<FavouriteEntity>> getUserFavorites(@PathVariable Long userId) {
        List<FavouriteEntity> favourites = favouriteService.getUserFavorites(userId);
        return new ResponseEntity<>(favourites, HttpStatus.OK);
    }
    }
