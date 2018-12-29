package Homework_4_Validate;

import java.util.Scanner;

public class MyValidator extends OOValidator {
	
//	public static  Scanner sc;
//	public  String s;
	

	public MyValidator(Scanner sc) {
		super(sc);
		
	}
	
	public static String getRequiredString(String prompt) {
		String s = "";
		System.out.println();
		System.out.println();
		System.out.println(prompt);
		boolean empty = false;
		while (empty == false) {
			System.out.print("Enter your email address:  ");
			s = OOValidator.sc.nextLine();
			if (!s.isEmpty()) {	
				empty = true;
				return s;
				
				
				}
			else if (s.isEmpty()) {
				System.out.println("Error! This entry is required. Try again.");	
			}
			
		}  		
			return s;
	}
		
		
	

	public static String getChoiceString(String prompt, String s1, String s2) {
		System.out.println();
		System.out.println();
		System.out.println(prompt);
		String s = "";
		boolean isValid = false;
		while (isValid == false)
			{
			System.out.print("Select one ("+s1+"/"+s2+")");
			s = OOValidator.sc.nextLine();
			
			if (s.isEmpty()) {
				System.out.print("Error! This entry is required. Try again.\n" );
			}
			
			else if (s.equals(s1) || s.equals(s2)) {
				isValid=true;
				
			}
			else if (!s.equals(s1) || !s.equals(s2)) {
        	System.out.print("Error! Entry must be " + s1 + " or " + s2 +". Try again.\n" );
      //  	OOValidator.sc.nextLine();
       // 	System.out.println();
			}	
			
		}
	//	OOValidator.sc.nextLine();
        return s; 
		
	}
}
