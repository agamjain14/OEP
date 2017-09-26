package com.oep.dao.impl;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;

import com.oep.dao.ExamDAO;
import com.oep.model.OepCourse;
import com.oep.model.OepResult;
import com.oep.model.OepResultPK;
import com.oep.model.OepUser;
import com.oep.util.SessionUtil;

public class ExamDAOImpl implements ExamDAO{

	private Session session;
	@Override
	public void retrieve() {
		// TODO Auto-generated method stub
		session = SessionUtil.getSession();
		session.beginTransaction();
		Query qu = session.createQuery("from OepCourse");
		List<OepCourse> list = qu.list();
		System.out.println(list.size());
		for(OepCourse user:list){
			System.out.println(user.getCourseName());
		}
		
	}
	@Override
	public void storeResult(OepResult result) 
	{
		// TODO Auto-generated method stub
		this.session=SessionUtil.getSession();
		session.beginTransaction();
		session.save(result);
		session.getTransaction().commit();
	}
	@Override
	public void enrollTest() {
		retrieve();
		Scanner sc=new Scanner(System.in);
		String course=sc.nextLine();
		//will take test based on course
		OepResultPK id=(OepResultPK) session.get(OepResultPK.class,101);
		OepCourse course_id=(OepCourse) session.get(OepCourse.class,201);
		OepUser user_id=(OepUser) session.get(OepUser.class,301);
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		BigDecimal bg;
		Double d =  new Double("70");
		bg = BigDecimal.valueOf(d);
		OepResult res = new OepResult();
		res.setId(id);
		res.setOepCourse(course_id);
		res.setOepUser(user_id);
		res.setResultDate(date);
		res.setResultScore(bg);
		res.setResultStatus("PASS");
	    storeResult(res);
	    System.out.println("inserted");
	}

}
