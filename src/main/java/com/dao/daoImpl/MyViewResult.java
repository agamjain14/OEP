package DAO;

import java.util.Scanner;

import model.OepResult;

public class MyViewResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc=new Scanner(System.in);
		
		OepResult oepResult=new OepResult();
		
		ViewResult vw=new ViewResultImpl();
		vw.viewResult();		
	}

}
