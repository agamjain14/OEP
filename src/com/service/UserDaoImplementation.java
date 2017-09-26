package com.service;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dao.UserDao;
import com.model.OepUser;
import com.util.MyUtil;

public class UserDaoImplementation implements UserDao {
	private Session session;

	@Override
	public void retrieve() {
		// TODO Auto-generated method stub
		session=MyUtil.getSession();
		session.beginTransaction();
		Query qu = session.createQuery("from OepUser");
		List<OepUser> list = qu.list();
		System.out.println(list.size());
		for(OepUser user:list){
			System.out.println(user.getUserEmail());
		}
		
	}		
	
	@Override
	public void createUser(OepUser user) {
		// TODO Auto-generated method stub
		this.session=MyUtil.getSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
	}
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		OepUser user = new OepUser();
		
		user.setUserId(6);
		user.setUserFname("a6");
		user.setUsername("a5");
		user.setUserPassword("fss");
		user.setUserEmail("ahh@gmail.com");
		BigDecimal bg;
		Double d =  new Double("245");
		bg = BigDecimal.valueOf(d);
		user.setUserMobileNo(bg);
		user.setUserRole("NUSER");
		user.setUserStatus("ACTIVE");
		
		
		createUser(user);
	}
	@Override
	public void delete(long userId) {
		// TODO Auto-generated method stub
		this.session=MyUtil.getSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         OepUser user = (OepUser)session.get(OepUser.class, userId); 
	         session.delete(user); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
		
	}
	@Override
	public void update(long userId, String userType) {
		// TODO Auto-generated method stub
		this.session=MyUtil.getSession();
		Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         
	         OepUser user = (OepUser)session.get(OepUser.class, userId); 
	         
	         user.setUserRole("ADMIN");
	         
			 session.update(user);
			 
	         tx.commit();
	         
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	}


	@Override
	public void checkUser(String username, String password) {
		// TODO Auto-generated method stub
		this.session=MyUtil.getSession();
		session.beginTransaction();
		
		Query query=session.createQuery("from OepUser u where u.username=\'"+username+"\' and u.userPassword=\'"+password+"\'");
		List li=query.list();
		System.out.print(username+" "+password);
		System.out.println(li.size());
		if(li.size()==1)
			System.out.println("User Authenticated");
		else
			System.out.println("Authentication Failed");
	}
}

