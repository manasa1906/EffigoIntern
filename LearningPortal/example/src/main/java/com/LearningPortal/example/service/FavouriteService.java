package com.LearningPortal.example.service;

import java.util.List;
import java.util.Optional;

import com.LearningPortal.example.Entities.FavouriteEntity;
import com.LearningPortal.example.Entities.UserEntity;

public interface FavouriteService {
	FavouriteEntity addCourseToFavorites(Long userId, Long courseId);
    void removeCourseFromFavorites(Long favorite_id);
    List<FavouriteEntity> getUserFavorites(Long userId);
}
