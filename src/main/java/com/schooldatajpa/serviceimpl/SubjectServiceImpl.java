package com.schooldatajpa.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schooldatajpa.model.SubjectEntity;
import com.schooldatajpa.repository.SubjectRepository;
import com.schooldatajpa.service.SubjectService;

@Service
public class SubjectServiceImpl implements SubjectService{

	@Autowired
	private SubjectRepository subjectRepository;
	
	@Override
	public void saveSubject(SubjectEntity subjectEntity) {
		
		subjectRepository.save(subjectEntity);
	}

	@Override
	public List<SubjectEntity> getAllSubjectsByStudentId(Integer studentId) {
		
		return subjectRepository.getAllSubjectsByStudentId(studentId);
	}

	@Override
	public List<SubjectEntity> getAllSubejctByTeacherId(Integer teacherId) {
		
		return subjectRepository.getAllSubejctByTeacherId(teacherId);
	}

}
