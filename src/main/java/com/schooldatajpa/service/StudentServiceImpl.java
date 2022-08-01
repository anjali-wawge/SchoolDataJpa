package com.schooldatajpa.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.schooldatajpa.model.StudentEntity;
import com.schooldatajpa.model.TeacherEntity;
import com.schooldatajpa.repositoryimpl.StudentRepositoryImpl;
import com.schooldatajpa.serviceimpl.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired 
	private StudentRepositoryImpl studentRpository;
	
	@Override
	public Integer saveStudentData(StudentEntity schoolData) {
		StudentEntity s=studentRpository.save(schoolData);
	    return s.getId();
	}

	@Override
	public Integer saveTeacherData(TeacherEntity teacherEntity) {
		
		return null;
	}

	public List<StudentEntity> findStudentByMarksGreaterThan(Float marks){
		List<StudentEntity> listStudent=studentRpository.findStudentByMarksGreaterThan(marks);
		return listStudent;
		
	}
	public List<StudentEntity> findStudentsByAddress(String address){
		
		return studentRpository.findStudentsByAddress(address); 
	}
	
	public List<StudentEntity> findByDateOfBirth(LocalDate fromDate,LocalDate toDate){
		return studentRpository.findByDateOfBirth(fromDate, toDate);
		
	}
	
	public List<StudentEntity> findStudentMraksBetween(Float fromMarks,Float toMarks){
		return studentRpository.findStudentMraksBetween(fromMarks, toMarks);
	}
	
	public List<StudentEntity> findStudentsFromStandard(String std){
		return studentRpository.findStudentsFromStandard(std);
	}
	
	public List<StudentEntity> sortByMarksAscOrder(Sort sort) {
		return studentRpository.sortByMarksAscOrder(sort);
	}
	
}
