<<<<<<< HEAD
package com.demo.LearningPortal.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.LearningPortal.Entities.EnrollmentEntity;
import com.demo.LearningPortal.Service.EnrollmentService;
import com.demo.LearningPortal.dto.EnrollmentDto;


@RestController
@RequestMapping("/Enrollment")
public class EnrollmentController {
	   @Autowired
	    private EnrollmentService enrollmentService;
	   
	 @PostMapping("/createEnrollment")
	   public ResponseEntity<String> createEnrollment(@RequestBody EnrollmentDto enrollmentdto) {
		 enrollmentService.createEnrollment(enrollmentdto);
			return ResponseEntity.status(HttpStatus.CREATED).body("Enrollment got created");
		}
	 
	  @GetMapping("/{enrollmentId}")
	    public EnrollmentEntity getEnrollmentById(@PathVariable Long enrollmentId) {
	        return enrollmentService.getEnrollmentById(enrollmentId);
	    }

	    @GetMapping("/all")
	    public List<EnrollmentEntity> getAllCourses() {
	        return enrollmentService.getAllEnrollments();
	    }

}
=======
package com.demo.LearningPortal.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.LearningPortal.Entities.EnrollmentEntity;
import com.demo.LearningPortal.Service.EnrollmentService;
import com.demo.LearningPortal.dto.EnrollmentDto;


@RestController
@RequestMapping("/Enrollment")
public class EnrollmentController {
	   @Autowired
	    private EnrollmentService enrollmentService;
	   
	 @PostMapping("/createEnrollment")
	   public ResponseEntity<String> createEnrollment(@RequestBody EnrollmentDto enrollmentdto) {
		 enrollmentService.createEnrollment(enrollmentdto);
			return ResponseEntity.status(HttpStatus.CREATED).body("Enrollment got created");
		}
	 
	  @GetMapping("/{enrollmentId}")
	    public EnrollmentEntity getEnrollmentById(@PathVariable Long enrollmentId) {
	        return enrollmentService.getEnrollmentById(enrollmentId);
	    }

	    @GetMapping("/all")
	    public List<EnrollmentEntity> getAllCourses() {
	        return enrollmentService.getAllEnrollments();
	    }

}
>>>>>>> aea42ef8228639dacf311d0230d00b4371719e8e
