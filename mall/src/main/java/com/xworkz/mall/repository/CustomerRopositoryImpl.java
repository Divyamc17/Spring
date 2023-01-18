package com.xworkz.mall.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.mall.entity.CustomerEntity;
import com.xworkz.mall.entity.CustomerFeedbackEntity;
@Component
public class CustomerRopositoryImpl implements CustomerRopository {

	@Autowired
	private EntityManagerFactory factory;
	@Override
	public boolean save(CustomerEntity entity) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(entity);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
		}
		return false;
	}
	@Override
	public boolean save(CustomerFeedbackEntity entity) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(entity);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
		}
		return false;
		
	}

	}
