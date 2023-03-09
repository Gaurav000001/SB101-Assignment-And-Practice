package com.masai.Problem1;

public class First implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=1;i<11;i++) {
			sum += i;
		}
		
		System.out.println(Thread.currentThread().getName()+" "+sum);
	}

}
