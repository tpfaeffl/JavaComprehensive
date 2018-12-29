package Homework_2;


/**
 * Author: Thomas Pfaeffle
 * Java Comprehensive
 * 28 Jan 2018
 */

import java.util.Scanner;
import java.lang.Math;


public class Powers {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Squares and Cubes Table\n\n");
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		while (!choice.equalsIgnoreCase("n")) {
		
			System.out.print("Enter an integer:   ");
			int number = sc.nextInt();
			
			
			System.out.print("\n");
			
			// build the table
			
			String table = "";
			
			// fill in first 2 rows of table
			table += "Number\t\t" + "Squared\t\t" + "Cubed\t\t" + "\n" 
			        +"#####\t\t" + "#######\t\t" +  "#####\t\t" + "\n";
			
			
			for (int i =1; i<=number; i++) {
				int square = (int)Math.pow(i, 2);
				int   cube = (int)Math.pow(i,3);
			
				String row = i + "\t\t" + square + "\t\t" + cube;
				table += row + "\n";
				
			}
			
			
			System.out.print(table);
			
			
			// see if the user wants to continue
			System.out.println();
			System.out.println();
	        System.out.print("Continue? (y/n): ");
	        choice = sc.next();
	        System.out.println();
		} 
		
		sc.close();
	} 

}
