package com.demo.LearningPortal.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.LearningPortal.Repositories.CourseRepository;
import com.demo.LearningPortal.Repositories.EnrollmentRepository;
import com.demo.LearningPortal.Repositories.FavouriteRepository;
import com.demo.LearningPortal.Repositories.UserRepository;
import com.demo.LearningPortal.dto.CourseDto;
import com.demo.LearningPortal.dto.EnrollmentDto;
import com.demo.LearningPortal.dto.UserDto;
import com.demo.LearningPortal.entities.CourseEntity;
import com.demo.LearningPortal.entities.EnrollmentEntity;
import com.demo.LearningPortal.entities.FavouriteEntity;
import com.demo.LearningPortal.entities.UserEntity;
import com.demo.LearningPortal.entities.UserRole;
import com.demo.LearningPortal.mappers.CourseMapper;
import com.demo.LearningPortal.mappers.UserMapper;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	private EnrollmentRepository enrollmentRepository;
	@Autowired
	private EnrollmentRepository favouriteRepository;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private CourseMapper courseMapper;
	
      public UserDto saveUser(UserDto dto) {
		UserEntity entity = userMapper.toEntity(dto);
        userRepository.save(entity);
        entity.setCreatedOn(LocalDateTime.now());
		entity.setUpdatedOn(LocalDateTime.now());
        return userMapper.toDto(entity);
        
	}

	public UserDto getUserById(Long userId) {
		 Optional<UserEntity> userOptional = userRepository.findById(userId);
		 UserEntity user = userOptional.get();
		 return userMapper.toDto(user);
		 
	}

	public List<UserDto> getAllUsers() {
		List<UserEntity> entitylist= userRepository.findAll();
		return userMapper.toDto(entitylist);
	}
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
	public UserDto updateUser(UserDto dto, Long id) {
		Optional<UserEntity> checkExistinguser = userRepository.findById(id);
        if (! checkExistinguser.isPresent())
            log.error("User Id "+ id + " Not Found!");

        UserEntity entity = userMapper.toEntity(dto);
        userRepository.save(entity);
        return userMapper.toDto(entity);
	}
	public UserDto saveUserEntity1(UserDto dto, UserRole role, Long id,String username, String password) {
		if (role != UserRole.ADMIN) {
			log.error("usertype is not admin");
		}
		Optional<UserEntity> userOptional = userRepository.findById(id);
		UserEntity user = userOptional.get();
		if (user.getUserId() != id) {
			log.error("ADMIN with ID " + id + " not present");
		}
		if (user.getRole() != UserRole.ADMIN) {
			log.error("User with the ID " + id + " is not an admin user.");
		}
		if (!user.getUsername().equals(username)) {
			log.error("user with username" + username + "not found");
		}
		if (!user.getPassword().equals(password)) {
			log.error("Password of ADMIN is incorrect");
		}
		UserEntity userEntity = userMapper.toEntity(dto);
		userRepository.save(userEntity);
		log.info("user entity saved");
		return userMapper.toDto(userEntity);
	}

	public CourseDto saveCourseEntity1(CourseDto dto, UserRole role, Long id,String username, String password) {
		if (role != UserRole.AUTHOR) {
			log.error("Only ADMIN users are allowed to perform this operation.");
		}
		Optional<UserEntity> userOptional = userRepository.findById(id);
		UserEntity user = userOptional.get();
	
		  if (user.getRole() != UserRole.AUTHOR) { 
			  log.error("User with user id " + id+ " is not an author user."); }
		
		if (!user.getUsername().equals(username)) {
			log.error("username with " + username + "of AUTHOR is not present");
		}
		if (!user.getPassword().equals(password)) {
			log.error("Password of AUTHOR is incorrect");
		}
		CourseEntity userEntity = courseMapper.toEntity(dto);
		courseRepository.save(userEntity);
		log.info("course saved");
		return courseMapper.toDto(userEntity);
	}


	public CourseDto updateCourseEntity1(CourseDto dto, UserRole role, Long id,String username, String password, Long courseid) {
		if (role != UserRole.AUTHOR) {
			log.error("Only ADMIN users are allowed to perform this operation.");
		}
		Optional<UserEntity> userOptional = userRepository.findById(id);
		UserEntity user = userOptional.get();
		
		
		  if (!user.getRole().equals(UserRole.AUTHOR)) {
	      log.error("User with ID of " +id + " is not an author user.");
	      }
		 
		if (!user.getUsername().equals(username)) {
			log.error("username of AUTHOR is incorrect");
		}
		if (!user.getPassword().equals(password)) {
			log.error("Password of AUTHOR is incorrect");
		}
		Optional<CourseEntity> checkExistinguser = courseRepository.findById(courseid);
		if (!checkExistinguser.isPresent())
			log.error("Course Id " + courseid + " Not Found!");

		CourseEntity userEntity = courseMapper.toEntity(dto);
		courseRepository.save(userEntity);
		log.info("course updated");
		return courseMapper.toDto(userEntity);
	}



	
	public String courseenrollment(UserRole role, Long id, String username, String password, Long courseid) {
		if (role != UserRole.LEARNER) {
			log.error("Only LEARNER is allowed to perform this operation.");
		}
		Optional<UserEntity> userOptional = userRepository.findById(id);
		UserEntity user = userOptional.get();

	
		if (user.getRole() != UserRole.LEARNER) {
			log.error("User with ID " + id + " is not an learner .");
		}
		if (!user.getUsername().equals(username)) {
			log.error("username of LEARNER is incorrect");
		}
		if (!user.getPassword().equals(password)) {
			log.error("Password of LEARNER is incorrect");
		}
		Optional<CourseEntity> userOptiona1 = courseRepository.findById(courseid);
		CourseEntity course = userOptiona1.get();
		EnrollmentEntity enrol = new EnrollmentEntity();
		enrol.setCourse(course);
		enrol.setLearner(user);
		enrollmentRepository.save(enrol);
		return "User enrolled to the course";
	}
}
