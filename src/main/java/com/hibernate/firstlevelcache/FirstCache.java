package com.hibernate.firstlevelcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.nativesql.*;

public class FirstCache {
	public static void main(String[] args) {

		// First Level Cache
		SessionFactory sf = new Configuration().configure("com/hibernate/nativesql/hibernate.cfg.xml")
				.buildSessionFactory();

		Session s = sf.openSession();
		// Session s = sf.getCurrentSession();

		// by default cache enabled
		// this student object is cached in session memory,
		// if we again call the object then it will not call db

		Student std = (Student) s.get(Student.class, 6);
		System.out.println(std);

		System.out.println(s.contains(std)); 
		// to check whether the object is stored in cache memory? return a boolean

		s.close();
	}
}
