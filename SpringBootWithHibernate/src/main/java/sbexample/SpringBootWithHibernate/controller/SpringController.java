package sbexample.SpringBootWithHibernate.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sbexample.SpringBootWithHibernate.entity.Employee;
import sbexample.SpringBootWithHibernate.service.SpringService;

@RestController
public class SpringController {

	// Dependancy Injection
	@Autowired
	SpringService springService;
	
	/* **Bharti US-BA -1111 
	  Adding New api***/
	
	@RequestMapping("/getArray")
	public ArrayList<String> getArray() {
		ArrayList<String> al=new ArrayList<>();
		al.add("ABC");
		al.add("PQR");
		al.add("GHJ");
		al.add("ASDFGHJKm");
		return al;
		}
	
	
	 @RequestMapping("myallemployeedata")
	public List<Employee> getallEmployees() {
		
		
		System.out.println("Changes....");
		
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
	@RequestMapping("myemployeedatausingname/{name}")
	public List<Employee> getEmployeeByNameCheck(@PathVariable String name) {
		
	List<Employee> empLiast = 	springService.getEmployeeByName(name);
	
	if(!empLiast.isEmpty()) {
		return empLiast;
	}else {
		System.out.println("Record Not Found");
		return null;
	}
	}
	/*
	 * @Auther Ankita  US Name:BA-1234
	 * code for updating employee by their id
	 * @return
	 */
	@PutMapping("updateEmployeeUsingId/{id}")
	public List<Employee> updateEmployeeById(@PathVariable int id) {
		
	List<Employee> empLiast = 	springService.getEmployeeById(id);
	
	if(!empLiast.isEmpty()) {
		return empLiast;
	}else {
		System.out.println("Record Not Found");
		return null;
	}
	
	}
}
