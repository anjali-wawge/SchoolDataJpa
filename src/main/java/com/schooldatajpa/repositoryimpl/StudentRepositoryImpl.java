package com.schooldatajpa.repositoryimpl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.schooldatajpa.model.StudentEntity;

public interface StudentRepositoryImpl extends JpaRepository<StudentEntity, Integer> {

	@Query("SELECT s FROM StudentEntity s WHERE s.marks >= ?1")
	List<StudentEntity> findStudentByMarksGreaterThan(Float marks);
	
	//diff diff queries student search by address,adrdess n marks,by first name address
	
	//Search by address
	@Query("SELECT s FROM StudentEntity s WHERE s.address = ?1")
   	List<StudentEntity> findStudentsByAddress(String address);
	
	//search by date of birth between
	@Query("SELECT s FROM StudentEntity s WHERE s.dateOfBirth BETWEEN ?1 AND ?2")
	List<StudentEntity> findByDateOfBirth(LocalDate fromDate, LocalDate toDate);
	
	//search by marks between
	@Query("SELECT s FROM StudentEntity s WHERE s.marks BETWEEN ?1 AND ?2")
	List<StudentEntity> findStudentMraksBetween(Float fromMarks,Float toMarks);
	
	//ListOfStudents from one standard
	@Query("SELECT s FROM StudentEntity s WHERE s.std = ?1")
	List<StudentEntity> findStudentsFromStandard(String std);
	
	//sort in asc order by marks
	@Query("SELECT s FROM StudentEntity s")
	List<StudentEntity> sortByMarksAscOrder(Sort sortingParameter);
	
	//Inner join 
}
