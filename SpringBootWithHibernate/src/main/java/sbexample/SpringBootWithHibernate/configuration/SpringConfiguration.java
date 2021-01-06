package sbexample.SpringBootWithHibernate.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import sbexample.SpringBootWithHibernate.entity.Employee;

public class SpringConfiguration {
	
	
	
	public static SessionFactory getSession(){
		  
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);
		System.out.println("CFG file read successfully...!!");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		return factory;
		  
	  }
	
	

}
