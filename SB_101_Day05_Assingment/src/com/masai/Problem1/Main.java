package com.masai.Problem1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread.currentThread().setName("Akshay");
		
		Thread salman = new Thread(new First(), "Salman");
		Thread hritik = new Thread(new Second(), "Hritik");
		
		
		salman.start();
		hritik.start();
		
		try {
			salman.join();
			hritik.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" "+"Ended");
	}

}
