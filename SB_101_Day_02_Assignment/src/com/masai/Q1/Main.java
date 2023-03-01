package com.masai.Q1;


@FunctionalInterface
interface Demo{
public int convetStringToNumber(String s);
}

public class Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo i = Integer::parseInt;
		
		int num1 = i.convetStringToNumber("20");
		int num2 = i.convetStringToNumber("30");
		
		System.out.println(num1+num2);
	}

}
