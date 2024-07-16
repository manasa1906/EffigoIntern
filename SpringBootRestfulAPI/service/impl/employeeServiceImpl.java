package com.restAPI.employeeManagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.restAPI.employeeManagement.dto.Mapper.EmployeeMapper;
import com.restAPI.employeeManagement.dto.Request.EmployeeRequest;
import com.restAPI.employeeManagement.dto.Response.EmployeeResponse;
import com.restAPI.employeeManagement.entity.employeeEntity;
import com.restAPI.employeeManagement.repository.employeeRepository;
import com.restAPI.employeeManagement.service.EmployeeService;

@Service
public class employeeServiceImpl implements EmployeeService {

	private final employeeRepository employeeRepository;

	public employeeServiceImpl(employeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<employeeEntity> findAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public Optional<employeeEntity> findById(Long id) {
		return employeeRepository.findById(id);
	}

	@Override
	public employeeEntity saveEmployee(employeeEntity employeeEntity) {
		return employeeRepository.save(employeeEntity);
	}

	@Override
	public employeeEntity updateEmployee(employeeEntity employeeEntity) {
		return employeeRepository.save(employeeEntity);
	}

	@Override
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}

	@Override
	public EmployeeResponse saveEmployee(EmployeeRequest employeeRequest) {
		employeeEntity employeeEntity = EmployeeMapper.MAPPER.fromRequestToEntity(employeeRequest);
		employeeRepository.save(employeeEntity);
		return EmployeeMapper.MAPPER.fromEntityToResponse(employeeEntity);
	}

	@Override
	public EmployeeResponse updateEmployee(EmployeeRequest employeeRequest, Long id) {
		Optional<employeeEntity> checkExistingEmployee = findById(id);
		if (!checkExistingEmployee.isPresent())
			throw new RuntimeException("Employee Id " + id + " Not Found!");
		employeeEntity employeeEntity = EmployeeMapper.MAPPER.fromRequestToEntity(employeeRequest);
		employeeEntity.setId(id);
		employeeRepository.save(employeeEntity);
		return EmployeeMapper.MAPPER.fromEntityToResponse(employeeEntity);
	}

}
