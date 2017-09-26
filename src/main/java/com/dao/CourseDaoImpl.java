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
	public void createCourse(OepCourse course) {
	//	 TODO Auto-generated method stub
		this.session=MyUtil.getSesso();
		session.beginTransaction();
		session.save(course);
		
		session.getTransaction().commit();
	}
	
	public void insert(){
		// TODO Auto-generated method stub
		OepCourse course = new OepCourse();
		
		course.setCourseId(5);
		course.setCourseDescription("ce");
		course.setCourseName("c++");
		BigDecimal bg;
		Double d =  new Double("21");
		bg = BigDecimal.valueOf(d);
		course.setCourseNoQuestions(bg);
		BigDecimal ps;
		Double ds =  new Double("61");
		ps = BigDecimal.valueOf(ds);
		course.setCoursePassingScore(ps);
		
		
		createCourse(course);
	}
	
	
	
	@Override
	public void deleteCourse(long courseId) {
		// TODO Auto-generated method stub
		
		this.session=MyUtil.getSesso();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         OepCourse course = (OepCourse)session.get(OepCourse.class, courseId); 
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
	public void insert() {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void createCourse(OepCourse course) {
		// TODO Auto-generated method stub
		
	}
	
	
}
