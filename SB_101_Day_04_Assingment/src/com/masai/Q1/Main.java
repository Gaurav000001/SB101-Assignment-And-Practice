package com.masai.Q1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product(1,"Conditioner", 30, 40));
		list.add(new Product(2,"Duke", 20, 70));
		list.add(new Product(3,"King", 4, 356));
		list.add(new Product(4,"Peeker", 38, 45));
		list.add(new Product(5,"Smoker", 99, 355));
		list.add(new Product(6,"Burner", 8, 40));
		list.add(new Product(7,"Lotus", 3, 40));
		list.add(new Product(8,"Panisiline", 45, 40));
		list.add(new Product(9,"Sofa", 334, 474));
		list.add(new Product(10,"LCD", 388, 4567));
		
		
		List<Product> filtered = list.stream().filter(i -> i.getQuantity()>10).collect(Collectors.toList());
		
		List<Product> sorted = filtered.stream().sorted((o1,o2) -> o1.getPrice()>o2.getPrice()?1:-1).collect(Collectors.toList());
		
		filtered.forEach(System.out::println);
		System.out.println();
		sorted.forEach(System.out::println);
	}
}
