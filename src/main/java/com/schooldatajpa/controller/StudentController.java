package com.schooldatajpa.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.schooldatajpa.model.StudentEntity;
import com.schooldatajpa.service.StudentServiceImpl;

@RestController
public class StudentController {

	@Autowired
	private StudentServiceImpl studentService;

	@PostMapping(value="/saveStudentData",consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> saveStudentData(@RequestBody StudentEntity studentEntity) {
		if(studentEntity.getFees()==null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Integer id=studentService.saveStudentData(studentEntity);
		if(id!=0) {
		return new ResponseEntity<>("Saved Data Succeffuly",HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping(value = "/getListOfStudentGreaterThanMarks",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<StudentEntity>>  findStudentByMarksGreaterThan(@RequestParam Float marks){
		
		List<StudentEntity> listOfStud=studentService.findStudentByMarksGreaterThan(marks);
		return new ResponseEntity<>(listOfStud,HttpStatus.OK);
	}
	
	@GetMapping(value = "/findStudentsByAddress",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<StudentEntity>>  findStudentsByAddress(@RequestParam String address){
		List<StudentEntity> listOfStud1=studentService.findStudentsByAddress(address);
		return new ResponseEntity<>(listOfStud1,HttpStatus.OK);
	}
    //cypon drop pedriatric
	
	@GetMapping(value = "/findByDateOfBirthBetween",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<StudentEntity>>  findByDateOfBirth (@RequestParam String fromDate,@RequestParam String toDate){
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		List<StudentEntity> listOfStud2=studentService.findByDateOfBirth(LocalDate.parse(fromDate,formatter), LocalDate.parse(toDate,formatter));
		return new ResponseEntity<>(listOfStud2,HttpStatus.OK);
	}
	
	@GetMapping(value = "/findStudentMraksBetween",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<StudentEntity>>  findStudentMraksBetween (@RequestParam Float fromMarks,@RequestParam Float toMarks){
		List<StudentEntity> listOfStud3=studentService.findStudentMraksBetween(fromMarks,toMarks);
		return new ResponseEntity<>(listOfStud3,HttpStatus.OK);
	}
	
	@GetMapping(value = "/findStudentsFromStandard",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<StudentEntity>>  findStudentsFromStandard (@RequestParam String std){
		List<StudentEntity> listOfStud4=studentService.findStudentsFromStandard(std);
		return new ResponseEntity<>(listOfStud4,HttpStatus.OK);
	}
	
	
	@GetMapping(value = "/sortByMarksAscOrder",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<StudentEntity>>  sortByMarksAscOrder (@RequestParam String sortingParameter){
		List<StudentEntity> listOfStud4=studentService.sortByMarksAscOrder(Sort.by(sortingParameter).ascending());
		return new ResponseEntity<>(listOfStud4,HttpStatus.OK);
	}
}
