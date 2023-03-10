package com.masai.Problem1;

public class Main extends Thread{
	
//	@Override
//	public void run() {
//		
//	}
	
	public static void printOdds() {
		for(int i=1;i<=20;i++) {
			if(i%2 == 1) System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void printEvens() {
		for(int i=0;i<=20;i++) {
			if(i%2 == 0) System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r1 = Main::printOdds;
		Runnable r2 = Main::printEvens;
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
		

	}

}
