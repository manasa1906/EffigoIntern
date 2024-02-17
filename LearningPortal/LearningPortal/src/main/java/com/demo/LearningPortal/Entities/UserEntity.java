<<<<<<< HEAD
package com.demo.LearningPortal.Entities;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name="UserTable")
@Entity
public class UserEntity {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="User_Id")
	private long userId;
	@Column(name="User_Name")
	private String username;
	@Column(name="User_Password")
	private String password;
	
	@Column(name="User_Role")
	@Enumerated(EnumType.STRING)
    private UserRole role;

    
    @OneToMany(mappedBy = "author")
    private java.util.List<CourseEntity> authoredCourses;
    
    @OneToMany(mappedBy = "Learner")
    private List<EnrollmentEntity> enrollments;
    
    @OneToMany(mappedBy = "Learner")
    private List<FavoriteEntity> Favourites;

    @Column(name="Created_On", nullable=false, updatable = false)
	private LocalDateTime createdOn;
    
    @Column(name="Updated_On")
	private LocalDateTime updatedOn;
    
    public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUsername() {
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

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}


	public java.util.List<EnrollmentEntity> getEnrollments() {
		return enrollments;
	}

	public void setEnrollments(java.util.List<EnrollmentEntity> enrollments) {
		this.enrollments = enrollments;
	}

	public java.util.List<FavoriteEntity> getFavourites() {
		return Favourites;
	}

	public void setFavourites(java.util.List<FavoriteEntity> favourites) {
		this.Favourites = favourites;
	}
	

    
}
=======
package com.demo.LearningPortal.Entities;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name="UserTable")
@Entity
public class UserEntity {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="User_Id")
	private long userId;
	@Column(name="User_Name")
	private String username;
	@Column(name="User_Password")
	private String password;
	
	@Column(name="User_Role")
	@Enumerated(EnumType.STRING)
    private UserRole role;

    
    @OneToMany(mappedBy = "author")
    private java.util.List<CourseEntity> authoredCourses;
    
    @OneToMany(mappedBy = "Learner")
    private List<EnrollmentEntity> enrollments;
    
    @OneToMany(mappedBy = "Learner")
    private List<FavoriteEntity> Favourites;

    @Column(name="Created_On", nullable=false, updatable = false)
	private LocalDateTime createdOn;
    
    @Column(name="Updated_On")
	private LocalDateTime updatedOn;
    
    public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUsername() {
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

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}


	public java.util.List<EnrollmentEntity> getEnrollments() {
		return enrollments;
	}

	public void setEnrollments(java.util.List<EnrollmentEntity> enrollments) {
		this.enrollments = enrollments;
	}

	public java.util.List<FavoriteEntity> getFavourites() {
		return Favourites;
	}

	public void setFavourites(java.util.List<FavoriteEntity> favourites) {
		this.Favourites = favourites;
	}
	

    
}
>>>>>>> aea42ef8228639dacf311d0230d00b4371719e8e
