
package com.demo.LearningPortal.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.LearningPortal.entities.CourseEntity;

public interface CourseRepository extends JpaRepository<CourseEntity,Long> {

}
