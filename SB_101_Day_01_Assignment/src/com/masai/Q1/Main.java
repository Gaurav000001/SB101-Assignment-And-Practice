package com.masai.Q1;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface IncreaseSalary{
	void increase(List<Employee> list);
}

public class Main {
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(1, "Sagar", "Delhi", 30000));
		list.add(new Employee(2, "puja", "Uttar pradesh", 5000));
		list.add(new Employee(3, "jodha", "Haryana", 40988));
		list.add(new Employee(4, "Binni", "Madhya Pradesh", 50000));
		list.add(new Employee(5, "Keshav", "Kashmir", 4000));
		list.add(new Employee(6, "Madhav", "Jammu", 3000));
		list.add(new Employee(7, "Sagar", "Maharashtra", 3999));
		list.add(new Employee(8, "Jashan", "Maharashtra", 51000));
		list.add(new Employee(9, "Ashish", "Chandigarh", 3800));
		list.add(new Employee(10, "Bhuvan", "Haryana", 20000));
		
		
		IncreaseSalary f1 = empList -> {
			
			for(Employee emp: empList) {
				if(emp.getSalary() < 5000) {
					emp.setSalary(emp.getSalary()+1000);
				}
			}
		};
		
		f1.increase(list);
		for(Employee emp: list) {
			System.out.println(emp);
		}
	}
}
