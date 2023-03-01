package com.masai.Q5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.masai.Q2.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Student> map = new HashMap<>();
		
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
		
		
		Comparator<Map.Entry<String,Student>> comp = (s1, s2) -> s2.getValue().getName().compareTo(s1.getValue().getName());
		
		List<Map.Entry<String, Student>> list = new ArrayList<>(map.entrySet());
		
		Collections.sort(list, comp);
		
		Map<String,Student> linkedMap = new LinkedHashMap<>();
		
		for(Map.Entry<String, Student> a: list) {
			linkedMap.put(a.getKey(), a.getValue());
			System.out.println(a);
		}
		
	}

}
