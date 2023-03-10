package com.masai.Problem5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallingThread r1 = new CallingThread("Gaurav", new A());
		CallingThread r2 = new CallingThread("Saurav", new A());
		CallingThread r3 = new CallingThread("Raghav", new A());
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
