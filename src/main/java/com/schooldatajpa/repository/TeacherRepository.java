package com.schooldatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schooldatajpa.model.TeacherEntity;

public interface TeacherRepository extends JpaRepository<TeacherEntity, Integer>{
	
	
}
