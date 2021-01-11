package sbexample.SpringBootWithHibernate.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import sbexample.SpringBootWithHibernate.configuration.SpringConfiguration;
import sbexample.SpringBootWithHibernate.entity.Employee;

@Repository
public class SpringDao {

	
	SessionFactory sessionFactory = SpringConfiguration.getSession();
	
	/*
	 * Vikash Kumar US BNY-456 : Added method printMessage()
	 */
	
	public String printMessage() {
		String s = "Welcome in JavaByKiran";
		return s;
	}
	
		public List<Employee> getallEmployees() {

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> empList = criteria.list();
		
		return empList;
	}

	public List<Employee> getEmployeeById(int id) {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("id", id));
		
		List<Employee> empList = criteria.list();
		
		return empList;
	}

	public List<Employee> getEmployeeByName(String name) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("name", name));
		
		List<Employee> empList = criteria.list();
		
		return empList;
	}

	

}
