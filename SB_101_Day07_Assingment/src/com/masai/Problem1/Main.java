package com.masai.Problem1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		list.add("3938272404");
		list.add("6699960095");
		list.add("9985857444");
		list.add("04948333354");
		list.add("2326485966");
		list.add("0099847474844");
		list.add("8797556444");
		list.add("6685755576");
		list.add("9847335678");
		list.add("8737384456");
		
		
		//adding the numbers to file named as Numbers.txt
		try {
			addNumbers(list);
			//getting all the numbers which stands upon the rule of having starting number as 6-9 and having a length of 10
			List<String> filteredList = null;
			filteredList = getNumbers();
			
			//adding filtered numbers to another file called QualifiedNumbers.txt
			addNumbersToAnotherFile(filteredList);
			
			//printing numbers of both files
			System.out.println("Numbers of non filtered file");
			list.forEach(System.out::println);
			
			System.out.println();
			System.out.println("Numbers of filtered file");
			filteredList.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}
	
	public static void addNumbers(List<String> nums) throws IOException{
		
		Writer wr = new FileWriter("Numbers.txt");
		
		for(int i=0;i<nums.size();i++) {
			wr.write(nums.get(i)+" ");
		}
		
		wr.close();
	}
	
	
	public static List<String> getNumbers() throws IOException{
		
		List<String> numbers = new ArrayList<>();
		
		BufferedReader br = new BufferedReader(new FileReader("Numbers.txt"));
		
		//reading the hole line of numbers of type string and storing them into str (string)
		String str = br.readLine();
		
		//splitting the numbers and adding them into the array of strings
		String[] arr = str.split(" ");
		
//		Arrays.stream(arr).forEach(System.out::println);
		
		
		//checking each and every string in the arr using stream() method of Arrays class and converting it to list and storing to numbers
		numbers = Arrays.stream(arr).filter(i -> (Integer.parseInt(String.valueOf(i.charAt(0)))>=6 && Integer.parseInt(String.valueOf(i.charAt(0)))<=9) && i.length()==10).collect(Collectors.toList());

		return numbers;
	}
	
	
	public static void addNumbersToAnotherFile(List<String> nums) throws IOException{
		
		Writer wr = new FileWriter("QualifiedNumbers.txt");
		
		for(int i=0;i<nums.size();i++) {
			wr.write(nums.get(i)+" ");
		}
		
		wr.close();
	}

}
