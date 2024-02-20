package com.demo.LearningPortal.dto;

import java.time.LocalDateTime;
import com.demo.LearningPortal.entities.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {	
private long userId;
private String username;
private String password;
private UserRole role;
private LocalDateTime createdOn;
private LocalDateTime updatedOn;
}
