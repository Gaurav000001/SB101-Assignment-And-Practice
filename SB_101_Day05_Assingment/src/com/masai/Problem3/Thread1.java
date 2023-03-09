package com.masai.Problem3;

public class Thread1 extends Thread{
	@Override
	public void run() {
		
		for(int i=201;i<=300;i++) {
			if(Main.isPrime(i)) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
	}
}
