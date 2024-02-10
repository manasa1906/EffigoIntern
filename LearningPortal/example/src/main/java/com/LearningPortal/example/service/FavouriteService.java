package com.LearningPortal.example.service;

import java.util.List;

import com.LearningPortal.example.Entities.FavouriteEntity;

public interface FavouriteService {
	FavouriteEntity addCourseToFavorites(Long userId, Long courseId);
    void removeCourseFromFavorites(Long favoriteId);
    List<FavouriteEntity> getUserFavorites(Long userId);
}
