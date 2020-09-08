package com.employee.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/emp")
	public List<Employee> getAllEmployees(){
		return empService.getAllEmployees();
	}
	
	@GetMapping("/empid")
	public Employee getEmpById(@RequestParam long id){
		return empService.geEmpById(id);
	}
	
	@GetMapping("/empname")
	public List<Employee> getEmpByFirstName(@RequestParam String firstName){
		return empService.getEmpByFirstName(firstName);
	};
	
	@GetMapping("/empsearch")
	public List<Employee> getEmpByFirstNameAndLastName(@RequestParam String firstName, @RequestParam String lastName){
		return empService.getEmpByFirstName(firstName);
	};
	
	
	@PostMapping("/employee")
	public String addEmp(@RequestBody Employee newEmp) {
		empService.addEmp(newEmp); 
		return "Saved Successfully";
	};
	
	@PutMapping("/employee")
	public String updateEmp(@RequestBody Employee newEmp) {
		empService.updateEmp(newEmp); 
		return "Updated Successfully";
	};
	
	@DeleteMapping("/employee")
	public String deleteEmp(@RequestParam long id) {
		empService.deleteEmp(id); 
		return "Deleted Successfully";
	};
}
