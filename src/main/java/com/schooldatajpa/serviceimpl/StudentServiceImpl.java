package com.schooldatajpa.serviceimpl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.schooldatajpa.model.StudentEntity;
import com.schooldatajpa.repository.StudentRepository;
import com.schooldatajpa.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRpository;

	@Override
	public boolean saveStudentData(List<StudentEntity> studentEntityList) {
		boolean isAlreadyExist = false;
		for (int i = 0; i <= studentEntityList.size() - 1; i++) {
			StudentEntity studentObj = studentRpository.findByMobileNo(studentEntityList.get(i).getMobileNo());
			if (studentObj == null) {
				studentRpository.save(studentEntityList.get(i));
			} else {
				isAlreadyExist = true;
			}
		}
		return isAlreadyExist;
	}

	public List<StudentEntity> findStudentByMarksGreaterThan(Float marks) {
		List<StudentEntity> listStudent = studentRpository.findStudentByMarksGreaterThan(marks);
		return listStudent;

	}

	public List<StudentEntity> findStudentsByAddress(String address) {

		return studentRpository.findStudentsByAddress(address);
	}

	public List<StudentEntity> findByDateOfBirth(LocalDate fromDate, LocalDate toDate) {
		return studentRpository.findByDateOfBirth(fromDate, toDate);

	}

	public List<StudentEntity> findStudentMraksBetween(Float fromMarks, Float toMarks) {
		return studentRpository.findStudentMraksBetween(fromMarks, toMarks);
	}

	public List<StudentEntity> findStudentsFromStandard(String std) {
		return studentRpository.findStudentsFromStandard(std);
	}

	public List<StudentEntity> sortByMarksAscOrder(Sort sort) {
		return studentRpository.sortByMarksAscOrder(sort);
	}

	public List<StudentEntity> getAllStudentDataUsingJoin() {
		return studentRpository.getAllStudentDataUsingJoin();

	}

	@Override
	public List<StudentEntity> getAllStudentsByTeacherName(String teacherName) {
		return studentRpository.getAllStudentsByTeacherName(teacherName);
	}

	public List<StudentEntity> getAllStudentBySameStartChar(String firstLetter) {

		return studentRpository.getAllStudentBySameStartChar(firstLetter);
	}

	@Override
	public List<StudentEntity> getAllStudentsBySubjectId(Integer subjectId) {
	
		return studentRpository.getAllStudentsBySubjectId(subjectId);
	}

}
