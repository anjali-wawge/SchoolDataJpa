package com.schooldatajpa.repository;

import com.schooldatajpa.model.SchoolEventEntity;

public interface SchoolEventRepository {

	public void saveSchoolEvent(SchoolEventEntity schoolEventEntity) throws Exception;
	
	
}
