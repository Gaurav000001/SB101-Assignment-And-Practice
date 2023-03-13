package com.masai.problem3;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		
		List<Student> list = new ArrayList<>();
		
		ObjectInput oi = new ObjectInputStream(new FileInputStream("studentdata.ser"));

		Student st = null;
		while(true) {
			
			try {
				
				st = (Student)oi.readObject();
				
				list.add(st);
				
			}catch(EOFException ex) {
				break;
			}
			
		}
		
		
		list.forEach(System.out::println);
		oi.close();
	}

}
