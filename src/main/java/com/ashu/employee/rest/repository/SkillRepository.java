package com.ashu.employee.rest.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashu.employee.rest.entity.Skill;


@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer>{
}