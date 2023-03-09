package com.masai.Problem1;

public class Second implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int multi = 1;
		for(int i=1;i<11;i++) {
			multi *= i;
		}
		System.out.println(Thread.currentThread().getName()+" "+multi);
	}

}
