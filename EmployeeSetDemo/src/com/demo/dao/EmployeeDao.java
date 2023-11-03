package com.demo.dao;

import java.util.Set; 

import com.demo.beans.Employee;

public interface EmployeeDao {

	void save(Employee emp);

	boolean updateSalById(int id,double sal);

	Set<Employee> findAll();

	Employee findById(int id);

	boolean deleteById(int id);

	Set<Employee> sortByName();

	Set<Employee> sortBySal();
	
}
