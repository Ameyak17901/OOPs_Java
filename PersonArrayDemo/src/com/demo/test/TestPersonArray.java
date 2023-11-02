package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Person;
import com.demo.service.*;

public class TestPersonArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		PersonService ps = new PersonServiceImpl();
		do {
			System.out.println("1. add new Person\n2. display all\n3. display by Id\n4. close\n Enter choice");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				ps.addNewPerson();
				break;
			case 2:
				Person[] arr = ps.displayAll();
				
				/*
				for(int i=0; i<arr.length; i++) {
					System.out.println(arr[i]);
				}
				*/
				
				for(Person p : arr) {
					if(p != null) {						
						System.out.println(p);
					} else {
						break;
					}
				}
				break;
			case 3:
				System.out.println("Enter the id:");
				int id = sc.nextInt();
				Person p = ps.displayById(id);
				if(p!= null) {
					System.out.println(p);
				} else {
					System.out.println("not found");
				}
				break;
			case 4:
				System.out.println("Thank you for visiting...");
				sc.close();
			default:
				System.out.println("wrong choice");
			}
		} while(choice != 4);
	}

}
