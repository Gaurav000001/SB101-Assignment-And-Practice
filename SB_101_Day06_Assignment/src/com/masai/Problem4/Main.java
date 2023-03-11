package com.masai.Problem4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country c = new Country();
		
		Master m = new Master(c);
		Student s = new Student(c);
		
		m.start();
		s.start();
		
		try {
			m.join();
			s.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Question Answer round Ended!");
	}

}
