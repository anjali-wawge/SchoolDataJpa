package com.schooldatajpa.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schooldatajpa.model.TeacherStudentEntity;
import com.schooldatajpa.repository.TeacherStudentRepository;
import com.schooldatajpa.service.TeacherStudentService;

@Service
public class TeacherStudentServiceImpl implements TeacherStudentService{

	@Autowired
	private TeacherStudentRepository teacherStudentRepo;
	@Override
	public void saveTeacherStudent(TeacherStudentEntity teacherStudentEntity) {
		teacherStudentRepo.save(teacherStudentEntity);
	}

	
	

}
