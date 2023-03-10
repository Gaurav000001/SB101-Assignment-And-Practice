package com.masai.Problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		ChildThread r1 = new ChildThread(list, sc);
		
		Thread t1 = new Thread(r1);
		
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(list);

	}

}
