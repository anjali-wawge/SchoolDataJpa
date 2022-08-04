package com.schooldatajpa.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.schooldatajpa.model.SchoolEventEntity;
import com.schooldatajpa.service.SchoolEventService;

@RestController
public class SchoolEventController {

	@Autowired
	private SchoolEventService schoolEventService;
	
	@PostMapping(value = "/saveSchoolEvent",consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> saveSchoolEvent(@RequestBody SchoolEventEntity schoolEventEntity) {
		try {
			schoolEventService.saveSchoolEntity(schoolEventEntity);
		}catch(Exception e) {
			return new ResponseEntity<>("Data Already Exist",HttpStatus.FOUND);
		}
		return ResponseEntity.ok("Data Saved");	
	}
}
