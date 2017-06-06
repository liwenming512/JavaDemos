package com.yiibai.mypackage;

import com.yiibai.mypackage.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration().configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tran = session.beginTransaction();
		
		Employee e = new Employee();
		e.setId(1);
		e.setFirstName("eFirstName");
		e.setLastName("eLastName");
		
		session.persist(e);
		
		tran.commit();
		
		session.close();
		
		System.out.println("saved.");
	}

}
