package com.masai.Q3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,2,4,3,5,7,3);
		
		List<Integer> sqrt = list.stream().map(i -> i*i).collect(Collectors.toList());
		
		list.forEach(i -> System.out.print(i+" "));
		System.out.println();
		sqrt.forEach(i -> System.out.print(i+" "));
	}

}
