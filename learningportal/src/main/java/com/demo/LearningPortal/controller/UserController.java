package com.demo.LearningPortal.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.demo.LearningPortal.Repositories.CourseRepository;
import com.demo.LearningPortal.Repositories.UserRepository;
import com.demo.LearningPortal.dto.CourseDto;
import com.demo.LearningPortal.dto.UserDto;
import com.demo.LearningPortal.entities.CourseEntity;
import com.demo.LearningPortal.entities.UserEntity;
import com.demo.LearningPortal.entities.UserRole;
import com.demo.LearningPortal.service.CategoryService;
import com.demo.LearningPortal.service.CourseService;
import com.demo.LearningPortal.service.EnrollmentService;
import com.demo.LearningPortal.service.UserService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/findAll")
	public List<UserDto> findAllUser() {
		log.info("all users");
		return userService.getAllUsers();
	}

	@GetMapping("/{userId}")
	public UserDto findById(@PathVariable("userId") Long id) {
		log.info("Get users by id");
		return userService.getUserById(id);
	}

	@DeleteMapping("delete/{id}")
	public void deleteUser(@PathVariable("id") Long id) {
		log.info("The user with" + id + " is deleted");
		userService.deleteUser(id);
	}

	@PostMapping("/createUser")
	public UserDto saveUser(@RequestBody UserDto request) {
		log.info("The user is created");
		return userService.saveUser(request);
	}

	@PutMapping("/update/{id}")
	public UserDto updateUser(@RequestBody UserDto request,@PathVariable("id") Long id) {
		log.info("The user with id" + id + "is updated");
		return userService.updateUser(request, id);
	}
	@PostMapping("/{usertype}")
	public UserDto saveUserEntityResponse1(@RequestBody UserDto userRequest,
			@PathVariable("usertype") UserRole role, @RequestParam("id") Long id,
			@RequestParam("username") String username, @RequestParam("password") String password) {
		return userService.saveUserEntity1(userRequest, role, id, username, password);
	}

	@PostMapping("/addcourse/{usertype}")
	public CourseDto saveCourseEntityResponse(@RequestBody CourseDto userrequest,
			@PathVariable("usertype") UserRole usertype, @RequestParam("id") Long id,
			@RequestParam("username") String username, @RequestParam("password") String password) {
		return userService.saveCourseEntity1(userrequest, usertype, id, username, password);
	}

	@PutMapping("/updatecourse/{usertype}/{courseid}")
	public CourseDto updateCourseEntityResponse(@RequestBody CourseDto userrequest,
			@PathVariable("usertype") UserRole usertype, @RequestParam("id") Long id,
			@RequestParam("username") String username, @RequestParam("password") String password,
			@PathVariable("courseid") Long courseid) {
		return userService.updateCourseEntity1(userrequest, usertype, id, username, password, courseid);
	}

	

	@PostMapping("/enrollcourse/{usertype}/{course_id}")
	public String courseenrollment(@PathVariable("usertype") UserRole usertype, @RequestParam("id") Long id,
			@RequestParam("username") String username, @RequestParam("password") String password,
			@PathVariable("course_id") Long courseId) {
		return userService.courseenrollment(usertype, id, username, password, courseId);
	}
}
