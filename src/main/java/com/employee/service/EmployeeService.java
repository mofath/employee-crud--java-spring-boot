package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employee.repository.EmployeeRepository;

import com.employee.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeReposiory;
	
	public List<Employee> getAllEmployees(){
		return employeeReposiory.findAll();
	};
	
	public Employee geEmpById(long id){
		return employeeReposiory.findById(id).orElseThrow(null);
	};
	
	public List<Employee> getEmpByFirstName(String firstName){
		return employeeReposiory.getEmpByFirstName(firstName);
	};
	
	public List<Employee> getEmpByFirstNameAndLastName(String firstName, String lastName){
		return employeeReposiory.getEmpByFirstNameAndLastName(firstName, lastName);
	};
	
	public void addEmp(Employee newEmp ) {
		employeeReposiory.save(newEmp);
	};
	
	public void updateEmp(Employee newEmp ) {
		employeeReposiory.save(newEmp);
	};
	
	public void deleteEmp(long id) {
		employeeReposiory.deleteById(id);
	};
}
 