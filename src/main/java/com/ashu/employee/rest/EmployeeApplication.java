package com.ashu.employee.rest;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ashu.employee.rest.entity.Employee;
import com.ashu.employee.rest.entity.Skill;
import com.ashu.employee.rest.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeApplication 
{
	
	@Autowired
	EmployeeRepository employeeRepository;
	
    public static void main( String[] args )
    {
    	SpringApplication.run(EmployeeApplication.class, args);
    }
    
    @PostConstruct
	public void setupDbWithData(){
		Employee employee= new Employee("Ashwin", null);
		employee.setSkills(Arrays.asList(new Skill("java","Java 8 +"), new Skill("js","Angular 7")));
		employee= employeeRepository.save(employee);
	}
}
