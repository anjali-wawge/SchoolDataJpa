package com.schooldatajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.schooldatajpa.model.TeacherSubjectEntity;
import com.schooldatajpa.service.TeacherSubjectService;

@RestController
public class TeacherSubjectController {
	@Autowired
	private TeacherSubjectService teacherSubjectService;
	
	@PostMapping(value = "/saveTeacherSubject",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveTeacherSubject(@RequestBody TeacherSubjectEntity teacherSubjectEntity) {
		teacherSubjectService.saveTeacherSubject(teacherSubjectEntity);
	}
}
