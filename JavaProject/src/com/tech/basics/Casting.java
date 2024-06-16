package com.tech.basics;


/*Type casting is a method which converts one data type to another data type  in both ways manually and automatically 

manually by programmer and automatically by compiler. 

 Two types of casting 
 
 1. Widening casting : Converts lower data type to higher data type
 
 2. Narrow casting  : Converts higher data type to Lower datatype.
 
 
 ========   byte -> short -> char -> int -> long -> float -> double ==============  >>> Widening casting 
 
 ========   double -> float-> long -> int -> char -> short -> byte ================ >>> Narrow casting.
    */

public class Casting {
	public static void main(String[] args) {
		 
		int number=10 ;
		
		// Widening Casting.....
		System.out.println("Widening Casting.....\n");
		
		long longNumber=number;
		System.out.println("Long number from int is :"+ longNumber);
		
		float floatNumber=number;
		System.out.println("Float number from int is :"+ floatNumber );
		
		double doubleNumber=number;
		System.out.println("Double number from int is :"+ doubleNumber );
		System.out.println();
		
		// Narrow casting.....
		
		System.out.println("Narrow casting.....\n");
		
		double num=5.0d;
		
		long longNum=(long)num;
		System.out.println("Long number from double to long is :"+longNum);
		
		float floatNum=(float)num;
		System.out.println("Float number from double is :"+floatNum);
		
		int intNum=(int)num;
		System.out.println("Int number from double is :"+ intNum);
	}
}
