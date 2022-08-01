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
@Table(name="student_data")
public class StudentEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="mobile_no")
	private Integer mobileNo;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name="date_of_birth")
	private LocalDate dateOfBirth;
	
	@Column(name="address")
	private String address;
		
	@Column(name="fees")
	private Float fees;
	
	@Column(name="std")
	private String std;
	
	@Column(name="marks")
	private Float marks;

	
	
	public StudentEntity() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Integer mobileNo) {
		this.mobileNo = mobileNo;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Float getFees() {
		return fees;
	}

	public void setFees(Float fees) {
		this.fees = fees;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	public Float getMarks() {
		return marks;
	}

	public void setMarks(Float marks) {
		this.marks = marks;
	}

	
	public StudentEntity(Integer id, String firstName, String lastName, Integer mobileNo, LocalDate dateOfBirth,
			String address, Float fees, String std, Float marks) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.fees = fees;
		this.std = std;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "SchoolDataEntity [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", mobileNo="
				+ mobileNo + ", dateOfBirth=" + dateOfBirth + ", address=" + address + ", fees=" + fees + ", std=" + std
				+ ", marks=" + marks + "]";
	}

	
	
}
