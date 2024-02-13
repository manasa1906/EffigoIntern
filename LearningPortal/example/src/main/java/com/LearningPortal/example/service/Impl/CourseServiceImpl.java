package com.LearningPortal.example.service.Impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LearningPortal.example.Entities.CourseEntity;
import com.LearningPortal.example.Repositories.CourseRepository;
import com.LearningPortal.example.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{

	 @Autowired
	    private CourseRepository courseRepository;
	@Override
	public CourseEntity createCourse(CourseEntity course) {
	 
		 return courseRepository.save(course);
		
	}

	@Override
	public CourseEntity updateCourse(CourseEntity course) {
		Optional<CourseEntity> existingCourseOptional = courseRepository.findById(course.getCourseId());
        if (existingCourseOptional.isPresent()) {
            CourseEntity existingCourse = existingCourseOptional.get();
            existingCourse.setCourseTitle(course.getCourseTitle());
            existingCourse.setCourseDescription(course.getCourseDescription());
            existingCourse.setCategory(course.getCategory());
            return courseRepository.save(existingCourse);
        } else {
           
            return null;
        }
	}

	@Override
	public void deleteCourse(Long courseId) {
		 Optional<CourseEntity> existingCourseOptional = courseRepository.findById(courseId);
		 if (!existingCourseOptional.isPresent()) {
			 throw new IllegalArgumentException("Course with ID " + courseId + " not found.");
		 }
		 
		 courseRepository.deleteById(courseId);
	}

	@Override
	public CourseEntity getCourseById(Long courseId) {
	    CourseEntity course = courseRepository.findById(courseId).orElse(null);
	    return course;
	}

	@Override
	public List<CourseEntity> getAllCourses() {
	
		 return courseRepository.findAll();
	}

	

}
