package com.masai.Q2;

@FunctionalInterface
interface Demo{
	public void printDetail(Student student);
}

public class Main{
	
	Main(){}
	
	Main(Student student){
		System.out.println(student);
	}
	
	public void printStudentDetails(Student student) {
		// TODO Auto-generated method stub
		System.out.println(student);
	}
	
	public static void printStudent(Student student) {
		System.out.println(student);
	}
	
	public static void main(String[] args) {
		
		//Non static reference
		Demo d1 = new Main()::printStudentDetails;
		d1.printDetail(new Student(1, "NON STATIC", "Kerala", 494));
		
		//Static reference
		Demo d2 = Main::printStudent;
		d2.printDetail(new Student(2, "STATIC", "Kerala", 494));
		
		//Constructor
		Demo d3 = Main::new;
		d3.printDetail(new Student(3, "CONSTRUCTOR", "Kerala", 494));
	}

}
