package Homework_3_Words;
/*
 * Java Comp.
 * Homework 3 Convert numbers to words
 * Author: Tom Pfaeffle 
 * 
 */

import java.util.Scanner;

import Homework_3_Circle_Proj.Validator;

public class WordsApp {

	public static void main(String[] args) {
		
		
		System.out.println("Welcome to the Number to Word Converter");
		
		Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
        	
        	int number = Validator.getIntWithinRange(sc,
                    "Enter the number you want to convert to words:     ", 0, 10000);
        	
        	// create new word object
        	Words w = new Words();
        	
        	System.out.print(w.getThousands(number) + " ");
        	System.out.print(w.getWords(number));
        	
        	
        	// see if the user wants to continue
    		
        	System.out.println();
        	choice = Validator.getString(sc, "Convert another number? : (y/n): ");
            if (choice.equalsIgnoreCase("n")) {
            	System.out.println("Goodbye.");
            }
            System.out.println();
            
    	} // end of while
        	
        }

	}

