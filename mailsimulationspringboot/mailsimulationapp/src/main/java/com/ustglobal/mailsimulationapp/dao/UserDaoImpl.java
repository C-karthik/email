package com.ustglobal.mailsimulationapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.ustglobal.mailsimulationapp.dto.UserBean;

@Repository
public class UserDaoImpl implements IUserDao {
	
	@PersistenceUnit
	EntityManagerFactory factory;
	
	@Override
	public boolean register(UserBean userBean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		try {
			manager.persist(userBean);
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;	
		}
		
	}

	@Override
	public boolean login(String email, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changePassword(UserBean userBean, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean sendEmail(String toAddress, String subject, String message) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean viewInbox(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean sentItems(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteItems(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean draft(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
