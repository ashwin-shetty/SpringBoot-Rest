package com.ashu.employee.rest.service;

import java.util.List;

import com.ashu.employee.rest.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto getEmployeeById(Integer id);
    void saveEmployee(EmployeeDto employeeDto);
    List<EmployeeDto> getAllEmployees();
}