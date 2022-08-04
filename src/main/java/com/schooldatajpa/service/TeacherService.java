package com.schooldatajpa.service;

import java.util.List;

import com.schooldatajpa.model.TeacherEntity;

public interface TeacherService {

	public Integer saveTeacherData(TeacherEntity teacherEntity);
	
	public List<TeacherEntity> getAllTeacherBySubjectId(Integer subjectId);

}
