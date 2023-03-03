package com.masai.Q4;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Student> list = new HashSet<>();
		
		list.add(new Student(1, "Gaurav", "gangulygaurav166@gmail.com", 360));
		list.add(new Student(2, "Roshni", "kapoorroshni166@gmail.com", 430));
		list.add(new Student(3, "Rajiv", "gangulyrajiv166@gmail.com", 877));
		list.add(new Student(4, "Kali", "kalidas166@gmail.com", 576));
		list.add(new Student(5, "Konda", "kondareddy166@gmail.com", 709));
		list.add(new Student(6, "Chimani", "ankurchimnani166@gmail.com", 988));
		list.add(new Student(7, "Rinki", "rinkiyadav166@gmail.com", 460));
		list.add(new Student(8, "Chinki", "payalavasthi166@gmail.com", 909));
		list.add(new Student(8, "Chinki", "payalavasthi166@gmail.com", 909));
		list.add(new Student(8, "Chinki", "payalavasthi166@gmail.com", 909));
		list.add(new Student(9, "Shankar", "shankarkumar166@gmail.com", 276));
		list.add(new Student(10, "Prashant", "prashantkumarchaturvedi166@gmail.com", 600));
		list.add(new Student(10, "Prashant", "prashantkumarchaturvedi166@gmail.com", 600));
		list.add(new Student(10, "Prashant", "prashantkumarchaturvedi166@gmail.com", 600));
		
		list.forEach(System.out::println);
		System.out.println();
		
		Set<Student> set = list.stream().distinct().filter(i -> i.getMarks()>500).collect(Collectors.toSet());
		set.forEach(System.out::println);
	}

}
