package com.restAPI.employeeManagement.dto.Mapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.restAPI.employeeManagement.dto.Request.EmployeeRequest;
import com.restAPI.employeeManagement.dto.Response.EmployeeResponse;
import com.restAPI.employeeManagement.entity.employeeEntity;

@Mapper
public interface EmployeeMapper {
	EmployeeMapper MAPPER =Mappers.getMapper(EmployeeMapper.class);
	employeeEntity fromRequestToEntity(EmployeeRequest employeeRequest);
    EmployeeResponse fromEntityToResponse(employeeEntity employeeEntity);
}