package com.xworkz.temple.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.temple.entity.TempleEntity;

@Component
public class TempleRepositoryImpl implements TempleRepository {
	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(TempleEntity entity) {
		System.out.println("temple in TempleRepositoryImpl");
		EntityManager mr = factory.createEntityManager();
		EntityTransaction tn = mr.getTransaction();
		try {
			tn.begin();
			mr.persist(entity);
			tn.commit();
		} catch (Exception e) {
			e.getStackTrace();
			tn.rollback();
		} finally {
			mr.close();
		}
		return true;
	}

	@Override
	public Optional<List<TempleEntity>> findByGod(String god) {
		System.out.println("running findByGod in repo " + god);
		EntityManager manager = this.factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByGod");
			query.setParameter("gd", god);
			return Optional.ofNullable(query.getResultList());
		} finally {
			manager.close();
			System.out.println("Closing entity manager");
		}

	}

}
