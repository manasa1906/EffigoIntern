package com.demo.LearningPortal.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.LearningPortal.Entities.CourseEntity;
import com.demo.LearningPortal.Entities.UserEntity;
import com.demo.LearningPortal.Mapper.CourseMapper;
import com.demo.LearningPortal.Mapper.UserMapper;
import com.demo.LearningPortal.Repositories.UserRepository;
import com.demo.LearningPortal.dto.CourseDto;
import com.demo.LearningPortal.dto.UserDto;

@Service
public class UserService {
	/*
	 * @Autowired private UserMapper userMapper;
	 */

	@Autowired
	private UserRepository userRepository;

	public UserEntity saveUser(UserEntity user) {
		user.setCreatedOn(LocalDateTime.now());
		user.setUpdatedOn(LocalDateTime.now());
		return userRepository.save(user);

	}

	public UserEntity updateUser(UserEntity user) {
		UserEntity existingUser = userRepository.findById(user.getUserId()).orElse(null);
		if (existingUser != null) {
			existingUser.setUsername(user.getUsername());

			existingUser.setUpdatedOn(LocalDateTime.now());

			return userRepository.save(existingUser);
		} else {

			throw new IllegalArgumentException("User with ID " + user.getUserId() + " not found");
		}
	}

	public UserEntity getUserById(Long userId) {
		return userRepository.findById(userId).orElse(null);
	}

	public List<UserEntity> getAllUsers() {
		return userRepository.findAll();
	}

	public void createUser(UserDto userDto)
	{
		UserEntity userEntity=UserMapper.MAPPER.userDtoToUserEntity(userDto);
		userRepository.save(userEntity);
	}

	public void deleteUser(Long userId) {
		 Optional<UserEntity> existingUser = userRepository.findById(userId);
	        if (!existingUser.isPresent()) {
	            throw new IllegalArgumentException("User with ID " + userId + " not found.");
	        }
	     userRepository.deleteById(userId);
	}


}
