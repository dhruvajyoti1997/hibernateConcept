package com.hibernate.nativesql;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.math.BigInteger;
import java.util.*;

public class NativeSqlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		SessionFactory sf = new Configuration().configure("com/hibernate/nativesql/hibernate.cfg.xml")
				.buildSessionFactory();

		Session s = sf.openSession();
		// SQL Query
		String query = "select s_id,s_name from tbl_students";

		Query nq = s.createSQLQuery(query);

		List<Object[]> li = nq.list();
		for (Object[] objects : li) {
			Integer studentId=  (Integer)objects[0];
			String stdname = (String) objects[1];
			
			System.out.println("id====="+ studentId);
			System.out.println("Address======="+ stdname);
			
		}
} catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}
		

	}

}
