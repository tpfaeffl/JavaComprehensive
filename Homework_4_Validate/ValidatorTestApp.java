package Homework_4_Validate;

import java.util.Scanner;


public class ValidatorTestApp {
	

	
	public static  Scanner sc;

	public static void main(String[] args) {
		System.out.println("Welcome to the Validation Tester Application\n");

        // set the class variables
      
        sc = new Scanner(System.in);
        OOValidator val = new OOValidator(sc);
        int i = val.getIntWithinRange("Int Test \n", -100,  100 );
        System.out.println (i);
        double d = val.getDoubleWithinRange("Double Test \n", -100.0,  100.0 );
        System.out.println (d);
        String e = MyValidator.getRequiredString("Required String Test");
        System.out.println("Email address is :" + e);
        String f = MyValidator.getChoiceString("String Choice Test", "x", "y");
        System.out.print("output string is " + f);
        
	}

}
