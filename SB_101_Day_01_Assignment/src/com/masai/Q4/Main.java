package com.masai.Q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		
		Map<String,Student> map = new HashMap<>();
		
		map.put("India", new Student(1, "Gaurav", "gangulygaurav166@gmail.com", 360));
		map.put("USA", new Student(2, "Roshni", "kapoorroshni166@gmail.com", 430));
		map.put("China", new Student(3, "Rajiv", "gangulyrajiv166@gmail.com", 370));
		map.put("Mexico", new Student(4, "Kali", "kalidas166@gmail.com", 260));
		map.put("Australia", new Student(5, "Konda", "kondareddy166@gmail.com", 250));
		map.put("Madagaskar", new Student(6, "Chimani", "ankurchimnani166@gmail.com", 367));
		map.put("Spain", new Student(7, "Rinki", "rinkiyadav166@gmail.com", 460));
		map.put("Dubai", new Student(8, "Payal", "payalavasthi166@gmail.com", 322));
		map.put("Canada", new Student(9, "Shankar", "shankarkumar166@gmail.com", 276));
		map.put("Netherlands", new Student(10, "Prashant", "prashantkumarchaturvedi166@gmail.com", 314));
		
		
		//creating list of Map.Entry<String,Student>
		List<Map.Entry<String,Student>> list = new ArrayList<>();
		
		for(Map.Entry<String, Student> a: map.entrySet()) {
			list.add(a);
		}
		
		//sorting the list
		Collections.sort(list, (o1,o2) -> o2.getValue().getName().compareTo(o1.getValue().getName()));
		
		//creating list of Map<String,Student>
		Map<String,Student> newMap = new LinkedHashMap<>();
		
		//putting values of list in newMap
		for(Map.Entry<String, Student> a: list) {
			newMap.put(a.getKey(), a.getValue());
		}
		
		//printing the newMap sorted by student name in descending order
		for(Map.Entry<String, Student> a: newMap.entrySet()) {
			System.out.println(a.getKey()+"_+_+_+_    "+a.getValue());
		}
	}
}
