package com.schooldatajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.schooldatajpa.model.TeacherEntity;

public interface TeacherRepository extends JpaRepository<TeacherEntity, Integer>{
	
	@Query("SELECT t FROM TeacherEntity t JOIN t.subject s WHERE s.id=?1")
	List<TeacherEntity> getAllTeacherBySubjectId(Integer subjectId);
}
