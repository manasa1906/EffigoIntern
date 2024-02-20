package com.demo.LearningPortal.dto;

import java.time.LocalDateTime;
import com.demo.LearningPortal.entities.CategoryEntity;
import com.demo.LearningPortal.entities.UserEntity;
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
	private UserEntity userId;
	private CategoryEntity category;
	private LocalDateTime createdOn;
	private LocalDateTime updatedOn;
}
