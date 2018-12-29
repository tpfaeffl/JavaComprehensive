package Homework_6_Countries;

import java.util.ArrayList;
import java.util.Scanner;

public class CountriesApp {

	public static ArrayList<String> returnedArray = new ArrayList<String>();
	public static ArrayList<String> newList = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Contries Mantenance App");
		System.out.println(Validate_Country.getMenu()); 
		//System.out.println("Menu" + "\n" 
		//		+ "1 - List Countries \n"  
		//		+ "2 - Add a country \n" 
		//		+ "3 - Exit \n");
		
		CountriesTextFile c = new CountriesTextFile();
		Scanner sc = new Scanner(System.in);
		int choice = Validate_Country.getIntWithinRange("Enter a Menu number: ", 0, 4, sc);
		// get a value
		
//	while (choice != 3) {	
		if (choice != 3) {	
		switch (choice) {
		case 1: {
			returnedArray = c.getCountries();
			
			//System.out.println("now I  print the array from CountriesApp");
			for (String s :returnedArray ) {
				if (s !=null) {
				System.out.println(s);
				} // end of if loop
			} // end of for loop
			System.out.println(Validate_Country.getMenu());
		break;	
		}
	
		case 2: {
			String country = Validate_Country.getRequiredString("Enter country", sc);
			returnedArray = c.getCountries();
			returnedArray.add(country);
		//	for (String s :returnedArray ) {
		//		if (s !=null) {
		//		System.out.println(s);
		//		} // end of if loop
		//	} 
			boolean b = c.saveCountries(returnedArray);
			
			if (b ==true) {
				System.out.println("This country has been saved");
			}
		}
		System.out.println(Validate_Country.getMenu());
		break;
		default:
		break;
		} // end of switch
	} // end of if
//	} // end of while	
		if (choice ==3) {
		System.out.println("Goodbye");
		sc.close();
		}

	}

}
