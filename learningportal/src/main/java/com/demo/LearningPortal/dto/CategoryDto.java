package com.demo.LearningPortal.dto;

import java.time.LocalDateTime;
import com.demo.LearningPortal.entities.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {
	private String categoryId;
	private String name;
	private LocalDateTime createdOn;
	private LocalDateTime updatedOn;
}
