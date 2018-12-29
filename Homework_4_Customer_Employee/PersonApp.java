package Homework_4_Customer_Employee;

import java.util.Scanner;

public class PersonApp {
	
	public static Scanner sc = null;
	
	
	

	public static void main(String[] args) {
		
		String firstName = "";
		String lastName = "";
		String email = "";
		String customerNumber = "";
		String socialSecurityNumber = "";
		
		sc = new Scanner(System.in);
		System.out.println("Welcome to the Person Tester application");
		
	String keepGoing = "y";
	while (keepGoing.equalsIgnoreCase("y")) {
		
		String choice = Validator.getChoiceString("Create customer or employee: ", "c", "e");
		// System.out.println("choice is : " + choice);
		if (choice.equals("c")) {
			Customer cus = new Customer();
			cus.setFirstName(firstName);
			cus.setLastName(lastName);
			cus.setEmail(email);
			cus.setCustomerNumber(customerNumber);
			System.out.print(cus.getDisplayText());
			
		}
		else {
			Employee emp = new Employee();
			emp.setFirstName(firstName);
			emp.setLastName(lastName);
			emp.setEmail(email);
			emp.setSocialSecrityNumber(socialSecurityNumber);
			System.out.print(emp.getDisplayText());
		}
		
		// see if the user wants to continue
		
		
		keepGoing = Validator.getChoiceString("Continue?", "y", "n");
		

		}
				

	}

}
