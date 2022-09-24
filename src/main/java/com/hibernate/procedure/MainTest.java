package com.hibernate.procedure;
import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.springframework.jdbc.object.StoredProcedure;
import com.hibernate.procedure.EmpProc;

public class MainTest {

	 @SuppressWarnings({ "unchecked", "deprecation" })
	public static void main(String[] args) {
// Creating the configuration instance & passing the hibernate configuration file.
	Configuration conf = new Configuration();
	conf.configure("com/hibernate/procedure/hibernate.cfg.xml").addAnnotatedClass(EmpProc.class);
	
	// Hibernate session object to start the db transaction.
	Session sessn = conf.buildSessionFactory().openSession();
	// Fetching the data from the database using stored procedure queries.
	 
    // Stored procedure query #1
    System.out.println(":::: Find ename, edsig, edept from employees ::::");
  //StoredProcedureQuery department =sessn.createStoredProcedureQuery("myProcedureName");
//    department.registerStoredProcedureParameter("emp_department", String.class, ParameterMode.IN);
//
//   
    /*FALSE CODE*/
//    PreparedStatement st= sessn.connection().prepareStatement("{call findEmpById(?)}");
//    
//	st.setInt(1, 2);
//	System.out.println(st.toString());
//	
//	st.execute();
//	tx.commit();
    /*FALSE CODE*/
	}

}
