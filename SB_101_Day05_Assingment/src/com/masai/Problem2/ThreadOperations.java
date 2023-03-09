package com.masai.Problem2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThreadOperations {
	public static void reverseArray() {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<=(int)Math.floor(arr.length/2);i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		
		Arrays.stream(arr).forEach(i -> System.out.print(i+" "));
		System.out.println();
	}
	
	public void findNearestToAverage() {
		
		List<Integer> list = List.of(1, 2, 3, 4, 15, 6, 7, 10, 12, 20);
		
		double avg = list.stream().collect(Collectors.averagingInt(i -> i));
		
		int a = list.get(0);
		for(int i=0;i<list.size();i++) {
			if(list.get(i) <= avg) {
				a = list.get(i);
			}
		}
		System.out.println(a);
	}
}
