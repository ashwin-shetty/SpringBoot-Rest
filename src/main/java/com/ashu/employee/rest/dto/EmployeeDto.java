package com.ashu.employee.rest.dto;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDto {
	
	Integer id;
	String name;

    
    List<SkillDto> skillDtos = new ArrayList<>();

    public EmployeeDto(Integer id, String name, List<SkillDto> skillDtos) {
        this.id = id;
        this.name = name;
        this.skillDtos = skillDtos;
    }
    

    public EmployeeDto() {
    }


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<SkillDto> getSkillDtos() {
		return skillDtos;
	}


	public void setSkillDtos(List<SkillDto> skillDtos) {
		this.skillDtos = skillDtos;
	}

    
    
}