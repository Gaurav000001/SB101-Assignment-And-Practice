package com.masai.Problem5;

public class CallingThread implements Runnable {
	
	A a;
	String name;
	
	public CallingThread(String name, A a) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized(A.class) {
			
			a.sayHello(name);
		}

	}

}
