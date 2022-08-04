package com.schooldatajpa.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schooldatajpa.model.SchoolEventEntity;
import com.schooldatajpa.repository.SchoolEventRepository;
import com.schooldatajpa.service.SchoolEventService;

@Service
public class SchoolEventServiceImpl implements SchoolEventService{

	@Autowired
	private SchoolEventRepository schoolEventRepository;
	
	@Override
	public void saveSchoolEntity(SchoolEventEntity schoolEventEntity) throws Exception{
		
		schoolEventRepository.saveSchoolEvent(schoolEventEntity);
	}

}
