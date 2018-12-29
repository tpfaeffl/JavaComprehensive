package Homework_3_PigLatin;

import java.util.Scanner;
import Homework_3_PigLatin.Validator;


public class PigLatinApp {

	public static void main(String[] args) {
		
		String myPhrase;
		
		System.out.println("Welcome to the Pig Latin Translator");
		
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
        	
        	
		Convert_PL p = new Convert_PL();
		
		myPhrase = p.getString(sc, "Enter a line to be translated to Pig Latin:");
		String parsed_string[] = p.parseString(myPhrase);
		String converted_words[] = p.convertWords(parsed_string);
		

		for (int i =0; i <= converted_words.length - 1; i++) {
			System.out.print(converted_words[i] + "  " );
		} // end of for loop
			
		System.out.println();
	//	sc.nextLine();
    	choice = Validator.getString(sc, "Translate another line? : (y/n): ");
        if (choice.equalsIgnoreCase("n")) {
        	System.out.println("Goodbye.");
        }
        System.out.println();
		
        } // end of while
	}

}
