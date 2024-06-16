package com.tech.dsa;

public class SmallestNumber {
	public static void main(String[] args) {
		int myArray[]= {7, 12, 9, 4, 11};
		int minValue=myArray[0];

		for(int i: myArray) {
			if(i<minValue) {
				minValue=i;
			}
		}
		System.out.println("Minimum value among 7, 12, 9, 4, 11  is :"+ minValue);
	}
}
