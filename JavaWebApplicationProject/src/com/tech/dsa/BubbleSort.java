package com.tech.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BubbleSort {
	public static void main(String[] args) {
		int myArray[]= {64, 34, 25, 12, 22, 11, 90, 5};
		
		List list=Arrays.asList(myArray);
		Collections.sort(list);
		System.out.println(list);
	}
}
