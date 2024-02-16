package com.demo.LearningPortal.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDto {
	private long courseId;
	private String title;
	private String description;
	private long authorid;
	private String category;
	private LocalDateTime createdOn;
	private LocalDateTime updatedOn;
	public long getCourseId() {
		return courseId;
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getAuthorid() {
		return authorid;
	}
	public void setAuthorid(long authorid) {
		this.authorid = authorid;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
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
	public CourseDto(long courseId, String title, String description, long authorid, String category,
			LocalDateTime createdOn, LocalDateTime updatedOn) {
		super();
		this.courseId = courseId;
		this.title = title;
		this.description = description;
		this.authorid = authorid;
		this.category = category;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
	}
	public CourseDto() {
		super();
	}
	
}
