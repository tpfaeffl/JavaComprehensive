package Homework_1;

/**
 * Author: Thomas Pfaeffle
 * Java Comprehensive
 * 20 Jan 2018
 */

import java.util.Scanner;

public class Change_Calc {
	
	public static void main(String[] args) {
		
System.out.println("Welcome to the Change Calculator");
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (!choice.equalsIgnoreCase("n")) {
			
			System.out.print("Enter the number of cents (0-99):  ");
			int cents = sc.nextInt();
			
			//calculate number of quarters and remainder
			int quarters = cents/25;
			int remainder = cents % 25;
			
			// calculate number of dimes and remainder
			int dimes = remainder/10;
			remainder = remainder % 10;
			
			// calculate number of nickels and remainder
			int nickels = remainder/5;
			remainder = remainder % 5;
			
			// calculate number of pennies
			int pennies = remainder;
			
			// form output string and print it
			String message =  "Quarters: " + quarters + "\n"
					        + "Dimes:    " + dimes + "\n"
					        + "Nickels:  " + nickels + "\n"
					        + "Pennies:  " + pennies + "\n";
			
			System.out.println(message);
			
			// does the user want to continue?
			System.out.println();
			System.out.print("Continue? (y/n)  ");
			choice = sc.next();
			System.out.println();
			
		}
		sc.close();
	}

}
