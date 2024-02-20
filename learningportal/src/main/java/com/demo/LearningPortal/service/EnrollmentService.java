
package com.demo.LearningPortal.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.LearningPortal.Repositories.EnrollmentRepository;
import com.demo.LearningPortal.dto.EnrollmentDto;
import com.demo.LearningPortal.entities.CourseEntity;
import com.demo.LearningPortal.entities.EnrollmentEntity;
import com.demo.LearningPortal.mappers.EnrollmentMapper;

@Service
public class EnrollmentService {
	@Autowired
	private EnrollmentRepository enrollmentRepository;
	@Autowired
	private EnrollmentMapper enrollmentMapper;
	
      public EnrollmentDto saveEnrollment(EnrollmentDto dto) {
    	  EnrollmentEntity entity = enrollmentMapper.toEntity(dto);
    	  enrollmentRepository.save(entity);
        entity.setCreatedOn(LocalDateTime.now());
		entity.setUpdatedOn(LocalDateTime.now());
        return enrollmentMapper.toDto(entity);
        
	}

	public EnrollmentDto getEnrollmentById(Long enrollmentId) {
		Optional<EnrollmentEntity> enrollmentOptional = enrollmentRepository.findById(enrollmentId);
		EnrollmentEntity Enrollment = enrollmentOptional.get();
	    return enrollmentMapper.toDto(Enrollment);
	}

	public List<EnrollmentDto> getAllEnrollments() {
		List<EnrollmentEntity> entitylist= enrollmentRepository.findAll();
		return enrollmentMapper.toDto(entitylist);
	}
	public void deleteEnrollment(Long id) {
		enrollmentRepository.deleteById(id);
	}
}
