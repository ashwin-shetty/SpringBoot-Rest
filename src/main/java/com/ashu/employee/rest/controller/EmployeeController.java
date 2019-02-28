package com.ashu.employee.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ashu.employee.rest.dto.EmployeeDto;
import com.ashu.employee.rest.service.EmployeeService;
import com.ashu.employee.rest.utils.Constants;



@RequestMapping("/employee")
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	@RequestMapping(Constants.GET_EMPLOYEE_BY_ID)
	public EmployeeDto getUserById(@PathVariable Integer id) {
		return employeeService.getEmployeeById(id);
	}
	
	@RequestMapping(Constants.GET_ALL_EMPLOYEES)
	public List<EmployeeDto> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping(value= Constants.SAVE_EMPLOYEE, method= RequestMethod.POST)
	public void saveEmployee(@RequestBody EmployeeDto employeeDto) {
		employeeService.saveEmployee(employeeDto);
	}
}