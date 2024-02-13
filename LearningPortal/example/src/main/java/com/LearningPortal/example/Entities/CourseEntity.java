package com.LearningPortal.example.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CourseEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
    private Long courseId;
	
    private String courseTitle;

    private String courseDescription;

	  @Enumerated(EnumType.STRING)
	private Category category;

	 private Long authorId;
	    @ManyToOne
	    @JoinColumn(name = "userId")
	    private UserEntity user;
		public Long getCourseId() {
			return courseId;
		}
		public void setCourseId(Long courseId) {
			this.courseId = courseId;
		}
		public String getCourseTitle() {
			return courseTitle;
		}
		public void setCourseTitle(String courseTitle) {
			this.courseTitle = courseTitle;
		}
		public String getCourseDescription() {
			return courseDescription;
		}
		public void setCourseDescription(String courseDescription) {
			this.courseDescription = courseDescription;
		}
		public Category getCategory() {
			return category;
		}
		public void setCategory(Category category) {
			this.category = category;
		}
		public Long getAuthorId() {
			return authorId;
		}
		public void setAuthorId(Long authorId) {
			this.authorId = authorId;
		}
		public UserEntity getUser() {
			return user;
		}
		public void setUser(UserEntity user) {
			user = user;
		}
    
}