package com.demo.LearningPortal.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FavouriteDto {
	private long favouriteId;
	private Long learnerId;
    private Long courseId;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
	public long getFavouriteId() {
		return favouriteId;
	}
	public void setFavouriteId(long favouriteId) {
		this.favouriteId = favouriteId;
	}
	public Long getLearnerId() {
		return learnerId;
	}
	public void setLearnerId(Long learnerId) {
		this.learnerId = learnerId;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
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
	public FavouriteDto() {
		super();
	}

}
