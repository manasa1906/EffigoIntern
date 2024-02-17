<<<<<<< HEAD
package com.demo.LearningPortal.Service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.LearningPortal.Entities.CourseEntity;
import com.demo.LearningPortal.Entities.EnrollmentEntity;
import com.demo.LearningPortal.Mapper.CourseMapper;
import com.demo.LearningPortal.Mapper.EnrollmentMapper;
import com.demo.LearningPortal.Repositories.CourseRepository;
import com.demo.LearningPortal.Repositories.EnrollmentRepository;
import com.demo.LearningPortal.dto.CourseDto;
import com.demo.LearningPortal.dto.EnrollmentDto;

@Service
public class EnrollmentService {
	/*
	 * @Autowired private EnrollmentMapper enrollmentMapper;
	 */
	@Autowired
	private EnrollmentRepository enrollmentRepository;
	
	public EnrollmentEntity saveEnrollment(EnrollmentEntity enrollment)
	{
		enrollment.setCreatedOn(LocalDateTime.now());
		enrollment.setUpdatedOn(LocalDateTime.now());
		return enrollmentRepository.save(enrollment);
	}
	
	public EnrollmentEntity getEnrollmentById(long enrollmentId)
	{
		return enrollmentRepository.findById(enrollmentId).orElse(null);
	}
	
	public List<EnrollmentEntity> getAllEnrollments()
	{
		return enrollmentRepository.findAll();
	}

	public void createEnrollment(EnrollmentDto enrollmentDto)
	{
		EnrollmentEntity enrollmentEntity=EnrollmentMapper.MAPPER.enrollmentDtoToEnrollmentEntity(enrollmentDto);
		enrollmentRepository.save(enrollmentEntity);
	}
}
=======
package com.demo.LearningPortal.Service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.LearningPortal.Entities.CourseEntity;
import com.demo.LearningPortal.Entities.EnrollmentEntity;
import com.demo.LearningPortal.Mapper.CourseMapper;
import com.demo.LearningPortal.Mapper.EnrollmentMapper;
import com.demo.LearningPortal.Repositories.CourseRepository;
import com.demo.LearningPortal.Repositories.EnrollmentRepository;
import com.demo.LearningPortal.dto.CourseDto;
import com.demo.LearningPortal.dto.EnrollmentDto;

@Service
public class EnrollmentService {
	/*
	 * @Autowired private EnrollmentMapper enrollmentMapper;
	 */
	@Autowired
	private EnrollmentRepository enrollmentRepository;
	
	public EnrollmentEntity saveEnrollment(EnrollmentEntity enrollment)
	{
		enrollment.setCreatedOn(LocalDateTime.now());
		enrollment.setUpdatedOn(LocalDateTime.now());
		return enrollmentRepository.save(enrollment);
	}
	
	public EnrollmentEntity getEnrollmentById(long enrollmentId)
	{
		return enrollmentRepository.findById(enrollmentId).orElse(null);
	}
	
	public List<EnrollmentEntity> getAllEnrollments()
	{
		return enrollmentRepository.findAll();
	}

	public void createEnrollment(EnrollmentDto enrollmentDto)
	{
		EnrollmentEntity enrollmentEntity=EnrollmentMapper.MAPPER.enrollmentDtoToEnrollmentEntity(enrollmentDto);
		enrollmentRepository.save(enrollmentEntity);
	}
}
>>>>>>> aea42ef8228639dacf311d0230d00b4371719e8e
