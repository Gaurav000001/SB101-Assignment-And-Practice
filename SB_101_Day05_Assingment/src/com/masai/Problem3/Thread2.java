package com.masai.Problem3;

public class Thread2 extends Thread{
	@Override
	public void run() {
		
		for(int i=400;i>=301;i--) {
			if(Main.isPrime(i)) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
	}
}
