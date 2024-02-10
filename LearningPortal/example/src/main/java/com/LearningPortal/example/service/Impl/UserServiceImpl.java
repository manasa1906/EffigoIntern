package com.LearningPortal.example.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.LearningPortal.example.Entities.UserEntity;
import com.LearningPortal.example.Repositories.UserRepository;
import com.LearningPortal.example.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
    private UserRepository userRepository;
	
	@Override
	public UserEntity createUser(UserEntity user) {
		Optional<UserEntity> existingUser = userRepository.findById(user.getId());
        if (existingUser.isPresent()) {
            throw new IllegalArgumentException("User with username " + user.getUsername() + " already exists.");
        }
		return userRepository.save(user);
	}

	@Override
	public UserEntity updateUser(UserEntity user) {
		Optional<UserEntity> existingUser = userRepository.findById(user.getId());
        if (!existingUser.isPresent()) {
            throw new IllegalArgumentException("User with ID " + user.getId() + " not found.");
        }
      
        return userRepository.save(user);
	}

	@Override
	public void deleteUser(Long userId) {
		 Optional<UserEntity> existingUser = userRepository.findById(userId);
	        if (!existingUser.isPresent()) {
	            throw new IllegalArgumentException("User with ID " + userId + " not found.");
	        }
	     userRepository.deleteById(userId);
	}

	@Override
	public Optional<UserEntity> getUserById(Long userId) {
		return userRepository.findById(userId);
		
	}

	@Override
	public List<UserEntity> getAllUsers() {
		return userRepository.findAll();
	}
}
