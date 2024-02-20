
package com.demo.LearningPortal.entities;
import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.demo.LearningPortal.entities.EnrollmentEntity;
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
	private UserEntity user;
	@ManyToOne
	@JoinColumn(name="category_id")
	private CategoryEntity category;
	
	@OneToMany(mappedBy = "course")
	private List<EnrollmentEntity> enrollments;
	
	@OneToMany(mappedBy = "course")
	private List<FavouriteEntity> favourites;
	@CreationTimestamp
	@Column(name="created_on",updatable=false, nullable=false)
	private LocalDateTime createdOn;
	 @UpdateTimestamp
	@Column(name="updated_on")
	private LocalDateTime updatedOn;
	 
    public void updateTimestamp() {
        this.updatedOn = LocalDateTime.now();
    }
 
    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }
}