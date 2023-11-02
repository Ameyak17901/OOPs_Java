package com.demo.beans;

public class Person {
	private int pid;
	private String pname;
	private String mobile;
	private String email;
	
	// default constructor
	public Person() {
		super();
	}
	
	// Parameterized constructor
	public Person(int pid, String pname, String mobile, String email) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.mobile = mobile;
		this.email = email;
	}
	
	// return person id
	public int getPid() {
		return pid;
	}
	// sets person id
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	// returns person name
	public String getPname() {
		return pname;
	}
	// sets person name
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	// returns mobile number
	public String getMobile() {
		return mobile;
	}
	// sets mobile number
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	// returns email
	public String getEmail() {
		return email;
	}
	
	// sets email id
	public void setEmail(String email) {
		this.email = email;
	}
	
	// to string method overridden for person class
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", mobile=" + mobile + ", email=" + email + "]";
	}
	
}
