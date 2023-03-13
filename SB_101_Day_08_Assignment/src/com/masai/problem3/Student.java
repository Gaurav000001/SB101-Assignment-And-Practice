package com.masai.problem3;

import java.io.Serializable;

public class Student implements Serializable{
	private int roll;
	private String name;
	private int marks;
	private transient String Password;
	private Address address;
	
	
	public Student(int roll, String name, int marks, String password, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		Password = password;
		this.address = address;
	}
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", Password=" + Password + ", address="
				+ address + "]";
	}
	
	
}
