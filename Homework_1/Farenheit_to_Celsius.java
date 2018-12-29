package Homework_1;

/**
 * Author: Thomas Pfaeffle
 * Java Comprehensive
 * 20 Jan 2018
 */

import java.text.NumberFormat;
import java.util.Scanner;

public class Farenheit_to_Celsius {

	public static void main(String[] args) {


		System.out.println("Welcome to the Temerature Coverter");
		System.out.println();
		
		String choice = "y";
		Scanner sc = new Scanner(System.in); 
		
		while (!choice.equalsIgnoreCase("n")) { 
			// get a farenheit value
			System.out.print("Enter degrees in Farenheit:  ");
			double faren = sc.nextDouble();
			
			// get Celsius value to 2 decimal places
			NumberFormat number = NumberFormat.getNumberInstance();
			number.setMaximumFractionDigits(2);
			String s_celsius = number.format((faren-32.0) * (5.0/9.0));
			
			// print Celsius value
			System.out.print("Degrees in Celsius:  " + s_celsius);
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
