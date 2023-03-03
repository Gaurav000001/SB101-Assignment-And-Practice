package com.masai.Q2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(1, "Gaurav", "gangulygaurav166@gmail.com", 360));
		list.add(new Student(2, "Roshni", "kapoorroshni166@gmail.com", 430));
		list.add(new Student(3, "Rajiv", "gangulyrajiv166@gmail.com", 370));
		list.add(new Student(4, "Kali", "kalidas166@gmail.com", 260));
		list.add(new Student(5, "Konda", "kondareddy166@gmail.com", 250));
		list.add(new Student(6, "Chimani", "ankurchimnani166@gmail.com", 367));
		list.add(new Student(7, "Rinki", "rinkiyadav166@gmail.com", 460));
		list.add(new Student(8, "Payal", "payalavasthi166@gmail.com", 322));
		list.add(new Student(9, "Shankar", "shankarkumar166@gmail.com", 276));
		list.add(new Student(10, "Prashant", "prashantkumarchaturvedi166@gmail.com", 314));
		
		
		list.stream().sorted((o1,o2) -> o1.getMarks()>o2.getMarks()?-1:1).limit(1).forEach(System.out::println);
	}

}
