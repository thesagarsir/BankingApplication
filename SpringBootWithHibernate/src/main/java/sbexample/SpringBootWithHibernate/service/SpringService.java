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
	
	/*
	 * Vikash Kumar US BNY-457 : Added method primeNumber() to make API for prime number.
	 */
	
	public String primeNumber(int num) {
		boolean flag = false;
		for (int i = 2; i <= num / 2; i++) {
			try {
				if (num % i == 0) {
					flag = true;
					break;
				}
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}
		if (!flag) {
			System.out.println(num + " is a prime number.");
			return num + " is a prime number.";
		} else {
			System.out.println(num + " is not a prime number.");
			return num + " is not a prime number.";
		}
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

	public List<Employee> getemployeebystatus(String status) {
		// TODO Auto-generated method stub
		List<Employee> emplist=springDao.getemployeebystatus(status);
		
		return  emplist;
	}
}
