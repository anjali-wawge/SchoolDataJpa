package com.schooldatajpa.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="teacher_data")
public class TeacherEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="teacher_name")
	private String teacherName;
	
	@Column(name="mobile_no")
	private Integer mobileNo;
	
	@Column(name="subject_specif")
	private String subjectSpecif;
	
	@Column(name="address")
	private String address;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "date_of_birth")
	private LocalDate dateOfBirth;

	@Override
	public String toString() {
		return "TeacherEntity [id=" + id + ", teacherName=" + teacherName + ", mobileNo=" + mobileNo
				+ ", subjectSpecif=" + subjectSpecif + ", address=" + address + ", dateOfBirth=" + dateOfBirth + "]";
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
			LocalDate dateOfBirth) {
		super();
		this.id = id;
		this.teacherName = teacherName;
		this.mobileNo = mobileNo;
		this.subjectSpecif = subjectSpecif;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
	}
	
	
}
