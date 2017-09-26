package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import model.OepResult;
import model.OepUser;
import MyUtil.MyUtil;

public class ViewResultImpl implements ViewResult {
	private Session	session=MyUtil.getSession();
	
	@Override
	public void viewResult() {
		// TODO Auto-generated method stub
		
		session=MyUtil.getSession();
		session.beginTransaction();
		System.out.println("retriving");
		Query qu = session.createQuery("from OepResult");
		List<OepResult> list = qu.list();
		System.out.println(list.size());
		for(OepResult result:list){
			System.out.println(result.getResultStatus());
			System.out.println(result.getResultScore());
			System.out.println(result.getResultDate());
		}
		
	}	
	/*public void add(OepResult oepResult)
	{
		session.beginTransaction();
		session.save(oepResult);
		session.getTransaction().commit();
	}
	
	public void viewData()
	{
		session.beginTransaction();
		List<OepResult> list=new ArrayList<>();
		list=session.createQuery("from OepResult").list();
		for(OepResult r:list)
		{
			System.out.println(r.getResultStatus()+" retrived");
		}
	}*/
}
