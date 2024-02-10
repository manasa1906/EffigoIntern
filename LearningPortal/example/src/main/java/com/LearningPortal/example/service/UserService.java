package com.LearningPortal.example.service;

import java.util.List;
import java.util.Optional;

import com.LearningPortal.example.Entities.UserEntity;

public interface UserService {
    UserEntity createUser(UserEntity user);
    UserEntity updateUser(UserEntity user);
    void deleteUser(Long userId);
    Optional<UserEntity> getUserById(Long userId);
    List<UserEntity> getAllUsers();

}
