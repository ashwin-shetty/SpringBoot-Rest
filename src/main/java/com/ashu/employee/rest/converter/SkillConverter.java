package com.ashu.employee.rest.converter;

import com.ashu.employee.rest.dto.SkillDto;
import com.ashu.employee.rest.entity.Skill;

public class SkillConverter {
	public static Skill dtoToEntity(SkillDto SkillDto) {
		Skill Skill = new Skill(SkillDto.getSkillName(),SkillDto.getDescription(), null);
		Skill.setSkillId(SkillDto.getSkillId());
		return Skill;
	}

	public static SkillDto entityToDto(Skill skill) {
		return new SkillDto(skill.getSkillId(), skill.getSkillName(),skill.getDescription());
	}
}