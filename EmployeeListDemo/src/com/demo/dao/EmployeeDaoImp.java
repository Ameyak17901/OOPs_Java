package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.Person;
import com.demo.beans.SalariedEmp;

public class EmployeeDaoImp implements EmployeeDao{

	static List<Employee> elist;
	
	static {
		elist = new ArrayList<>();
		
		elist.add(new SalariedEmp(1,"ameya","785248","s@gmail.com","sales","manager",LocalDate.of(2001,02,28),4520,921));
		elist.add(new ContractEmp(3,"rohit","215421","r@gmail.com","sales","hr",LocalDate.of(2013,12,30),45,4535));
	}
	@Override
	public void save(Employee emp) {
		elist.add(emp);
	}
	@Override
	public List<Employee> findAll() {
		return elist;
	}
	@Override
	public Employee findById(int id) {
		for(Employee e:elist) {
			if(e.getId() == id) {
				return e;
			}
		}
		
		return null;
	}
	
	public boolean deleteById(int id) {
		int ind = elist.indexOf(new Person(id,null,null,null));
		if(ind != -1) {			
			elist.remove(ind);
			return true;
		} 
		return false;
	}
	@Override
	public List<Employee> sortByName() {
		List<Employee> elst = new ArrayList<>(elist.size());
		for(Employee e:elist) {
			elst.add(e);
		}
		elst.sort(null);
		return elst;
	}

}
