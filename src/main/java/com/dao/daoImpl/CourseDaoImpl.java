package dao;

import java.math.BigDecimal;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import model.OepCourse;
import model.OepUser;
import util.MyUtil;

public class CourseDaoImpl implements CourseDao {

	private Session session;
	@Override
	   
	 @Override
	public void updateCourse(long CourseId,String courseName) {
		// TODO Auto-generated method stub
	
		this.session=MyUtil.getSesso();
		Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         
	         OepCourse course = (OepCourse)session.get(OepCourse.class, CourseId); 
	         
	         course.setCourseName("core++");
	         
			 session.update(course);
			 
	         tx.commit();
	         
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	}
	
	
	
	
		
		
}
