package com.demo.LearningPortal.service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.LearningPortal.Repositories.CourseRepository;
import com.demo.LearningPortal.dto.CourseDto;
import com.demo.LearningPortal.entities.CategoryEntity;
import com.demo.LearningPortal.entities.CourseEntity;
import com.demo.LearningPortal.mappers.CourseMapper;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courserepository;
	@Autowired
	private CourseMapper courseMapper;
	 public CourseDto saveCourse(CourseDto dto) {
			CourseEntity entity = courseMapper.toEntity(dto);
	        courserepository.save(entity);
	        entity.setCreatedOn(LocalDateTime.now());
			entity.setUpdatedOn(LocalDateTime.now());
	        return courseMapper.toDto(entity);
	        
		}

	public CourseDto getCourseById(long courseId)
	{ 
		Optional<CourseEntity> courseOptional = courserepository.findById(courseId);
	    CourseEntity course = courseOptional.get();
	    return courseMapper.toDto(course);
	}
	public List<CourseDto> getAllCourses()
	{
		List<CourseEntity> entitylist= courserepository.findAll();
		return courseMapper.toDto(entitylist);
	}

	public CourseDto updateCourse(CourseDto dto, Long id) {
		Optional<CourseEntity> checkExistingCourse = courserepository.findById(id);
        if (! checkExistingCourse.isPresent())
           log.error("Course Id "+ id + " Not Found!");
        CourseEntity entity =courseMapper.toEntity(dto);
        courserepository.save(entity);
        return courseMapper.toDto(entity);
	}

	public void deleteCourse(Long courseId) {
		 Optional<CourseEntity> existingCourse = courserepository.findById(courseId);
	        if (!existingCourse.isPresent()) {
	            throw new IllegalArgumentException("Course with ID " + courseId + " not found.");
	        }
	     courserepository.deleteById(courseId);
		
	}
}