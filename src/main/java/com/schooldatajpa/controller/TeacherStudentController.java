package com.schooldatajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.schooldatajpa.model.TeacherEntity;
import com.schooldatajpa.model.TeacherStudentEntity;
import com.schooldatajpa.service.TeacherStudentService;

@RestController
public class TeacherStudentController {
	@Autowired
	private TeacherStudentService teacherStudentService;
	
	@GetMapping(value = "/getAllStudentByTeacherId",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllStudentByTeacherId(@RequestParam Integer teacherId){
	
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		
	}
}
