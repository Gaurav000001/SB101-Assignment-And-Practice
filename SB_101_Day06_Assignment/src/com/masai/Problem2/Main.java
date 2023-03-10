package com.masai.Problem2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Odds t1 = new Odds();
		
		t1.start();
		
		for(int i=0;i<=20;i++) {
			synchronized(t1){
				try {
					if(i%2 == 0) System.out.print(i+" ");
					else {
			
						
						t1.notify();
						t1.wait();
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Ended");
	}

}
