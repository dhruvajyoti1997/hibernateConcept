package com.hibernate.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapTest {

	public static void main(String[] args) {

		Configuration cgf = new Configuration();
		cgf.configure("com/hibernate/map/hibernate.cfg.xml").addAnnotatedClass(question.class);

		SessionFactory session = cgf.buildSessionFactory();
		Session session1 = session.openSession(); // create jdbc connection
		Transaction trans = session1.beginTransaction();
		// create a question

		question q1 = new question();
		q1.setQuestionId(222);
		q1.setQuestion("Types of constructor");

		// create an answer

		Answer ans = new Answer();
		ans.setAnswerId(111);
		ans.setAnswer("Parameterized Constructor, Default Constructor, No Argument Constructor");

		q1.setAnswer(ans); // set the ans from the question field
		// Session

		session1.save(q1);

		trans.commit();
		session1.close();
		session.close();

	}

}
