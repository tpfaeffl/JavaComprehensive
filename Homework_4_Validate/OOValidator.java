package Homework_4_Validate;

import java.util.Scanner;

public class OOValidator {
	
	public static Scanner sc;
	public static int min;
	public static int max;
	
	public OOValidator(Scanner sc) {
		OOValidator.sc = sc;
	//	OOValidator.min = min;
	//	this.max = max;
		
		
	}
	
	public int getInt(String prompt) {
		
			int i = 0;
			boolean isValid = false;
			while (isValid == false)
			{
		//		System.out.print(prompt);
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
	
	
	public int getIntWithinRange(String prompt, int min, int max) {
		int i = 0;
		
		boolean isValid = false;
		System.out.println();
		System.out.println();
		System.out.print(prompt);
		while (isValid == false)
		{
			System.out.print("Enter a number between " + min + " and " + max + ": ");
			i = getInt(prompt);		
			
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
	
	public double getDouble(String prompt){
		double d = 0;
		boolean isValid = false;
		while (isValid == false)
		{
	//		System.out.print(prompt);
			if (sc.hasNextDouble())
			{
				d = sc.nextDouble();
				isValid = true;
			}
			else
			{
				System.out.println("Error! Invalid decimal value. Try again.");
			}
			sc.nextLine();  // discard any other data entered on the line
		}
		return d;
	}
	
	public double getDoubleWithinRange( String prompt, double min, double max ) {
		double d = 0;
		boolean isValid = false;
		System.out.println();
		System.out.println();
		System.out.print(prompt);
		while (isValid == false)
		{
			System.out.print("Enter any number between " + min + " and " + max + ": ");
			d = getDouble(prompt);
			if (d <= min)
				System.out.println(
					"Error! Number must be greater than " + min);
			else if (d >= max)
				System.out.println(
					"Error! Number must be less than " + max);
			else
				isValid = true;
			
		}
		
		return d;
	}

}
