package com.LearningPortal.example.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class FavouriteEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Fav_id")
    private Long fav_id;
	@JoinColumn(name="user_id")
	private Long user_id;
    @JoinColumn(name = "course_id")
    private Long course_id;
    
	public Long getFav_id() {
		return fav_id;
	}
	public void setFav_id(Long fav_id) {
		this.fav_id = fav_id;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public Long getCourse_id() {
		return course_id;
	}
	public void setCourse_id(Long course_id) {
		this.course_id = course_id;
	}

}