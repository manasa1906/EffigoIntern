package com.LearningPortal.example.Repositories.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LearningPortal.example.Entities.CourseEntity;
import com.LearningPortal.example.service.CourseService;

@RestController
	@RequestMapping("/course")
	public class CourseController {

	    @Autowired
	    private CourseService courseService;

	    @PostMapping("/create")
	    public CourseEntity createCourse(@RequestBody CourseEntity course) {
	        return courseService.createCourse(course);
	    }

	    @PutMapping("/update")
	    public CourseEntity updateCourse(@RequestBody CourseEntity course) {
	        return courseService.updateCourse(course);
	    }

	    @DeleteMapping("/delete/{courseId}")
	    public void deleteCourse(@PathVariable Long courseId) {
	        courseService.deleteCourse(courseId);
	    }

	    @GetMapping("/{courseId}")
	    public CourseEntity getCourseById(@PathVariable Long courseId) {
	        return courseService.getCourseById(courseId);
	    }

	    @GetMapping("/all")
	    public List<CourseEntity> getAllCourses() {
	        return courseService.getAllCourses();
	    }
	}

