package com.ashu.employee.rest.dto;


public class SkillDto {
    Integer skillId;
    String skillName;
    String description;
    
	public SkillDto(Integer skillId, String skillName, String description) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
		this.description = description;
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

    
    
}