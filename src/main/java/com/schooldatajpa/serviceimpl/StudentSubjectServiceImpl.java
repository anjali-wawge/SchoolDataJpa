package com.schooldatajpa.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schooldatajpa.model.StudentSubjectEntity;
import com.schooldatajpa.repository.StudentSubjectRepository;
import com.schooldatajpa.service.StudentSubjectService;

@Service
public class StudentSubjectServiceImpl implements StudentSubjectService{
	@Autowired
	private StudentSubjectRepository studentSubjectrepository;

	@Override
	public void saveStudentSubject(StudentSubjectEntity studentSubjectEntity) {
		studentSubjectrepository.save(studentSubjectEntity);
	}
	
	
}
