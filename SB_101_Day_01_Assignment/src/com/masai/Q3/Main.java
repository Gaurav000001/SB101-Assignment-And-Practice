package com.masai.Q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product(1, "Butter", 4, 600));
		list.add(new Product(2, "Chips", 8, 988));
		list.add(new Product(3, "Pulses", 5, 3738));
		list.add(new Product(4, "Grain", 39, 77));
		list.add(new Product(5, "Penut", 3, 57));
		
		
		Collections.sort(list, (o1 ,o2) -> {
			
			if(o1.getPrice() < o2.getPrice()) {
				return 1;
			}
			else if(o1.getPrice() > o2.getPrice()) {
				return -1;
			}
			else {
				return 0;
			}
		});
		
		for(Product a: list) {
			System.out.println(a);
		}
		
	}
}
