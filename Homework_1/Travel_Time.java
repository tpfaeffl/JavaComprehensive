package Homework_1;

/**
 * Author: Thomas Pfaeffle
 * Java Comprehensive
 * 20 Jan 2018
 */

import java.util.Scanner;
import java.lang.Math;

public class Travel_Time {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Travel Time Calculator");
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (!choice.equalsIgnoreCase("n")) {
			
			// enter miles and miles per hour
			
			System.out.print("Enter miles:           ");
			double miles = sc.nextDouble();
			System.out.print("Enter miles per hour:  ");
			double speed = sc.nextDouble();
			
			// calculate hours and minutes
			int hours = (int)(miles/speed);
			int minutes = (int)Math.round(miles % speed);
			
			// form the output message and print it
			System.out.println();
			String message = "Hours:    " + hours + "\n"
					+ "Minutes:  " + minutes;
			
			System.out.println("Estimated travel time");
			System.out.print(message);
			System.out.println();
			
			
			// does the user want to continue?
			System.out.println();
			System.out.print("Continue? (y/n)  ");
			choice = sc.next();
			System.out.println();
			
		}
		sc.close();
	}

}
