<<<<<<< HEAD
package com.demo.LearningPortal.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.LearningPortal.Entities.CourseEntity;
import com.demo.LearningPortal.Entities.UserEntity;
import com.demo.LearningPortal.Mapper.CourseMapper;
import com.demo.LearningPortal.Repositories.CourseRepository;
import com.demo.LearningPortal.dto.CourseDto;

@Service
public class CourseService {
	/*
	 * @Autowired private CourseMapper courseMapper;
	 */
	
	@Autowired
	private CourseRepository courserepository;
	
	public CourseEntity saveCourse(CourseEntity course)
	{	course.setCreatedOn(LocalDateTime.now());
	course.setUpdatedOn(LocalDateTime.now());
		return courserepository.save(course);	
	}
	public CourseEntity updateCourse(CourseEntity course) {
		CourseEntity existingCourse = courserepository.findById(course.getCourseId()).orElse(null);
		if (existingCourse != null) {
			existingCourse.setTitle(course.getTitle());

			existingCourse.setUpdatedOn(LocalDateTime.now());

			return courserepository.save(existingCourse);
		} else {

			throw new IllegalArgumentException("Course with ID " + course.getCourseId() + " not found");
		}
	}
	public CourseEntity getCourseById(long courseId)
	{
		return courserepository.findById(courseId).orElse(null);
	}
	public List<CourseEntity> getAllCourses()
	{
		return courserepository.findAll();
	}
	
	public void createCourse(CourseDto courseDto)
	{
		CourseEntity courseEntity=CourseMapper.MAPPER.courseDtoToCourseentity(courseDto);
		courserepository.save(courseEntity);
	}
	public void deleteCourse(Long courseId) {
		 Optional<CourseEntity> existingCourse = courserepository.findById(courseId);
	        if (!existingCourse.isPresent()) {
	            throw new IllegalArgumentException("Course with ID " + courseId + " not found.");
	        }
	     courserepository.deleteById(courseId);
		
	}
}
=======
package com.demo.LearningPortal.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.LearningPortal.Entities.CourseEntity;
import com.demo.LearningPortal.Entities.UserEntity;
import com.demo.LearningPortal.Mapper.CourseMapper;
import com.demo.LearningPortal.Repositories.CourseRepository;
import com.demo.LearningPortal.dto.CourseDto;

@Service
public class CourseService {
	/*
	 * @Autowired private CourseMapper courseMapper;
	 */
	
	@Autowired
	private CourseRepository courserepository;
	
	public CourseEntity saveCourse(CourseEntity course)
	{	course.setCreatedOn(LocalDateTime.now());
	course.setUpdatedOn(LocalDateTime.now());
		return courserepository.save(course);	
	}
	public CourseEntity updateCourse(CourseEntity course) {
		CourseEntity existingCourse = courserepository.findById(course.getCourseId()).orElse(null);
		if (existingCourse != null) {
			existingCourse.setTitle(course.getTitle());

			existingCourse.setUpdatedOn(LocalDateTime.now());

			return courserepository.save(existingCourse);
		} else {

			throw new IllegalArgumentException("Course with ID " + course.getCourseId() + " not found");
		}
	}
	public CourseEntity getCourseById(long courseId)
	{
		return courserepository.findById(courseId).orElse(null);
	}
	public List<CourseEntity> getAllCourses()
	{
		return courserepository.findAll();
	}
	
	public void createCourse(CourseDto courseDto)
	{
		CourseEntity courseEntity=CourseMapper.MAPPER.courseDtoToCourseentity(courseDto);
		courserepository.save(courseEntity);
	}
	public void deleteCourse(Long courseId) {
		 Optional<CourseEntity> existingCourse = courserepository.findById(courseId);
	        if (!existingCourse.isPresent()) {
	            throw new IllegalArgumentException("Course with ID " + courseId + " not found.");
	        }
	     courserepository.deleteById(courseId);
		
	}
}
>>>>>>> aea42ef8228639dacf311d0230d00b4371719e8e
