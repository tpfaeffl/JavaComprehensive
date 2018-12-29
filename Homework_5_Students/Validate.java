package Homework_5_Students;

/* 
 * Thomas Pfaeffle
 * Java Comprehensive
 * Homework 5
 * 
 */

import java.util.Scanner;

public class Validate {
	
	public static Scanner sc;
	public static int min;
	public static int max;
	
	
	public static int getInt(String prompt, Scanner sc) {
		
		int i = 0;
		boolean isValid = false;
		while (isValid == false)
		{
			System.out.print(prompt);
		//	i = sc.nextInt();
			if (sc.hasNextInt())
			{
				i = sc.nextInt();
				isValid = true;
			}
			else if (!sc.hasNextInt())
			{
				System.out.println("Error! Invalid integer value. Try again.");
				System.out.print("Enter a number between " + getIntMin() + " and " + getIntMax() + ": ");
				
			}
			sc.nextLine();  // discard any other data entered on the line
		}
		return i;
	
}
	
	private static int getIntMin() {
		return min;
	}
	
	private static int getIntMax(){
		return max;
	}
	
	public static int getIntWithinRange(String prompt, int min, int max, Scanner sc) {
		int i = 0;
		
		boolean isValid = false;
	//	System.out.println();
		System.out.println();
	//	System.out.print(prompt);
		while (isValid == false)
		{
		//	System.out.print("Enter a number between " + min + " and " + max + ": ");
			i = getInt(prompt, sc);		
			
			if (i <= min)
				System.out.println(
					"Error! Number must be greater than " + min + "  Try again. ");
			else if (i >= max)
				System.out.println(
					"Error! Number must be less than " + max + "  Try again. ");
			else
				isValid = true; 
		}
		return i;
	}
	
	public static String getRequiredString(String prompt, Scanner sc) {
		String s = "";
	//	System.out.println();
	//	System.out.println();
		System.out.print(prompt);
		boolean empty = false;
		while (empty == false) {	
			s = sc.nextLine();
			if (!s.isEmpty()) {	
				empty = true;
				return s;
				
				
				}
			else if (s.isEmpty()) {
				System.out.println("Error! This entry is required. Try again.");	
			}
			
		}  		
			return s;
	}

}
