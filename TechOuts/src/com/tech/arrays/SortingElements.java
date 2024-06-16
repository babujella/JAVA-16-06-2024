package com.tech.arrays;

import java.util.Arrays;

public class SortingElements {
	public static void main(String[] args) {
		int[] numbers = {1, -2, 3, -4, 5, -6, -7, 8, 9};
		
		int sortedArray[]=Arrays.stream(numbers).sorted().toArray();
		
		System.out.println(Arrays.toString(sortedArray));
	}
}
