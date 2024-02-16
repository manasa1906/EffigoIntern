package com.demo.LearningPortal.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.LearningPortal.Entities.CourseEntity;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity,Long> {

}
