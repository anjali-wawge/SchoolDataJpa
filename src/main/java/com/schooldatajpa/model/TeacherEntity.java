package com.schooldatajpa.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "teacher_data") 
public class TeacherEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "teacher_name")
	private String teacherName;

	@Column(name = "mobile_no")
	private Integer mobileNo;

	@Column(name = "subject_specif")
	private String subjectSpecif;

	@Column(name = "address")
	private String address;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "date_of_birth")
	private LocalDate dateOfBirth;

	// https://www.bezkoder.com/jpa-one-to-many/#JPA_One_to_Many
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "teacherEntity")
	private List<StudentEntity> studentEntity;
	
	@ManyToMany
	@JoinTable(name = "teacher_subject",joinColumns = @JoinColumn(name = "teacher_id"),inverseJoinColumns = @JoinColumn(name="subject_id"))
	Set<SubjectEntity> subject;
	
	
	public Set<SubjectEntity> getSubject() {
		return subject;
	}

	public void setSubject(Set<SubjectEntity> subject) {
		this.subject = subject;
	}

	public List<StudentEntity> getStudentEntity() {
		return studentEntity;
	}

	public void setStudentEntity(List<StudentEntity> studentEntity) {
		this.studentEntity = studentEntity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Integer getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Integer mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getSubjectSpecif() {
		return subjectSpecif;
	}

	public void setSubjectSpecif(String subjectSpecif) {
		this.subjectSpecif = subjectSpecif;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public TeacherEntity(Integer id, String teacherName, Integer mobileNo, String subjectSpecif, String address,
			LocalDate dateOfBirth, List<StudentEntity> studentEntity) {
		super();
		this.id = id;
		this.teacherName = teacherName;
		this.mobileNo = mobileNo;
		this.subjectSpecif = subjectSpecif;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.studentEntity = studentEntity;
	}

	public TeacherEntity() {
		
	}

	
	
}
