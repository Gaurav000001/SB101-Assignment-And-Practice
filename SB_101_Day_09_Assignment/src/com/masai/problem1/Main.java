package com.masai.problem1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r1 = Main::fib;
		Runnable r2 = Main::reverse;
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		try {
			t1.join();
			
			t2.start();
			
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main method ends here!");
	}
	
	public static void fib() {
		int[] arr = new int[10];
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i=2;i<arr.length;i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		Arrays.stream(arr).forEach(i -> System.out.print(i+" "));
		System.out.println();
	}
	
	
	public static void reverse() {
		for(int i=10;i>=1;i--) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
