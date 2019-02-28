package com.ashu.employee.rest.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashu.employee.rest.converter.EmployeeConverter;
import com.ashu.employee.rest.dto.EmployeeDto;
import com.ashu.employee.rest.repository.EmployeeRepository;
import com.ashu.employee.rest.service.EmployeeService;

@Service
public class EmployeeServiceimpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public EmployeeDto getEmployeeById(Integer id) {
		return EmployeeConverter.entityToDto(employeeRepository.getOne(id));
	}

	@Override
	public void saveEmployee(EmployeeDto employeeDto) {
		employeeRepository.save(EmployeeConverter.dtoToEntity(employeeDto));
	}

	@Override
	public List<EmployeeDto> getAllEmployees() {
		return employeeRepository.findAll().stream().map(EmployeeConverter::entityToDto).collect(Collectors.toList());
	}
	
}