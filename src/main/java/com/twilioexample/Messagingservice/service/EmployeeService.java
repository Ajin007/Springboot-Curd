package com.twilioexample.Messagingservice.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twilioexample.Messagingservice.model.Employee;
import com.twilioexample.Messagingservice.repository.EmployeeRepository;
/*
 * @autowired == This will create new object 
 * The @Repository annotation from the EmployeeRepository class enabled the creation of a bean of this class through the @ComponentScan feature of Spring.
 *  This bean is then used in the service class using @Autowired annotation. 
 * This is called Dependency Injection in Spring.
 */

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeerepository;
	
	//create employee
	public Employee CreateEmployee(Employee employee){
		return employeerepository.save(employee);
	}
	
	//Read 
	public List<Employee> ReadEmployees(){
		return employeerepository.findAll();
	}

	//Delete
	public void DeleteEmployess(){
		employeerepository.deleteAll();
	}
	
	//Delete by ID
	public void DeletebySingleEmployee(Long id){
		employeerepository.deleteById(id);
	}

	//update
	public Employee UpdateEmployeedata(Long id,Employee employeedetails){
		
		Employee emp=employeerepository.findById(id).get();
		
		emp.setFirstname(employeedetails.getFirstname());
		emp.setLastname(employeedetails.getLastname());
		emp.setEmail(employeedetails.getEmail());
		
		return employeerepository.save(emp);
	
	}

}
