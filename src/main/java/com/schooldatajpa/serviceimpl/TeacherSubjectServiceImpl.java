package com.schooldatajpa.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schooldatajpa.model.TeacherSubjectEntity;
import com.schooldatajpa.repository.TeacherSubjectRepository;
import com.schooldatajpa.service.TeacherSubjectService;

@Service
public class TeacherSubjectServiceImpl implements TeacherSubjectService {
	@Autowired
	private TeacherSubjectRepository teacherSubjectRepository;

	@Override
	public void saveTeacherSubject(TeacherSubjectEntity teacherSubjectEntity) {
		teacherSubjectRepository.save(teacherSubjectEntity);
	}
	
	
	
}
