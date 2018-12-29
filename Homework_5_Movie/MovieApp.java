package Homework_5_Movie;

/* 
 * Thomas Pfaeffle
 * Java Comprehensive
 * Homework 5
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;


public class MovieApp {
	static String title;
	static String description;

	public static void main(String[] args) {
		System.out.println("Welcome to the Movie List Application");
		System.out.println("Category choices are: \n  animated \n  drama \n  horror \n  musical \n  sifi" );
		
		Movie p = new Movie(title, description);
		Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
        	System.out.println("What category are you interested in?");
        	String category = sc.next();
        	ArrayList<Movie> categoryArray = p.getMovies(category);
        	
        	for (Movie m : categoryArray) {
        		System.out.println(m.title);
        		
        	} // end of for loop
        		
        	
        // see if user wants to continue	
        	System.out.println();
        	choice = Validate_Movie.getString(sc, "Continue? : (y/n): ");
            if (choice.equalsIgnoreCase("n")) {
            	System.out.println("Goodbye.");
            }
            System.out.println();
       
        } // end of while

	}

}
