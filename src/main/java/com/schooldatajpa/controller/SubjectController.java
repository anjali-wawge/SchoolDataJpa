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

import com.schooldatajpa.model.SubjectEntity;
import com.schooldatajpa.model.TeacherSubjectEntity;
import com.schooldatajpa.service.SubjectService;

@RestController
public class SubjectController {
	@Autowired
	private SubjectService subjectService;
	
	@PostMapping(value = "/saveSubjects",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveSubject(@RequestBody SubjectEntity subjectEntity){
		
			subjectService.saveSubject(subjectEntity);	
	}
	
	@GetMapping(value = "/getAllSubjectsByStudentId",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<SubjectEntity>> getAllSubjectsByStudentId(Integer studentId){
		
		List<SubjectEntity> sublist=subjectService.getAllSubjectsByStudentId(studentId);
		if(sublist.size()>0) {
		return new ResponseEntity<>(sublist,HttpStatus.OK);
		}
		return new ResponseEntity<>(sublist,HttpStatus.NOT_FOUND);
		
	}
	
	@GetMapping(value = "/getAllSubejctByTeacherId",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<SubjectEntity>> getAllSubejctByTeacherId(@RequestParam Integer teacherId){
		List<SubjectEntity> subList = subjectService.getAllSubejctByTeacherId(teacherId);
		if(subList.size()>0) {
			return new ResponseEntity<>(subList,HttpStatus.OK);
			
		}
		return new ResponseEntity<>(subList,HttpStatus.BAD_REQUEST);
	}
	
	
}
