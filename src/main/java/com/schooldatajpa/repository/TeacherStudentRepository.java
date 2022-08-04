package com.schooldatajpa.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.schooldatajpa.model.TeacherStudentEntity;

@Repository
public interface TeacherStudentRepository extends JpaRepository<TeacherStudentEntity, Integer> {
	
		
}
