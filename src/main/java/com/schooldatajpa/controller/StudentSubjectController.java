package com.schooldatajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.schooldatajpa.model.StudentSubjectEntity;
import com.schooldatajpa.service.StudentSubjectService;

@RestController
public class StudentSubjectController {
	@Autowired
	private StudentSubjectService studentSubjectService;
	
	@PostMapping(value = "/saveStudentSubjectData",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveStudentSubject(@RequestBody StudentSubjectEntity studentSubjectEntity) {
		studentSubjectService.saveStudentSubject(studentSubjectEntity);
	}
}
