package com.LearningPortal.example.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserEntity {
	 @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="user_id")
	 private Long id;
	 @Column(name="user_name")
	 private static String username;
	 @Column(name="user_password")
     private String password;
	 @Column(name="user_role")
	  @Enumerated(EnumType.STRING)
	    private UserRole role;
	 

     public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public static String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
