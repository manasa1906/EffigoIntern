package com.restAPI.employeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restAPI.employeeManagement.entity.employeeEntity;

@Repository
public interface employeeRepository extends JpaRepository<employeeEntity,Long>{

}
