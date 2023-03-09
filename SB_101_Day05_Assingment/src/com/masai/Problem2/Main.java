package com.masai.Problem2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r1 = ThreadOperations::reverseArray;
		Runnable r2 = new ThreadOperations()::findNearestToAverage;
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
		RunThread r = Thread::start;
		r.startThread(new Thread(r2));
		
		List<Thread> list = new ArrayList<>();
		list.add(new Thread(r1));
		list.add(new Thread(r2));
		
		list.forEach(i -> i.start());
		
		try {
			Thread.currentThread().sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main Thread Ending");
	}

}
