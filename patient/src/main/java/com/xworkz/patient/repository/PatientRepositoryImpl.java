package com.xworkz.patient.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.patient.entity.PatientEntity;

@Component
public class PatientRepositoryImpl implements PatientRepository {
	@Autowired
	EntityManagerFactory factory;

	@Override
	public boolean save(PatientEntity entity) {
		System.out.println("Patient in PatientRepositoryImpl");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(entity);
			transaction.commit();
		} catch (Exception e) {
			e.getStackTrace();
			transaction.rollback();
		} finally {
			manager.close();
		}

		return true;
	}

	@Override
	public Optional<List<PatientEntity>> findByName(String name, int greaterThanAge, int lesserThanAge) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByNameOrAgeGreatherThanOrAgeLesserThan");
			query.setParameter("nm", name);
			query.setParameter("ag", greaterThanAge);
			query.setParameter("ae", lesserThanAge);
			return Optional.ofNullable(query.getResultList());
		} catch (PersistenceException e) {
			e.getMessage();
		} finally {
			manager.close();
		}
		return PatientRepository.super.findByName(name, greaterThanAge, lesserThanAge);
	}

// Query or Criteria 
	public Optional<List<PatientEntity>> findByQuery(String query) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query jql = manager.createQuery(query);// String
			return Optional.ofNullable(jql.getResultList());
		} catch (PersistenceException e) {
			e.getMessage();
		} finally {
			manager.close();
		}
		return PatientRepository.super.findByQuery(query);
	}

	@Override
	public List<PatientEntity> findByEmail(String email) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByEmail");
		query.setParameter("em", email);
		List resultList = query.getResultList();
		if (resultList.isEmpty()) {
			System.out.println("mail id can save");
			return null;
		} else if (!resultList.isEmpty()) {
			System.out.println("mail id is duplicated and alrdy saved");
			return resultList;
		}

		return null;
	}

	@Override
	public List<PatientEntity> findByMobileNo(long mobileNo) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByEmail");
		query.setParameter("mb", mobileNo);
		List resultList = query.getResultList();
		if (resultList.isEmpty()) {
			System.out.println("mobileNo can save");
			return null;
		} else if (!resultList.isEmpty()) {
			System.out.println("mobileNo is duplicated and alrdy saved");
			return resultList;
		}
		return null;
	}

}
