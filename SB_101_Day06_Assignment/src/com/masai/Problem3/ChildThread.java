package com.masai.Problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChildThread implements Runnable{
	
	List<String> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public ChildThread(List<String> list, Scanner sc) {
		// TODO Auto-generated constructor stub
		this.list = list;
		this.sc = sc;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<4;i++) {
			System.out.print("Enter city name: ");
			String name = sc.nextLine();
			
			list.add(name);
		}
		
		
	}

}
