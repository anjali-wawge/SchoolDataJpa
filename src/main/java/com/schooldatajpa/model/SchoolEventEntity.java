package com.schooldatajpa.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"event_name","start_date"})}, name = "school_event")
public class SchoolEventEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="event_name")
	private String eventName;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name="registration_date")
	private LocalDate registrationDate;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name="start_date")
	private LocalDate startdate;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name="end_date")
	private LocalDate endDate;
	
	@Column(name="fees")
	private Float fees;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public LocalDate getStartdate() {
		return startdate;
	}

	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Float getFees() {
		return fees;
	}

	public void setFees(Float fees) {
		this.fees = fees;
	}
	
}
