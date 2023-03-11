package com.masai.Problem4;

public class Student extends Thread{
	
	Country c = new Country();
	
	public Student(Country c) {
		// TODO Auto-generated constructor stub
		this.c = c;
	}
	
	@Override
	public void run() {
		c.printCapitalName();
	}
}
