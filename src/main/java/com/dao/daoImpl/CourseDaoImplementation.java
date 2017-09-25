package main.java.com.dao.daoImpl;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.oep.dao.CourseDao;
import com.oep.model.OepCourse;
import com.oep.util.EmailValidator;
import com.oep.util.SHA256;
import com.oep.util.SessionUtil;

public class CourseDaoImplementation implements CourseDao 
{
	Scanner sn=new Scanner(System.in);
	private Session session;
	
	
	/*------------------INSERT--------------------------*/
	@Override
	public void insert() 
	{
	    System.out.println("::::Please enter data::::");
	    System.out.println("Please enter ID:");
	    long courseId=sn.nextInt();
	    System.out.println("Please enter course name:");
	    String courseName= sn.next();
	    System.out.println("Please enter course desc:");
	    String desc= sn.next();
	    System.out.println("Please enter no of questions:");
	    int courseQues= sn.nextInt();
	    System.out.println("Please enter mobile:");
	    int coursePassing= sn.nextInt();

		OepCourse e1 = new OepCourse();

	    e1.setCourseDescription(desc);
	    e1.setCourseName(courseName);
	    e1.setCourseNoQuestions(courseQues);
	    e1.setCoursePassingScore(coursePassing);
	    e1.setCourseId(courseId);
	    createCourse(e1);
	}

	/*------------------CREATE--------------------------*/
	@Override
	public void createCourse(OepCourse course) 
	{
		// TODO Auto-generated method stub
		this.session=SessionUtil.getSession();
		session.beginTransaction();
		session.save(course);
		session.getTransaction().commit();
	}
	
	
	/*------------------DELETE--------------------------*/

	@Override
	public void delete(int courseId) {
		this.session=SessionUtil.getSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         OepCourse course =(OepCourse) session.get(OepCourse.class, courseId); 
	         session.delete(course); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
		
	}

	
	@Override
	public String toString()
	{
		OepCourse user = null;
		return "id"+ user.getCourseId();
	}
	
	@Override
	public void retrieve() {
		// TODO Auto-generated method stub
		session=SessionUtil.getSession();
		session.beginTransaction();
		Query qu = session.createQuery("from OepCourse");
		List<OepCourse> list = qu.list();
		System.out.println(list.size());
		for(OepCourse course:list){
			System.out.println(course.getCourseName());
		}
		
	}
	

}

