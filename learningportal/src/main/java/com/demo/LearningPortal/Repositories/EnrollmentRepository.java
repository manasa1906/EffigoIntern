
package com.demo.LearningPortal.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.LearningPortal.entities.EnrollmentEntity;

public interface EnrollmentRepository extends JpaRepository<EnrollmentEntity,Long>{

}