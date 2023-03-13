package com.masai.problem3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(1, "Gaurav", 494, "303833", new Address("Maharashtra", "Chandrapur", 442401)));
		list.add(new Student(2, "Akshay", 933, "445677", new Address("Chhattisgarh", "Raipur", 493383)));
		list.add(new Student(3, "Kunal", 373, "435674", new Address("Karnataka", "Kurnul", 337223)));
		list.add(new Student(4, "Saurav", 595, "683276", new Address("Maharashtra", "Bhandara", 393727)));
		list.add(new Student(5, "Vaibhav", 493, "853367", new Address("Karnataka", "Tunnel", 393838)));
		
		ObjectOutput oo = new ObjectOutputStream(new FileOutputStream("studentdata.ser"));
		
		for(Student a: list) {
			oo.writeObject(a);
		}
		
		oo.close();
	}

}
