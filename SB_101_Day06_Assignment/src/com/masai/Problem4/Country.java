package com.masai.Problem4;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Country {
	
	static Map<String,String> map;
	static String countryName = null;
	
	static {
		
		map = new LinkedHashMap<>();
		
		map.put("Afghanistan", "kabul");
		map.put("Belgium", "Brussels");
		map.put("Canada", "Ottawa");
		map.put("Egypt", "Cairo");
		map.put("Finland", "Helsinki");
		map.put("Greece", "Athens");
		map.put("Hungary", "Budapest");
		map.put("Iraq", "Baghdad");
		map.put("Norway", "Oslo");
		map.put("South Korea", "Seoul");
	}
	
	synchronized void askCapitalName() {
		List<String> list = new ArrayList<>(map.keySet());
		
		while(!list.isEmpty()) {
			
			int index = (int)(Math.random()*list.size());
			
			countryName = list.get(index);
			
			list.remove(countryName);
			
			System.out.println("What is the Capital of "+ countryName);
			
			notify();
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		//notifying the printCapitalName() method after printing all the names
		notify();
		
	}
	
	
	synchronized void printCapitalName() {
		
		//if student got the chance first then it will wait for master to ask the question
		if(countryName == null) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		while(!map.isEmpty()) {
			System.out.println("Capital of the country "+countryName +" is: "+ map.get(countryName));
			System.out.println();
			
			map.remove(countryName);
			
			notify();
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
