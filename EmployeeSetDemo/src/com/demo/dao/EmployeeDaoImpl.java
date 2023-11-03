package com.demo.dao;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.Person;
import com.demo.beans.SalariedEmp;
import com.demo.beans.Vendor;

public class EmployeeDaoImpl implements EmployeeDao{
	static Set<Employee> eset;
	
	static {
		eset = new HashSet<>();
		eset.add(new ContractEmp(2,"saurabh","54564","s@gmail.com","development","developer",LocalDate.of(2023, 02, 1),45,454289));
		eset.add(new SalariedEmp(1,"Ameya","452154","a@gmail.com","development","developer",LocalDate.of(2023, 02, 4),45212,4542));
	}

	@Override
	public void save(Employee emp) {
		eset.add(emp);
		
	}

	@Override
	public boolean updateSalById(int id,double sal) {
		for(Employee e : eset) {
			if(e != null)	
				if(e instanceof SalariedEmp) {
					((SalariedEmp)e).setSal(sal);
				}
				else if(e instanceof ContractEmp) {
					((ContractEmp)e).setCharges(sal);
				} else {
					((Vendor)e).setAmt(sal);
				}
				return true;
			}
			return false;
		}

	@Override
	public Set<Employee> findAll() {
		return eset;
	}

	@Override
	public Employee findById(int id) {
		for(Employee e:eset) {
			if(e.getId() == id) {
				return e;
			}
		}
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		for(Employee e:eset) {
			if(((Person)e).getId() == id) {
				eset.remove(e);
				return true;
			}
		}
		return false;
	}

	@Override
	public Set<Employee> sortByName() {
		TreeSet <Employee> ts = new TreeSet<>();
		for(Employee e: eset) {
			ts.add(e);
		}
		return ts;
	}

	@Override
	public Set<Employee> sortBySal() {
		Comparator<Employee> sal = (o1,o2) ->{
			double sal1,sal2;
			if(o1 instanceof SalariedEmp) {
				sal1 = ((SalariedEmp)o1).getSal();
			} else if(o1 instanceof ContractEmp) {
				sal1 = ((ContractEmp)o1).getCharges();
			} else {
				sal1 = ((Vendor)o1).getAmt();
			}
			
			if(o2 instanceof SalariedEmp) {
				sal2 = ((SalariedEmp)o2).getSal();
			} else if(o1 instanceof ContractEmp) {
				sal2 = ((ContractEmp)o2).getCharges();
			} else {
				sal2 = ((Vendor)o2).getAmt();
			}
			return (int)(sal2 - sal1);
		};
		
		TreeSet<Employee> ts = new TreeSet<>(sal);
		
		for(Employee e: eset) {
			ts.add(e);
		}
		return ts;
	}
}
