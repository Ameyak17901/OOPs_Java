package com.demo.service;

import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeService {

	void addNewEmployee(int ch);

	Set<Employee> displayAll();

	Employee displayById(int id);

	boolean deleteById(int id);

	Set<Employee> sortByName();

	boolean modifySalById(int id,double sal);

	Set<Employee> sortBySal();
	
}
