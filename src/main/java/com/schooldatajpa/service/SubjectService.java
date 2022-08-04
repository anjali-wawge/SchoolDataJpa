package com.schooldatajpa.service;

import java.util.List;

import com.schooldatajpa.model.SubjectEntity;

public interface SubjectService {

	public void saveSubject(SubjectEntity subjectEntity);
	
	public 	List<SubjectEntity> getAllSubjectsByStudentId(Integer studentId);

	public List<SubjectEntity> getAllSubejctByTeacherId(Integer teacherId);

}
