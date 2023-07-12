package com.twilioexample.Messagingservice.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twilioexample.Messagingservice.model.Employee;
import com.twilioexample.Messagingservice.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class MessageController {
	
	@Autowired
	EmployeeService employeeservcie;
	
	
	//post creation
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee){
		return employeeservcie.CreateEmployee(employee);
		
	}
	
	//Get Creation
	@GetMapping("/employees")
	public List<Employee> ReadEmployee(){
		return employeeservcie.ReadEmployees();
		
	}
	
	@DeleteMapping("/employees/{empId}")
	public void DeletebyID(@PathVariable(value="empId") Long id){
		 employeeservcie.DeletebySingleEmployee(id);;
	}

	
	@PutMapping("/employees/{empId}")
	public Employee updateEmployee(@PathVariable(value="empId") Long id,@RequestBody Employee employeedetails){
		return employeeservcie.UpdateEmployeedata(id, employeedetails);
	}
}
