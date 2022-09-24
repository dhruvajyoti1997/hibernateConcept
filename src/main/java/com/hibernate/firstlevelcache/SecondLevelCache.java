package com.hibernate.firstlevelcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.com.hibernate.annotation.*;

public class SecondLevelCache {

	public static void main(String[] args) {
		// Configuration for Second level cache
		SessionFactory sf = new Configuration().configure("com/com/hibernate/annotation/hibernate.cfg.xml").addAnnotatedClass(Employees.class)
				.buildSessionFactory();
		//first session
		Session s1 = sf.openSession();
		
		Employees emp = (Employees) s1.get(Employees.class, 1);
		System.out.println(emp);
		s1.close();
		
		System.out.println("Process On Going!!!!!! after first database hit it will not hit again");
		//second session
		Session s2 = sf.openSession();
		Employees emp2 = (Employees) s2.get(Employees.class, 1);
		System.out.println(emp2);
		s2.close();
		
	}

}
