package com.dao;



import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.OepCourse;
import model.OepQuestion;
import util.MyUtil;


public class QuestionsDaoImplementation implements QuestionDao  {
	private static final long question_id = 0;
	private Session session;
	


	public void storedb() {
		// TODO Auto-generated method stub
	
			try{
			
			
			FileInputStream input = new FileInputStream("C:\\Users\\Administrator\\Desktop\\exam.xls");
			POIFSFileSystem fs = new POIFSFileSystem( input );
			HSSFWorkbook wb = new HSSFWorkbook(fs);
			HSSFSheet sheet = wb.getSheetAt(0);
			Row row;
			for(int i=1; i<=sheet.getLastRowNum(); i++){
				Configuration cfg=new Configuration().configure("hibernate.cfg.xml");		
				SessionFactory factory=cfg.buildSessionFactory();
				Session session=factory.openSession();
				Transaction t=session.beginTransaction();
				
				row = sheet.getRow(i);
			
				    long question_id = (long) row.getCell(0).getNumericCellValue();
	                long course_id=(long) row.getCell(1).getNumericCellValue();
	                String question_description= row.getCell(2).getStringCellValue();                
	                String question_answer= row.getCell(3).getStringCellValue(); 
	                String optiona= row.getCell(4).getStringCellValue();
	                String optionb= row.getCell(5).getStringCellValue();
	                String optionc=row.getCell(6).getStringCellValue();
	                String optiond=row.getCell(7).getStringCellValue();
	                String optione=row.getCell(8).getStringCellValue();
	                String status=row.getCell(9).getStringCellValue();
				
				OepCourse oepCourse=(OepCourse) session.get(OepCourse.class, course_id);
				OepQuestion oep_questions=new OepQuestion();
				oep_questions.setQuestionId(question_id);
				oep_questions.setOepCourse(oepCourse);
				oep_questions.setQuestionDescription(question_description);
				oep_questions.setQuestionAnswer(question_answer);
				oep_questions.setQuestionOptiona(optiona);
				oep_questions.setQuestionOptionb(optionb);
				oep_questions.setQuestionOptionc(optionc);
				oep_questions.setQuestionOptiond(optiond);
		
				oep_questions.setQuestionStatus(status);
				session.save(oep_questions);
				t.commit();
				session.close();
						
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}
}

