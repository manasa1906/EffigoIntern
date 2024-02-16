package com.demo.LearningPortal.Entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Favourites")
public class FavoriteEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Fav_Id")
	private long favouriteId;
	
	@ManyToOne
	@JoinColumn(name="User_Id")
	private UserEntity Learner;
	
	@ManyToOne
	@JoinColumn(name="Course_id")
	private CourseEntity course;
	
	
	@Column(name="created_on", updatable = false, nullable = false)
	private LocalDateTime createdOn;
	
	@Column(name="updated_on")
	private LocalDateTime updatedOn;


	public long getFavouriteId() {
		return favouriteId;
	}

	public void setFavouriteId(long favouriteId) {
		this.favouriteId = favouriteId;
	}

	public UserEntity getLearner() {
		return Learner;
	}

	public void setLearner(UserEntity learner) {
		Learner = learner;
	}

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

	public CourseEntity getCourse() {
		return course;
	}

	public void setCourse(CourseEntity course) {
		this.course = course;
	}
	
}
