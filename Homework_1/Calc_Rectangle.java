package Homework_1;

/**
 * Author: Thomas Pfaeffle
 * Java Comprehensive
 * 20 Jan 2018
 */

import java.util.Scanner;


public class Calc_Rectangle {
	
	public static void main(String[] args)
    {
		System.out.println("Welcome to the Area and Perimeter Calculator");
		System.out.println();
		Scanner sc  = new Scanner(System.in);
		String choice = "y";
		while (!choice.equalsIgnoreCase("n")) {
			// get the length, width from the user
			System.out.print("Enter Length:   ");
			double length = sc.nextDouble();
			
			System.out.print("Enter Width:    ");
			double width = sc.nextDouble();
			
			double area = length * width;
			double perimeter = (2 * length) + (2 * width);
			
	

			
			// print results
			String message = "Area:  \t        " + area + "\n"
					       + "Perimeter:      " + perimeter + "\n";
			
			System.out.println(message);
			
			// See if user  wants to continue
			System.out.print("Continue? (y/n)   " );
			choice = sc.next();
			if (choice.equalsIgnoreCase("n"))
				System.out.println("Goodbye");
			System.out.println();
			
		}
		sc.close();
		
    } 
}
