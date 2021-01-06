package sbexample.SpringBootWithHibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sbexample.SpringBootWithHibernate.entity.Employee;
import sbexample.SpringBootWithHibernate.service.SpringService;

@RestController
public class SpringController {

	// Dependancy Injection
	@Autowired
	SpringService springService;
	
	@RequestMapping("myallemployeedata")
	public List<Employee> getallEmployees() {
		
	List<Employee> empLiast = 	springService.getallEmployees();
	
		return empLiast;
	}
	
	@RequestMapping("myemployeedatausingid/{id}")
	public List<Employee> getEmployeeById(@PathVariable int id) {
		
	List<Employee> empLiast = 	springService.getEmployeeById(id);
	
	if(!empLiast.isEmpty()) {
		return empLiast;
	}else {
		System.out.println("Record Not Found");
		return null;
	}
	}
	@RequestMapping("myemployeedatausingname/{name}")
	public List<Employee> getEmployeeByName(@PathVariable String name) {
		
	List<Employee> empLiast = 	springService.getEmployeeByName(name);
	
	if(!empLiast.isEmpty()) {
		return empLiast;
	}else {
		System.out.println("Record Not Found");
		return null;
	}
	}
	
}
