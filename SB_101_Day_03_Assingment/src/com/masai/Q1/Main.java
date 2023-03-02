package com.masai.Q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
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
		
		Map<Integer, String> map = new HashMap<>();
		BiFunction<Integer, String, String> c11 = map::putIfAbsent;
		System.out.println(c11.apply(0, "Zero"));
		
		System.out.println(map);
	}

}




//(i) Say s is a parameter of type String, write appropriate type for variable c1
//Consumer<String> c1 = s -> System.out.println(s);
//
//(ii) Say s & i are parameters of type String & Integer, write appropriate type for variable c2
//BiConsumer<String,Integer> c2 = (s, i) -> System.out.println(s.length() - i);
//
//(iii) write appropriate type for variable c3
//Supplier<String> c3 = () -> "Hello";
//
//(iv) Say l is a parameter of type List<String>, write appropriate type for variable c4
//Consumer<List<String>> c4 = l -> l.add("Aman");
//
//(v) Say s is a parameter of type String, write appropriate type for variable c5
//Function<String,Character> c5 = s -> return s.charAt(0);
//
//(vi) Write appropriate type for variable c5
//Function<String,Double> c6 = Double::parseDouble;
//
//(vii) Look at the following code-
//Exception ex = new ArrayIndexOutOfBoundsException("Not a Valid index");
//Supplier<String> c7 = ex::toString; ---- (a)
//System.out.println(c7.get()); ---- (b)
//(a) Write appropriate type for variable c7
//(b) Write appropriate method call here
//
//(viii) Look at the following code-
//(Tip: The printStackTrace method of Exception class takes object of PrintStream as parameter and it return nothing)
//Exception ex = new ArrayIndexOutOfBoundsException(2);
//Consumer<PrintStream> c8 = ex::printStackTrace; ----(a)
//c8.accept() -----(b)
//(a) Write appropriate type for variable c8
//(b) Write appropriate method call here such the the output of printStackTrace must be on console.
//
//(ix) Look at the following code
//Set<Integer> set= new LinkedHashSet<>();
//Consumer<Integer> c9 = set::add;----(a)
//c9.accept(10);----(b)
//(a) Write appropriate type for variable c9
//(b) Write appropriate method call here such the value 10 should be added to the set.
//
//(x) Look at the following code
//List<String> list = new ArrayList<>();
//list.add("One");
//Predicate<String> c10 = list::add; ----(a)
//c10.test("Zero"); ----(b)
//(a) Write appropriate type for variable c10
//(b) Write appropriate method call here such the value "Zero" should be added at the index 0.
//
//(xi)
//Tip: The V putIfAbsent(K key, V value) method of Map interface works as follow-
//If the specified key is not already associated with a value (or is mapped to null) associates it with the given value and returns null, else returns the current value.
//
//Map<Integer, String> map = new LinkedHashMap<>();
//BiFunction<Integer, String, String> c11 = map::putIfAbsent; ----(a)
//c11.apply(0, "Zero"); ----(b)
//(a) Write appropriate type for variable c11
//(b) Write appropriate method call here such the value "Zero" should be added at key 0.
//
//(xii)
//Function<String, StringBuilder> bif= _______________; ----(a)
//StringBuilder s1 = bif._______________; ----(b)
//(a) Write appropriate syntax here such that new object of StringBuilder should be created using String parameter
//(b) Write appropriate method call here such the value of parameter is "all is well"