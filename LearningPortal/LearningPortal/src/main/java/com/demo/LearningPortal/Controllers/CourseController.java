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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.LearningPortal.Entities.CourseEntity;
import com.demo.LearningPortal.Service.CourseService;
import com.demo.LearningPortal.dto.CourseDto;
import com.demo.LearningPortal.dto.UserDto;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	   @Autowired
	    private CourseService courseService;
	   
	   @PostMapping("/createCourse")
	   public ResponseEntity<String> createCourse(@RequestBody CourseDto coursedto) {
			courseService.createCourse(coursedto);
			return ResponseEntity.status(HttpStatus.CREATED).body("Course got created");
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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.LearningPortal.Entities.CourseEntity;
import com.demo.LearningPortal.Service.CourseService;
import com.demo.LearningPortal.dto.CourseDto;
import com.demo.LearningPortal.dto.UserDto;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	   @Autowired
	    private CourseService courseService;
	   
	   @PostMapping("/createCourse")
	   public ResponseEntity<String> createCourse(@RequestBody CourseDto coursedto) {
			courseService.createCourse(coursedto);
			return ResponseEntity.status(HttpStatus.CREATED).body("Course got created");
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
>>>>>>> aea42ef8228639dacf311d0230d00b4371719e8e
