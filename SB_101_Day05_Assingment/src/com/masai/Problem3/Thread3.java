package com.masai.Problem3;

public class Thread3 extends Thread{
	@Override
	public void run() {
		
		for(int i=601;i<=700;i++) {
			if(Main.isPrime(i)) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
	}
}
