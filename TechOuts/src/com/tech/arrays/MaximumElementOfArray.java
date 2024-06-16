package com.tech.arrays;

import java.util.Arrays;

public class MaximumElementOfArray {
	public static void main(String[] args) {
		int[] numbers = {1, -2, 3, -4, 5, -6, -7, 8, 9};
		
		System.out.println(Arrays.stream(numbers).max().getAsInt());
	}
}
