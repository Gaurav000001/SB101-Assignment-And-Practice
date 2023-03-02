package com.masai.Q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Predicate Example
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		
		//removing all even numbers using predicate and removeIf method
		list.removeIf(i -> i%2==0);
		
		
//-=-=-=--==-=-==-=-=-===-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=--=-=-=-=---=-=-=-
		//Supplier Example
		Supplier<List<Integer>> sup = () -> Arrays.asList(1,2,3,4,5,6,3,5,3,5);
		
		List<Integer> list1 = sup.get();
		
		
//-=-=-=--==-=-==-=-=-===-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=--=-=-=-=---=-=-=-
		
		
		//Consumer Example
		List<Integer> list2 = new ArrayList<>();
		list2.addAll(list1);
		list2.forEach(i -> {
			
			if(i%2 == 0) {
				System.out.println(i + " : " + "Even");
			}
			else {
				System.out.println(i + " : " + "Odd");
			}
		});
		
		
//-=-=-=--==-=-==-=-=-===-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=--=-=-=-=---=-=-=-
		
		//Function Example
		List<String> list3 = new ArrayList<>();
		list3.add("1");
		list3.add("14");
		list3.add("5");
		list3.add("16");
		list3.add("14");
		list3.add("135");
		list3.add("136");
		list3.add("163");
		list3.add("177");
		list3.add("112");
		list3.add("0");
		
		System.out.println(list3.stream().reduce((i, j) -> i+j));
	}

}
