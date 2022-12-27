package com.xworkz.criminal.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.criminal.entity.CriminalEntity;
@Component
public class CrimnalRepositoryImpl implements CriminalRepository {
	@Autowired
	EntityManagerFactory factory;

	@Override
	public boolean save(CriminalEntity entity) {
		System.out.println("criminal in PatientRepositoryImpl");
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
	public Optional<List<CriminalEntity>> findByNameOrjailName(String name, String jailName) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByNameOrjailName");
			query.setParameter("nm", name);
			query.setParameter("jn",jailName );
	
			return Optional.ofNullable(query.getResultList());
		} catch (PersistenceException e) {
			e.getMessage();
		} finally {
			manager.close();
		}
		return Optional.empty();
}
}