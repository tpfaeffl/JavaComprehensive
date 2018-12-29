package Homework_5_Movie;

/* 
 * Thomas Pfaeffle
 * Java Comprehensive
 * Homework 5
 * 
 */

import java.util.Scanner;

public class Validate_Movie {
	
	   public static String getString(Scanner sc, String prompt)
	    {
		   
		    String s = "";
			boolean isValid = false;
			while (isValid == false)
				{
				System.out.print(prompt);
				s = sc.next();
				if (s.equalsIgnoreCase("y") || s.equalsIgnoreCase("n")) {
					isValid=true;
				}
				else {
	        	System.out.print("Response must be y or n. Try again." );
	        	sc.nextLine();
	        	System.out.println();
				}
			}
	        return s; 
	    }

}
