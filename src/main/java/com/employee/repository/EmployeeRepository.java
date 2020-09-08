package com.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.employee.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	public List<Employee> getEmpByFirstName(String fristName);
	
	@Query("select emp from Employee emp where emp.firstName = :firstNameBind and emp.lastName = :lastNameBind")
	public List<Employee> getEmpByFirstNameAndLastName(@Param("firstNameBind") String  firstName, @Param("lastNameBind") String  lastName);
}
