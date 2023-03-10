package com.masai.Problem2;

public class Odds extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized(this){
			for(int i=1;i<=20;i++) {
				if(i%2 == 1) System.out.print(i+" ");
				else {
					
					if(i == 20) {
						break;
					}
					
					try {
						this.notify();
						this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		

	}

}
