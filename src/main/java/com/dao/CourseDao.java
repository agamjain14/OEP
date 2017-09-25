package main.java.com.dao;

import java.util.List;

import com.oep.model.OepCourse;

public interface CourseDao {
	public void createCourse(OepCourse course);
	
	public void insert();
	
	public void retrieve();
		
	public void delete(int courseId);


}
