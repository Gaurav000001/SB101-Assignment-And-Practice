package com.masai.problem2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		
		list.add("Ertiga 7 1200000 Toyota");
		list.add("Eon 5 475000 Hyundai");
		list.add("Creta 5 1450000 Hyundai");
		list.add("Alto 5 499000 Maruti");
		list.add("Fortuner 7 3450000 Toyota");
		
		Path path = Paths.get("car.txt");
		
		if(!Files.exists(path)) {
			
			Files.createFile(path);
			System.out.println("File Created successfully!");
			System.out.println();
		}
		
		Files.write(path, list /*, StandardOpenOption.APPEND*/);
		
		System.out.println("File writing completed!");
		System.out.println();
		
		Stream<String> stream = Files.lines(path);
		
		int combinePrice = stream.collect(Collectors.summingInt( i -> {
				
				String[] info = ((String) i).split(" ");
				
				return Integer.parseInt(info[2]);
				
			}));
		
		System.out.println("Total Cost of all Cars is: "+combinePrice);
		System.out.println();
		
		
		System.out.println("All Cars manufactured by Hyundai are: ");
		
		Stream<String> stream1 = Files.lines(path);
		
		stream1.filter( i -> {
			
			String[] info = ((String) i).split(" ");
			
			return info[3].equals("Hyundai");
			
		}).forEach(i -> {
			
			String[] info = ((String) i).split(" ");
			
			System.out.println(a++ +". "+info[0]);
			
		});
	}
	
	static int a = 1;

}
