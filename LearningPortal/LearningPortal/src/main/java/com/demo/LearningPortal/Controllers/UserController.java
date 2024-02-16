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

import com.demo.LearningPortal.Entities.UserEntity;
import com.demo.LearningPortal.Mapper.UserMapper;
import com.demo.LearningPortal.Service.UserService;
import com.demo.LearningPortal.dto.UserDto;

@RestController
@RequestMapping("/Users")
public class UserController {
	/*
	 * @Autowired private UserMapper userMapper;
	 */
	@Autowired
    private UserService userService;
	
	@PostMapping("/createUser")
	public ResponseEntity<String> createUser(@RequestBody UserDto userdto) {
		userService.createUser(userdto);
		
		return ResponseEntity.status(HttpStatus.CREATED).body("User got created");
	}
	
	

	    @GetMapping("/{userId}")
	    public ResponseEntity<UserEntity> getUserById(@PathVariable Long userId) {
	        userService.getUserById(userId);
	        return new ResponseEntity<>(HttpStatus.OK);
	    }
	    @GetMapping("/findAll")
	    public ResponseEntity<List<UserEntity>> getAllUsers() {
	        List<UserEntity> users = userService.getAllUsers();
	        return new ResponseEntity<>(users, HttpStatus.OK);
	    }
}
