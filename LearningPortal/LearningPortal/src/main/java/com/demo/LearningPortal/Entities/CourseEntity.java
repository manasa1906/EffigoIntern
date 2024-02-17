<<<<<<< HEAD
package com.demo.LearningPortal.Entities;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Courses")
public class CourseEntity {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="Course_Id")
	private long courseId;
	@Column(name="Course_Title")
	private String title;
	@Column(name="Course_Description")
	private String description;
	@ManyToOne
	@JoinColumn(name="author_id")
	private UserEntity author;

	
	@ManyToOne
	@JoinColumn(name="category_id")
	private CategoryEntity category;
	
	@OneToMany(mappedBy = "course")
	private List<EnrollmentEntity> enrollments;
	
	@OneToMany(mappedBy = "course")
	private List<FavoriteEntity> favourites;
	
	@Column(name="created_on",updatable=false, nullable=false)
	private LocalDateTime createdOn;
	
	@Column(name="updated_on")
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}



	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}

	public List<EnrollmentEntity> getEnrollments() {
		return enrollments;
	}

	public void setEnrollments(List<EnrollmentEntity> enrollments) {
		this.enrollments = enrollments;
	}

	public List<FavoriteEntity> getFavourites() {
		return favourites;
	}

	public void setFavourites(List<FavoriteEntity> favourites) {
		this.favourites = favourites;
	}

	public UserEntity getAuthor() {
		return author;
	}

	public void setAuthor(UserEntity author) {
		this.author = author;
	}

	
	
}
=======
package com.demo.LearningPortal.Entities;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Courses")
public class CourseEntity {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="Course_Id")
	private long courseId;
	@Column(name="Course_Title")
	private String title;
	@Column(name="Course_Description")
	private String description;
	@ManyToOne
	@JoinColumn(name="author_id")
	private UserEntity author;

	
	@ManyToOne
	@JoinColumn(name="category_id")
	private CategoryEntity category;
	
	@OneToMany(mappedBy = "course")
	private List<EnrollmentEntity> enrollments;
	
	@OneToMany(mappedBy = "course")
	private List<FavoriteEntity> favourites;
	
	@Column(name="created_on",updatable=false, nullable=false)
	private LocalDateTime createdOn;
	
	@Column(name="updated_on")
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}



	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}

	public List<EnrollmentEntity> getEnrollments() {
		return enrollments;
	}

	public void setEnrollments(List<EnrollmentEntity> enrollments) {
		this.enrollments = enrollments;
	}

	public List<FavoriteEntity> getFavourites() {
		return favourites;
	}

	public void setFavourites(List<FavoriteEntity> favourites) {
		this.favourites = favourites;
	}

	public UserEntity getAuthor() {
		return author;
	}

	public void setAuthor(UserEntity author) {
		this.author = author;
	}

	
	
}
>>>>>>> aea42ef8228639dacf311d0230d00b4371719e8e
