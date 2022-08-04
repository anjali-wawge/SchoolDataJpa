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
import com.schooldatajpa.serviceimpl.StudentServiceImpl;

@RestController
public class StudentController {

	@Autowired
	private StudentServiceImpl studentService;

	@PostMapping(value = "/saveStudentDataList", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> saveStudentData(@RequestBody List<StudentEntity> studentEntityList) {
		if (studentEntityList.size() == 0) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		boolean isAlreadyExist = studentService.saveStudentData(studentEntityList);
		if (isAlreadyExist) {

			return new ResponseEntity<>("Data Already exist", HttpStatus.FOUND);
		}
		return new ResponseEntity<>("Saved Data Successfuly", HttpStatus.CREATED);
	}

	@GetMapping(value = "/getListOfStudentGreaterThanMarks", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<StudentEntity>> findStudentByMarksGreaterThan(@RequestParam Float marks) {

		List<StudentEntity> listOfStud = studentService.findStudentByMarksGreaterThan(marks);
		return new ResponseEntity<>(listOfStud, HttpStatus.OK);
	}

	@GetMapping(value = "/findStudentsByAddress", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<StudentEntity>> findStudentsByAddress(@RequestParam String address) {
		List<StudentEntity> listOfStud1 = studentService.findStudentsByAddress(address);
		return new ResponseEntity<>(listOfStud1, HttpStatus.OK);
	}

	@GetMapping(value = "/findByDateOfBirthBetween", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<StudentEntity>> findByDateOfBirth(@RequestParam String fromDate,
			@RequestParam String toDate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		List<StudentEntity> listOfStud2 = studentService.findByDateOfBirth(LocalDate.parse(fromDate, formatter),
				LocalDate.parse(toDate, formatter));
		return new ResponseEntity<>(listOfStud2, HttpStatus.OK);
	}

	@GetMapping(value = "/findStudentMraksBetween", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<StudentEntity>> findStudentMraksBetween(@RequestParam Float fromMarks,
			@RequestParam Float toMarks) {
		List<StudentEntity> listOfStud3 = studentService.findStudentMraksBetween(fromMarks, toMarks);
		return new ResponseEntity<>(listOfStud3, HttpStatus.OK);
	}

	@GetMapping(value = "/findStudentsFromStandard", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<StudentEntity>> findStudentsFromStandard(@RequestParam String std) {
		List<StudentEntity> listOfStud4 = studentService.findStudentsFromStandard(std);
		return new ResponseEntity<>(listOfStud4, HttpStatus.OK);
	}

	@GetMapping(value = "/sortByMarksAscOrder", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<StudentEntity>> sortByMarksAscOrder(@RequestParam String sortingParameter) {
		List<StudentEntity> listOfStud4 = studentService.sortByMarksAscOrder(Sort.by(sortingParameter).ascending());
		return new ResponseEntity<>(listOfStud4, HttpStatus.OK);
	}

	@GetMapping(value = "/getAllStudentDataUsingJoin", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<StudentEntity>> getAllStudentDataUsingJoin() {
		List<StudentEntity> listOfStud5 = studentService.getAllStudentDataUsingJoin();
		return new ResponseEntity<>(listOfStud5, HttpStatus.OK);
	}

	@GetMapping(value = "/getAllStudentsByTeacherName", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<StudentEntity>> getAllStudentsByTeacherName(@RequestParam String teacherName) {
		System.out.println(teacherName);
		List<StudentEntity> list6 = studentService.getAllStudentsByTeacherName(teacherName);
		return new ResponseEntity<>(list6, HttpStatus.OK);

	}

	@GetMapping(value = "/getAllStudentBySameStartChar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<StudentEntity>> getAllStudentBySameChar(@RequestParam String firstLetter) {
		System.out.println(firstLetter);
		List<StudentEntity> list7 = studentService.getAllStudentBySameStartChar(firstLetter);
		return new ResponseEntity<>(list7, HttpStatus.OK);
	}

	@GetMapping(value = "/getAllStudentsBySubjectId", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<StudentEntity>> getAllStudentsBySubjectId(@RequestParam Integer subjectId) {

		List<StudentEntity> studentList = studentService.getAllStudentsBySubjectId(subjectId);
		if (studentList.size() > 0) {
			return new ResponseEntity<>(studentList, HttpStatus.OK);
		}
		return new ResponseEntity<>(studentList, HttpStatus.NOT_FOUND);
	}
}
