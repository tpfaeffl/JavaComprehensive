package Homework_1;

/**
 * Author: Thomas Pfaeffle
 * Java Comprehensive
 * 20 Jan 2018
 */

import java.util.Scanner;

public class Convert_Grade {

	public static void main(String[] args) {
		
		
		System.out.println("Welcome to the Letter Grade Converter");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		String letterGrade = "X";
		while (!choice.equalsIgnoreCase("n")) {
			
		System.out.print("Enter Numerical Grade:   ");
		
		// assign a letter grade to a numerical grade
		double numberGrade = sc.nextDouble();
		if (numberGrade >= 88) {
			letterGrade = "A";}
			else if (numberGrade >= 80) {
				letterGrade = "B";}
			else if (numberGrade >= 67) { 
				letterGrade = "C";}
			else if (numberGrade >= 60) {
				letterGrade = "D";}
			else letterGrade = "F";
		
		System.out.println("Letter Grade : " + letterGrade);
		System.out.println();
		
		// does the user want to ontinue?
		System.out.print("Continue? (y/n):   ");
		choice = sc.next();
		System.out.println();
		}
		
		sc.close();
	}

}
