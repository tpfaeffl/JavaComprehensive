package Homework_2;
/**
 * Author: Thomas Pfaeffle
 * Java Comprehensive
 * 28 Jan 2018
 */

import java.util.Scanner;


public class Area_Perim_Calc {
	
	public static void main(String[] args)
    {
		System.out.println("Welcome to the Area and Perimeter Calculator");
		System.out.println();
		Scanner sc  = new Scanner(System.in);
		double min = 0.0;
		double max = 1000.0;
		String choice = "y";
		while (!choice.equalsIgnoreCase("n")) {
			// get the length, width from the user
			
			double length = getDoubleWithinRange(sc, "Enter length:   ", min, max);
			double width = getDoubleWithinRange(sc, "Enter width:    ", min, max);
			
			double area = length * width;
			double perimeter = (2 * length) + (2 * width);
			
			
			// print results
			String message = "Area:  \t        " + area + "\n"
					       + "Perimeter:      " + perimeter + "\n";
			
			System.out.println(message);
			
			// See if user  wants to continue
			choice = getResponse(sc, "Continue? (y/n)   ");
			
			System.out.println();
			
		}
		
		sc.close();
		
    } 
	
	// method to continue or not
	public static String getResponse (Scanner sc, String prompt)
	
	{
		String response = null;
		boolean isValid = false;
		while (isValid == false)
		{
			
			System.out.print(prompt);
			if (sc.hasNext())
			{
				
				response = sc.next();
				if (response.equalsIgnoreCase("n") || response.equalsIgnoreCase("y"))
					isValid = true;
				
				else {
					System.out.println("Error! This entry is required. Try again.");
				}
			sc.nextLine();		
			}			
		}
		return response;
	}
	
	// method to test if double values were provided
	public static double getDouble (Scanner sc, String prompt)
	
	{
		double d = 0.0;
		boolean isValid = false;
		while (isValid == false)
		{
			System.out.print(prompt);
			if (sc.hasNextDouble())
			{
				
				d = sc.nextDouble();
				isValid = true;
			}
			else 
			{
				System.out.println("Error! Invalid number. Try again.");
				System.out.println("");
			}
			sc.nextLine();
			
		}
		return d;
			
	}
	
	// method to test if values are within range
	public static double getDoubleWithinRange(Scanner sc, String prompt, double min, double max)
	
	{
		double d = 0.0;
		boolean isValid = false;
		while (isValid == false)
		{
			d = getDouble(sc, prompt);
			if (d <= min)
			{
				System.out.println("Error! number must be greater than: " + min + ".");
				System.out.println("");
			}
			else if (d >= max)
			{
			System.out.println("Error! Number must be less than: " + max + "." );
			System.out.println("");
			}
			else 
				isValid = true;
		}
		return d;
		
	}
	
}
