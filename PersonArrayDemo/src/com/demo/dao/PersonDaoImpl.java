package com.demo.dao;

import com.demo.beans.Person;

public class PersonDaoImpl implements PersonDao {

	static Person[] parr;
	static int count;
	static {
		parr = new Person[100];
		parr[0] = new Person(1,"jhfj","89812","a@gmail.com");
		parr[1] = new Person(2,"hshafj","92325","h@gmail.com");
		count = 2;
	}
	@Override
	public void save(Person p) {
		parr[count] = p;
		count++;
		
	}
	@Override
	public Person[] findAll() {
		return parr;
	}
	@Override
	public Person findById(int id) {
		for(int i=0; i<count; i++) {
			if(parr[i].getPid() == id) {
				return parr[i];
			}
		}
		return null;
	}

}
