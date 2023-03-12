package com.masai.Problem2;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FileOperationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName = "A.txt";
		String contentToWrite = "Originally formed in 1600 purely to trade with the Mughal Empire, the Company needed to secure its commercial posts at Calcutta, Bombay and Madras. It purchased land from Indian rulers to build its settlements on, and recruited native armed forces to protect them. Eventually, these evolved into the Bengal, Bombay and Madras Armies.";
		String contentToAppend = "After successfully battling the French for trading supremacy, and simultaneously involving itself in local politics, the Company became India’s leading power following Robert Clive’s victory at Plassey in 1757. In the years that followed, it expanded its Indian domains.";
		
		
		ReadWriteCenter r = new ReadWriteCenter(fileName, contentToWrite, contentToAppend);
		
		Runnable writeToFile = r::writeToFile;
		Runnable appendToFile = r::appendToFile;
		Callable<List<Integer>> analysis = r::getAnalysis;
		
		Thread t1 = new Thread(writeToFile);
		Thread t2 = new Thread(appendToFile);
		
		t1.start();
		
		try {
			t1.join();
			t2.start();
			t2.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		ExecutorService es = Executors.newFixedThreadPool(1);
		
		Future<List<Integer>> future = es.submit(analysis);
		
		try {
			
			
			System.out.println("Number of digits in file: "+ future.get().get(0));
			System.out.println("Number of letters in file: "+ future.get().get(1));
			System.out.println("Number of Special Characters in file: "+ future.get().get(2));
			
			
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		es.shutdown();
		
		System.out.println("Completed");
	}

}
