package com.masai.Q3;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface PrintList {
	abstract void display(List<String> city);
}

public class Main {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Pune");
		list.add("Indore");
		list.add("Chandrapur");
		list.add("Nagpur");
		list.add("Shrinagar");
		
		PrintList ex = city -> {
			for(String a:city) {
				System.out.println(a);
			}
		};
		
		ex.display(list);
	}
}
