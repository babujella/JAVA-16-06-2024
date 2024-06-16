package a.introduction;

import java.util.Scanner;

public class Cricket {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Jakkapur cricket board !!!");
		
		while(true) {	
			System.out.println("provide number of Overs : ");
			int overs=scanner.nextInt();
			System.out.println("Provide run rate : ");
			float runRate=scanner.nextFloat();
			
			System.out.println("Total score : "+overs*runRate);
			System.out.println("Do you want to see one more scores if yes, enter 'YES' else 'NO'");
			String userInput=scanner.next().toLowerCase();
			if(userInput.equalsIgnoreCase("no")) {
				break; 
            }
			else if (!userInput.equalsIgnoreCase("yes")) {
                System.out.println("Invalid input. Please enter 'YES' or 'NO'.");
            }
		}
		System.out.println("Thank you....!!");
		scanner.close();
	}
}
