package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Person;
import com.demo.dao.PersonDaoImpl;
import com.demo.dao.PersonDao;


public class PersonServiceImpl implements PersonService {

	private PersonDao pdao;
	
	public PersonServiceImpl() {
		pdao = new PersonDaoImpl();
	}
	@Override
	public void addNewPerson() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pid:");
		int id = sc.nextInt();
		System.out.println("Enter the name: ");
		String nm = sc.next();
		System.out.println("Enter the mobile: ");
		String mobile = sc.next();
		System.out.println("Enter the email: ");
		String email = sc.next();
		
		Person p = new Person(id,nm,mobile,email);
		pdao.save(p);
	}
	@Override
	public Person[] displayAll() {
		return pdao.findAll();		
	}
	@Override
	public Person displayById(int id) {
		return pdao.findById(id);
	}
	

}
