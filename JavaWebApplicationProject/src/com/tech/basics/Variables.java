package com.tech.basics;


// Variable which can be hold the data.......

// variable-> vary+ able  so the value of the variable can change

public class Variables {
	int instanceVariable=10;  // instance variable 
	
	static String staticVariable="Paddu Reddy";  // Static variable
	
	public String customMethod() {
		String localVariable="Babu Jella";   // Local variable
		 return localVariable;
	}
	public static void main(String[] args) {
		Variables variables=new Variables();
		System.out.println("instance Variable...."+variables.instanceVariable);
		System.out.println("Static variable ....."+staticVariable);
		System.out.println("Local varibale......."+variables.customMethod());
	}
}
