package com.xworkz.mall.repository;

import java.time.LocalTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.mall.entity.AdminEntity;

@Component
public class MallRepositoryImpl implements MallRepository {

	@Autowired
	private EntityManagerFactory factory;

//	@Override
//	public boolean save(AdminEntity entity) {
//		System.out.println("save in MallRepositoryImpl");
//		System.out.println("Patient in PatientRepositoryImpl");
//		EntityManager manager = factory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		try {
//			transaction.begin();
//			manager.persist(entity);
//			transaction.commit();
//		} catch (Exception e) {
//			e.getStackTrace();
//			transaction.rollback();
//		} finally {
//			manager.close();
//		}
//
//		return true;
//	}

	@Override
	public AdminEntity findByAdminNameAndpassword(String adminName, String password) {
		EntityManager createEntityManager = factory.createEntityManager();
		try {
			Query createNamedQuery = createEntityManager.createNamedQuery("findByAdminNameAndpassword");
			createNamedQuery.setParameter("nm", adminName);
			createNamedQuery.setParameter("pd", password);
			Object resultList = createNamedQuery.getSingleResult();
			System.out.println(resultList);
			if (resultList != null) {
				AdminEntity ref = (AdminEntity) resultList;
				System.out.println("result is present" + resultList);
				return ref;
			} else {
				System.out.println("result is not present");
				return null;
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			createEntityManager.close();
		}
		return null;
	}

	@Override
	public AdminEntity updateNoOfWrongAttemptsByName(String adminName, int noOfWrongAttempt) {
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updateNoOfWrongAttemptsByName");
			query.setParameter("nm", adminName);
			query.setParameter("na", noOfWrongAttempt);
			int executeUpdate = query.executeUpdate();
			transaction.commit();
			System.out.println(executeUpdate);
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			createEntityManager.close();
		}
		return null;
	}

	@Override
	public AdminEntity findByName(String adminName) {
		EntityManager createEntityManager = factory.createEntityManager();
		try {
			Query query = createEntityManager.createNamedQuery("findByName");
			query.setParameter("nm", adminName);
			Object singleResult = query.getSingleResult();
			if (singleResult != null) {
				AdminEntity refe = (AdminEntity) singleResult;
				System.out.println("list is present" + refe);
				return refe;

			} else {
				System.out.println("list is null");
				return null;
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			createEntityManager.close();
		}
		return null;
	}

	@Override
	public AdminEntity updatefirstLoginByName(String adminName, int firstLogin) {
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updatefirstLoginByName");
			query.setParameter("nm", adminName);
			query.setParameter("lg", firstLogin);
			int executeUpdate = query.executeUpdate();
			transaction.commit();
			System.out.println(executeUpdate);

		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			createEntityManager.close();
		}
		return null;
	}

	@Override
	public AdminEntity updateAccountLockedByName(String adminName, String accountLocked) {
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updateAccountLockedByName");
			query.setParameter("nm", adminName);
			query.setParameter("al", accountLocked);
			int executeUpdate = query.executeUpdate();
			transaction.commit();
			System.out.println(executeUpdate);
			return null;
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			createEntityManager.close();
		}
		return null;
	}

	@Override
	public AdminEntity updateGeneratedPasswordByName(String adminName, String generatedPassword) {
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updateGeneratedPasswordByName");
			query.setParameter("nm", adminName);
			query.setParameter("gpas", generatedPassword);
			int executeUpdate = query.executeUpdate();
			transaction.commit();
			System.out.println(executeUpdate);
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			createEntityManager.close();
		}
		return null;
	}

	@Override
	public AdminEntity updatePasswordByGeneratedPassword(String generatedPassword, String password) {
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updatePasswordByGeneratedPassword");
			query.setParameter("ps", password);
			query.setParameter("gs", generatedPassword);
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			createEntityManager.close();
		}
		return null;
	}

	@Override
	public AdminEntity findByMallName(String name) {
		EntityManager createEntityManager = factory.createEntityManager();
		try {
			Query query = createEntityManager.createNamedQuery("findByMallName");
			query.setParameter("mn", name);
			Object singleResult = query.getSingleResult();
			if (singleResult != null) {
				AdminEntity refe = (AdminEntity) singleResult;
				System.out.println("result is not null" + refe);
				return refe;

			} else {
				System.out.println("result is null");
				return null;
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			createEntityManager.close();
		}
		return null;

	}

	@Override
	public AdminEntity updateGeneratedPasswordByMallName(String name, String generatedPassword) {
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updateGeneratedPasswordByMallName");
			query.setParameter("mn", name);
			query.setParameter("gs", generatedPassword);
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			createEntityManager.close();
		}
		return null;

	}

	@Override
	public AdminEntity updateLoginCountByAdminName(String adminName, int loginCount) {
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updateLoginCountByAdminName");
			query.setParameter("nm", adminName);
			query.setParameter("lc", loginCount);
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			createEntityManager.close();
		}
		return null;
	}

	@Override
	public AdminEntity updateTimeByMall(String name, LocalTime time) {
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updateTimeByMallName");
			query.setParameter("mn", name);
			query.setParameter("ti", time);
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			createEntityManager.close();
		}
		return null;

	}

	@Override
	public AdminEntity updateAccountUnlockByName(String name, String accountLocked) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Query query = manager.createNamedQuery("updateAcountUnlockByName");
			query.setParameter("mn", name);
			query.setParameter("al", accountLocked);
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();
		} catch (PersistenceException e) {

			e.printStackTrace();
			transaction.rollback();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public AdminEntity updateNoOfWrongAttemptsByMallName(String name, int noOfWrongAttempts) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Query query = manager.createNamedQuery("updateNoOfWrongAttemptsByMallName");
			query.setParameter("mn", name);
			query.setParameter("noof", noOfWrongAttempts);
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public AdminEntity finfByGeneratedPassword(String generatedPassword) {
		EntityManager manager = factory.createEntityManager();

		try {
			Query query = manager.createNamedQuery("findByGeneratedPassword");
			query.setParameter("ps", generatedPassword);
			Object singleResult = query.getSingleResult();
			if (singleResult != null) {
				AdminEntity ref = (AdminEntity) singleResult;
				System.out.println("data is present" + singleResult);
				return ref;
			} else {
				System.out.println("data is not present");
				return null;
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public AdminEntity updateGeneratedPasswordTimeByGeneratedPassword(String generatedPassword,
			LocalTime generatedPasswordTime) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Query query = manager.createNamedQuery("updateGeneratedPasswordTimeByGeneratedPassword");
			query.setParameter("gp", generatedPassword);
			query.setParameter("gpt", generatedPasswordTime);
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();
		} catch (PersistenceException e) {

			e.printStackTrace();
			transaction.rollback();
		} finally {
			manager.close();
		}

		return null;

	}
}
