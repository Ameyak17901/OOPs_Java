package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	void addNewEmployee(int ch);

	List<Employee> displayAll();

	Employee displayById(int id);

	boolean deleteById(int id);

	List<Employee> sortByName();
	
}
