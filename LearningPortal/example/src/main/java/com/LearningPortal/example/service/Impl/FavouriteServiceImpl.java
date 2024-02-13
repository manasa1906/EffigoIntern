package com.LearningPortal.example.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LearningPortal.example.Entities.CourseEntity;
import com.LearningPortal.example.Entities.FavouriteEntity;
import com.LearningPortal.example.Entities.UserEntity;
import com.LearningPortal.example.Repositories.CourseRepository;
import com.LearningPortal.example.Repositories.FavouriteRepository;
import com.LearningPortal.example.Repositories.UserRepository;
import com.LearningPortal.example.service.FavouriteService;

@Service
public class FavouriteServiceImpl implements FavouriteService {
	@Autowired
	private FavouriteRepository favouriteRepository;
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private CourseRepository courseRepository;
    @Override
    public FavouriteEntity addCourseToFavorites(Long userId, Long courseId) {
     
        UserEntity user = userRepository.findById(userId).orElse(null);
        CourseEntity course = courseRepository.findById(courseId).orElse(null);
        
        if (user == null || course == null) {
           
            return null;
        }
        
        FavouriteEntity favourite = new FavouriteEntity();
        favourite.setUser(user);
        favourite.setCourse(course);
        

        return favouriteRepository.save(favourite);
    }

    @Override
    public void removeCourseFromFavorites(Long favoriteId) {
      
        favouriteRepository.deleteById(favoriteId);
    }

    @Override
    public List<FavouriteEntity> getUserFavorites(Long userId) {
      
        return favouriteRepository.findByUser_Id(userId);
    }


}
