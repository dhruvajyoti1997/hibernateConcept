package com.com.hibernate.annotation;

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
       //For Annotation configuration
    	Configuration context = new Configuration();  
    	context.configure("com/com/hibernate/annotation/hibernate.cfg.xml").addAnnotatedClass(Employees.class); 
    	
    	SessionFactory sf= context.buildSessionFactory(); 
    	Session session = sf.openSession(); 
    	 Transaction trans = session.beginTransaction(); 
    	 
    	 EmployeeAddress address= new EmployeeAddress();
    	 address.setPermanentaddress("Kharagpur");
    	 address.setCurrentaddress("Kolkata");
    	 
    	 
    	 Employees emp = new Employees();
    	 /* 
    	  * to set name and other credentials
    	  * */
    	 emp.setFullName("DhruvaJyoti Pramanik");
    	 emp.setEmpaddress(address);
    	 //emp.setEmpId(23);
    	 
    	 /*
    	  * to get the details of employees we have to use session.get();
    	  * */
//    	Employees e= (Employees) session.get(Employees.class, 2);
//    	System.out.println(e.getFullName() +" "+e.getEmpId());
    	
    	session.save(emp);
    	trans.commit();
    	 
    }
}
