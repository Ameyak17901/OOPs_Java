package com.demo.beans;

public class Employee {
	private int id;
	private String name;
	private String mobile;
	public Employee() {
		super();
	}
	public Employee(int id, String name, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", mobile=" + mobile + "]";
	}
	
	public int hashCode() {
		return id;
	}
	public boolean equals(Object ob) {
		return this.id == ((Employee)ob).id;
	}
}
