package com.com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	Configuration context = new Configuration();  //create of configuration class obj
    	context.configure("hibernate.cfg.xml"); //it will load the xml.
    	
    	SessionFactory sf= context.buildSessionFactory(); //creation of immutable obj
    	Session session = sf.openSession(); //create jdbc connection
    	 Transaction trans = session.beginTransaction(); //
    	 
    	 Employees emp = new Employees();
    	 
    	 emp.setFullName("Deepam Acharya");
    	 emp.setFullName("Sumit Rajan");
    	
    	session.save(emp);
    	trans.commit();
    	 
    }
}
