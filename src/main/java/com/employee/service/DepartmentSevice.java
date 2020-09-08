package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Department;
import com.employee.repository.DepartmentRepository;

@Service
public class DepartmentSevice {
	@Autowired
	DepartmentRepository departmentRepository;
	
	public List<Department> getAllDepartments(){
		return departmentRepository.findAll();
	};
	
	public Department geDepById(long id){
		return departmentRepository.findById(id).orElseThrow(null);
	};
	
	public void addDep(Department newDep ) {
		departmentRepository.save(newDep);
	};
	
	public void updateDep(Department newDep ) {
		departmentRepository.save(newDep);
	};
	
	public void deleteDep(long id) {
		departmentRepository.deleteById(id);
	};
	
//	public List<Department> getDepByName(String firstName){
//	return departmentRepository.getDepName(firstName);
//};

}
