package com.ashu.employee.rest.entity;

import javax.persistence.*;

@Entity
public class Skill {
    @Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer skillId;
    @Column
    private String skillName;
    
    @Column
    private String description;
    
    @ManyToOne
    private Employee employee;

    public Skill(String skillName) {
		this.skillName = skillName;
	}

	public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }
    
    

    public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Skill() {
    }

    public Skill(String skillName,String description, Employee employee) {
        this.skillName = skillName;
        this.description = description;
        this.employee = employee;
    }
}