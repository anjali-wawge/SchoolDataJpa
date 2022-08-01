package com.schooldatajpa.serviceimpl;

import com.schooldatajpa.model.StudentEntity;
import com.schooldatajpa.model.TeacherEntity;

public interface StudentService {

	Integer saveStudentData(StudentEntity studentEntity);
	
	Integer saveTeacherData(TeacherEntity teacherEntity);
}
