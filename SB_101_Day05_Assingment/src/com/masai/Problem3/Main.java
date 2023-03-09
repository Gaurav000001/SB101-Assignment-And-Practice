package com.masai.Problem3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		
		t1.start();
		try {
			t1.join();
			
			t2.setPriority(7);
			t3.setPriority(3);
			
			t2.start();
			t3.start();
			
			t2.join();
			t3.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Main Thread Ended!");
		

	}
	
	
	
	//Prime checking method
	public static boolean isPrime(int num) {
		
		if(num <= 1) {
			return false;
		}
		
		for(int i=2;i<=(int)Math.sqrt(num);i++) {
			
			if(num%i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
