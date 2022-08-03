package com.schooldatajpa.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schooldatajpa.repository.TeacherStudentRepository;
import com.schooldatajpa.service.TeacherStudentService;

@Service
public class TeacherStudentServiceImpl implements TeacherStudentService{

	@Autowired
	private TeacherStudentRepository teacherStudentRepository;
	

}
