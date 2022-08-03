package com.schooldatajpa.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schooldatajpa.model.TeacherEntity;
import com.schooldatajpa.repository.TeacherRepository;
import com.schooldatajpa.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {
	@Autowired 
	private TeacherRepository teacherRepository;
	
	@Override
	public Integer saveTeacherData(TeacherEntity teacheEntity) {
		TeacherEntity s=teacherRepository.save(teacheEntity);
	    return s.getId();
	}

}
