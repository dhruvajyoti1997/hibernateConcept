import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.hibernate.nativesql.Student;


public class criteriaApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//We have created Criteria Api.
		SessionFactory sf = new Configuration().configure("com/hibernate/nativesql/hibernate.cfg.xml")
				.buildSessionFactory();
		
		Session s = sf.openSession();
		
		//Creating the criteria 
	Criteria c=	s.createCriteria(Student.class);
	
	//adding conditions to check whether the address is equal to given address(kharagpur).
	c.add(Restrictions.eq("address","Kharagpur"));
	
	//condition for the name starts with a.
	 c.add(Restrictions.ilike("studentName","a%"));
	List<Student> Student = c.list();
	
	Object students;
	for(Student e : Student) {
		
		System.out.println(e);
	}
	
	
	s.close();
	
	

	}

}
