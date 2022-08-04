package com.schooldatajpa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.format.datetime.DateFormatter;

import com.schooldatajpa.model.SchoolEventEntity;
import com.schooldatajpa.repository.SchoolEventRepository;

@SpringBootApplication
public class SchoolDataJpaApplication {

	@Autowired
	private SchoolEventRepository schoolEventRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SchoolDataJpaApplication.class, args);
	}

	
}
