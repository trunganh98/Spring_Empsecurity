package com.example.springempsecurity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springempsecurity.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// that's it ... no need to write any code LOL!
	
	// add a method to sort by last name
	public List<Employee> findAllByOrderByLastNameAsc();
	
	// search by name
	public List<Employee> findByFirstNameContainsOrLastNameContainsAllIgnoreCase(String name, String lName);

}
