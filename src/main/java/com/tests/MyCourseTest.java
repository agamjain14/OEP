package main.java.com.tests;

import java.util.Scanner;
import com.oep.util.*;
import com.oep.dao.CourseDao;
import com.oep.dao.UserDao;
import com.oep.dao.impl.CourseDaoImplementation;
import com.oep.dao.impl.UserDaoImplementation;
import com.oep.model.OepUser;

public class MyCourseTest {
	public static void main(String[] args) {	
		user();
		course();
	}
	public static void user()
	{
		UserDao ud = new UserDaoImplementation();
		Scanner input = new Scanner(System.in);
		
	ud.insert();
/*
	System.out.println("Successfully inserted");
	
	System.out.println("enter user id to delete");
	long id= input.nextLong();
	ud.delete(id);
			
	System.out.println("enter the user id to update");
	long userid = input.nextLong();
			
	System.out.println("enter the type");
	String usertype = input.next();
			
	//ud.update(userid, usertype);
*/	
	ud.retrieve();
	}
	public static void course()
	{
		CourseDao cd = new CourseDaoImplementation();
		Scanner input = new Scanner(System.in);
	cd.insert();

	System.out.println("Successfully inserted");
	/*
	System.out.println("enter user id to delete");
	int id= input.nextInt();
	cd.delete(id);
			
*/
	cd.retrieve();
	}
}
