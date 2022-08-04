package com.schooldatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schooldatajpa.model.TeacherSubjectEntity;

public interface TeacherSubjectRepository extends JpaRepository<TeacherSubjectEntity, Integer> {

}
