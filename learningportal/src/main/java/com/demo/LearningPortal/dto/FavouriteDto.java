package com.demo.LearningPortal.dto;

import java.time.LocalDateTime;
import com.demo.LearningPortal.entities.CourseEntity;
import com.demo.LearningPortal.entities.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FavouriteDto {
	private long favouriteId;
	private UserEntity learnerId;
    private CourseEntity courseId;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
}
