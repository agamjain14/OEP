package com.dao;

import com.model.OepUser;

public interface UserDao {
	public void createUser(OepUser user);
	
	public void insert();
	
	//public OepUser validateUser(OepUser user);
	public void checkUser(String Username,String pass);
	public void retrieve();
	
	public void update(long userId, String userType);
	
	public void delete(long userId);
}
