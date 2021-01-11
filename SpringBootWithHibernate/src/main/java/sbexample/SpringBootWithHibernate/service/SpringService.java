package sbexample.SpringBootWithHibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbexample.SpringBootWithHibernate.dao.SpringDao;
import sbexample.SpringBootWithHibernate.entity.Employee;

@Service
public class SpringService {

	@Autowired
	SpringDao springDao;
	
	/*
	 * Vikash Kumar US BNY-456 : Added method printMessage()
	 */
	public String printMessage() {
		String s = springDao.printMessage();
		return s;
	}
	
	public List<Employee> getallEmployees() {

		List<Employee> empList = springDao.getallEmployees();
		
		return empList;
	}

	public List<Employee> getEmployeeById(int id) {
		List<Employee> empList = springDao.getEmployeeById(id);
		
		return empList;
	}

	public List<Employee> getEmployeeByName(String name) {
		List<Employee> empList = springDao.getEmployeeByName(name);
		
		return empList;
	}

	public Employee deleteEmployeeByName(String name) {
		Employee emp=(Employee) springDao.getEmployeeByName(name);
		return emp;
	}

	

}
