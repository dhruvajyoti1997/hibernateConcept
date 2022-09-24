package com.hibernate.nativesql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.nativesql.*;

public class MainTest {
	public static void main(String[] args) {
		Configuration context = new Configuration(); // create of configuration class obj
		context.configure("com/hibernate/nativesql/hibernate.cfg.xml"); // it will load the xml.

		SessionFactory sf = context.buildSessionFactory(); // creation of immutable obj
		Session session = sf.openSession(); // create jdbc connection
		Transaction trans = session.beginTransaction(); //

		Student std = new Student();

		std.setStudentId(6);
		std.setStudentName("Soumodeep basak");
		std.setAddress("Kolkata");
		std.setAge(24);

		session.save(std);
		trans.commit();
	}
}
