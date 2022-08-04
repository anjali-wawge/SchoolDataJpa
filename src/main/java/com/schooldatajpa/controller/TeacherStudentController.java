package com.schooldatajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.schooldatajpa.service.TeacherStudentService;

@RestController
public class TeacherStudentController {
	@Autowired
	private TeacherStudentService teacherStudentService;
	
	
	
}
