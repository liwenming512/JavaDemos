package com.yiibai;

import com.yiibai.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final StandardServiceRegistry reg = 
				new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		SessionFactory sessionFactory = 
				new MetadataSources(reg).buildMetadata().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setFirstName("e1f");
		e1.setLastName("e1l");
		
		Employee e2 = new Employee();
		e1.setId(1);
		e1.setFirstName("e2f");
		e1.setLastName("e2l");
		
		Employee e3 = new Employee();
		e1.setId(1);
		e1.setFirstName("e3f");
		e1.setLastName("e3l");
		
		session.persist(e1);
		session.persist(e2);
		session.persist(e3);
		
		tran.commit();
		session.close();
		System.out.println("saved");
	}

}
