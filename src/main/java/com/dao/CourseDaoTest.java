package dao;

public class CourseDaoTest {

	public static void main(String[] args) {
		
		CourseDao cd = new CourseDaoImpl();
		cd.insert();
		
		//cd.updateCourse(1,"java++");
		
		//cd.deleteCourse(5);
		System.out.println("cool bro!!!!");
		//System.out.println("data is inserted!!!!");
		//System.out.println("data is updated!!!!");
		System.out.println("data is deleted!!!!");
		
	}

}
