package com.schooldatajpa.repositoryImpl;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.schooldatajpa.model.SchoolEventEntity;
import com.schooldatajpa.repository.SchoolEventRepository;

@Repository
public class SchoolEventRepositoryImpl implements SchoolEventRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void saveSchoolEvent(SchoolEventEntity schoolEventEntity) throws Exception {
		try {
			entityManager.persist(schoolEventEntity);
		} catch (EntityExistsException e) {
			throw new Exception(e);
		}
	}

}
