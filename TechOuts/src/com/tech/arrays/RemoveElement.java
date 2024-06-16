package com.tech.arrays;

import java.util.Arrays;
import java.util.Iterator;

// Write a Java program to remove a specific element from an array.

public class RemoveElement {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,9,9,4,5,6,8,9};

		int numberToBeRemove=9;
		int count=0;

		for(int element=0; element<numbers.length;element++) {
			if(numbers[element]==numberToBeRemove) {
				count++;
			}
		}
		int sizeOfNewArray[]=new int[numbers.length-count];
		int newIndex=0;
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]!=numberToBeRemove) {
				sizeOfNewArray[newIndex++]=numbers[i];
			}
		}
		
		System.out.println(Arrays.toString(sizeOfNewArray));
	}
}
