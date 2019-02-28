package com.ashu.employee.rest.converter;

import java.util.stream.Collectors;

import com.ashu.employee.rest.dto.EmployeeDto;
import com.ashu.employee.rest.entity.Employee;

public class EmployeeConverter {
	
	public static Employee dtoToEntity(EmployeeDto employeeDto) {
		Employee employee = new Employee(employeeDto.getName(), null);
		employee.setId(employeeDto.getId());
		employee.setSkills(employeeDto.getSkillDtos().stream().map(SkillConverter::dtoToEntity).collect(Collectors.toList()));
		return employee;
	}

	public static EmployeeDto entityToDto(Employee employee) {
		EmployeeDto employeeDto = new EmployeeDto(employee.getId(), employee.getName(), null);
		employeeDto.setSkillDtos(employee.getSkills().stream().map(SkillConverter::entityToDto).collect(Collectors.toList()));
		return employeeDto;
	}
}