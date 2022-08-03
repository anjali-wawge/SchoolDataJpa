package com.schooldatajpa.service;

import java.util.List;

import com.schooldatajpa.model.StudentEntity;

public interface StudentService {

	public boolean saveStudentData(List<StudentEntity> studentEntityList);
	
	public List<StudentEntity> getAllStudentsByTeacherName(String teacherName);

	public List<StudentEntity> getAllStudentBySameStartChar(String firstLetter);

	public List<StudentEntity> getAllStudentsBySubjectId(Integer subjectId);

	
}
