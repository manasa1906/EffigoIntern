package com.LearningPortal.example.service;

import java.util.List;

import com.LearningPortal.example.Entities.Category;
import com.LearningPortal.example.Entities.CourseEntity;

public interface CourseService {
	CourseEntity createCourse(CourseEntity course);
    CourseEntity updateCourse(CourseEntity course);
    void deleteCourse(Long courseId);
    CourseEntity getCourseById(Long courseId);
    List<CourseEntity> getAllCourses();
    List<CourseEntity> getCoursesByCategory(Category category);
}
