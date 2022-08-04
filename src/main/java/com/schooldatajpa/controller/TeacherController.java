package com.schooldatajpa.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.schooldatajpa.model.TeacherEntity;
import com.schooldatajpa.service.TeacherService;

@RestController
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
	
	@PostMapping(value = "/saveTeacherData",consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> saveTeacherData(@RequestBody TeacherEntity teacherEntity){
		Integer id=teacherService.saveTeacherData(teacherEntity);
		if(id!=null) {
		  return new ResponseEntity<>("Saved Teacher data successfully",HttpStatus.OK);
		}
		return new ResponseEntity<>("Pls check id",HttpStatus.BAD_REQUEST);
	}

	@GetMapping(value = "/getAllTeacherBySubjectId",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<TeacherEntity>>getAllTeacherBySubjectId(@RequestParam Integer subjectId){
		List<TeacherEntity> teacherList=teacherService.getAllTeacherBySubjectId(subjectId);
		if(teacherList.size()>0) {
			return new ResponseEntity<>(teacherList,HttpStatus.OK);
		}
		return new ResponseEntity<>(teacherList,HttpStatus.BAD_REQUEST);
		
	}
}
