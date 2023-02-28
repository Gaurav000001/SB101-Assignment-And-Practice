package com.masai.Q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<String> cities = new ArrayList<>();
		
		cities.add("Gurgao");
		cities.add("Delhi");
		cities.add("Jahanabad");
		cities.add("Bamleshbari");
		cities.add("Chandrapur");
		cities.add("Nagpur");
		cities.add("Pune");
		cities.add("Mumbai");
		cities.add("Raipur");
		cities.add("Shrinivaspur");
		cities.add("Thane");
		cities.add("Uti");
		cities.add("Punji");
		
		
//		Comparator<String> comp = (o1, o2) -> o2.compareTo(o1);
		
		Collections.sort(cities, (o1, o2) -> o2.compareTo(o1));
		for(String a: cities) {
			System.out.println(a);
		}
	}
}
