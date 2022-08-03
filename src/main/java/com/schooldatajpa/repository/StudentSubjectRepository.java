package com.schooldatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schooldatajpa.model.StudentSubjectEntity;

public interface StudentSubjectRepository extends JpaRepository<StudentSubjectEntity, Integer> {

}
