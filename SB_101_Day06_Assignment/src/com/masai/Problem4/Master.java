package com.masai.Problem4;

public class Master extends Thread{
	
	Country c = new Country();
	
	public Master(Country c) {
		// TODO Auto-generated constructor stub
		this.c = c;
	}
	
	@Override
	public void run() {
		c.askCapitalName();
	}

}
