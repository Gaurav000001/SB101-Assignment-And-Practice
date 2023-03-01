package com.masai.Q4;

import java.util.ArrayList;
import java.util.List;

import com.masai.Q2.Student;

@FunctionalInterface
interface Intr {	
	public List<Student> findStudent(List<Student> student);
}

public class Main {
	
	public static List<Student> find(List<Student> student){
		
		Intr i = (st) -> {
			List<Student> list = new ArrayList<>();
			for(Student a: student) {
				if(a.getMarks() < 500) {
					list.add(a);
				}
			}
			return list;
		};
		
		return i.findStudent(student);
	}
	
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(1, "Sagar", "Chandigarh", 484));
		list.add(new Student(2, "Pankaj", "Haryana", 346));
		list.add(new Student(3, "Palak", "New Delhi", 886));
		list.add(new Student(4, "Payal", "Panji", 556));
		list.add(new Student(5, "Kshitija", "Manali", 222));
		
		
		Intr e = Main::find;
		
		List<Student> students = e.findStudent(list);
		
		students.forEach(System.out::println);
		
	}
}
