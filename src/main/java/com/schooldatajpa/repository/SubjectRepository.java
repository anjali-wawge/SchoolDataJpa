package com.schooldatajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.schooldatajpa.model.SubjectEntity;

@Repository
public interface SubjectRepository extends JpaRepository<SubjectEntity, Integer> {

	@Query("SELECT s FROM SubjectEntity s JOIN s.studentEntity st WHERE st.id=?1")
	List<SubjectEntity> getAllSubjectsByStudentId(Integer studentId);
	
	@Query("SELECT s FROM SubjectEntity s JOIN s.teacherEntity t WHERE t.id = ?1")
	List<SubjectEntity> getAllSubejctByTeacherId(Integer teacherId);
}
