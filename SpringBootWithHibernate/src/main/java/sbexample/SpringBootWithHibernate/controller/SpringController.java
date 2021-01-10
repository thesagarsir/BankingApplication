package sbexample.SpringBootWithHibernate.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	/*
	 * Vikash Kumar US BNY-456 : Added method printMessage() 
	 */
	
	@GetMapping(value = "/welcomemessage")
	public String printMessage() {
		String str = springService.printMessage();
		return str;
	}
	
	/* **Bharti US-BA -1111 
	  Adding New api***/
	
	@RequestMapping("/getArray")
	public ArrayList<String> getArray() {
		System.out.println("*****I am in request Mapping*******");
		ArrayList<String> al=new ArrayList<>();
		al.add("ABC");
		al.add("PQR");
		al.add("GHJ");
		return al;
		}
	
	// Mayur Added welcome api
	@RequestMapping("welcome")
	public String welcomMsg(){
		return "hiii welcome";
	}
	
	 @RequestMapping("myallemployeedata")
	public List<Employee> getallEmployees() {
		
		
		System.out.println("Changes....");
		System.out.println("*************I am in myallemployeedata*************");
		
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
	@RequestMapping("myemployeedatausingname2/{name}")
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
	/*
	 * @Auther Ankita  US Name:BA-1234
	 * code for updating employee by their name
	 * @return
	 */
	@PutMapping("updateEmployeeUsingName/{name}")
	public List<Employee> updateEmployeeByName(@PathVariable String name) {
	List<Employee> empLiast = 	springService.getEmployeeByName(name);
	if(!empLiast.isEmpty()) {
	return empLiast;
	}else {
		System.out.println("Record Not Found");
		return null;
	}
	}
	/*
	 * @Ankita US-BA-2
	 * deleted employee by customer id*/
	@DeleteMapping("deleteEmployeeUsingId/{id}")
	public List<Employee> deleteEmployeeById(@PathVariable int id)
	{
	List<Employee> empLiast = 	springService.getEmployeeById(id);
	if(!empLiast.isEmpty()) {
		return empLiast;
	}else {
		System.out.println("Record Not Found");
		return null;
	}
	}
	/*
	 * @Ankita US-BA-3
	 * deleted employee by customer name*/
	@RequestMapping("deleteEmployeeByName/{name}")
	public void deleteEmployeeByName(@PathVariable String name) {
		Employee emp=springService.deleteEmployeeByName(name);
		
	}
	
	
}
