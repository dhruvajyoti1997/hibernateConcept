package com.hibernate.map2;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Maintest {

	public static void main(String[] args) {

		Configuration cgf = new Configuration();
		cgf.configure("com/hibernate/map2/hibernate.cfg.xml").addAnnotatedClass(question1.class);

		SessionFactory session = cgf.buildSessionFactory();
		Session session1 = session.openSession(); // create jdbc connection
		Transaction trans = session1.beginTransaction();
		// create a question

		question1 q1 = new question1();
		q1.setQuestionId(255);
		q1.setQuestion("What is constructor? Types of constructor");

		// create an answer for one question many answers @onetomany

		Answer1 ans = new Answer1();
		ans.setAnswerId(345);
		ans.setAnswer("3 Types");
		ans.setQuestion(q1);

		
		Answer1 ans1 = new Answer1();
		ans1.setAnswerId(999);
		ans1.setAnswer("Parameterized Constructor, Default Constructor, No Argument Constructor");
		ans.setQuestion(q1);
	
		
		Answer1 ans2 = new Answer1();
		ans2.setAnswerId(788);
		ans2.setAnswer("Same as class name");
		ans.setQuestion(q1);
		
		List<Answer1> li = new ArrayList<Answer1>();
		li.add(ans); li.add(ans1); li.add(ans2);
		
		
		 // set the ans from the question field
		q1.setAnswer(li);
		// Session save

		session1.save(q1);
		session1.save(ans1);
		session1.save(ans);
		session1.save(ans2);

		question1 q11= (question1) session1.get(question1.class, 255);
		System.out.println(q11.getQuestion());
		
		for(Answer1 ans11 : q11.getAnswer()) {
			System.out.println(ans11.getAnswer());
		}
		trans.commit();
		session1.close();
		session.close();

	}

}
