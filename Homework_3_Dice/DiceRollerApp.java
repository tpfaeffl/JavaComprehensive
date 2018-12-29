package Homework_3_Dice;

import java.util.Scanner;


public class DiceRollerApp {

	public static void main(String[] args) {
		
		int rollCount = 1;
		System.out.println("Welcome to the Paradise Roller Application");
		
		//Create one or more Circle items
		
				Scanner sc = new Scanner(System.in);
		        String choice = "y";
		        while (choice.equalsIgnoreCase("y")) {
		
		System.out.println("Roll " + rollCount++ + ":");
		System.out.println();    
		
		// create PairOfDice object and roll them
		PairOfDice p = new PairOfDice();
		p.roll();
		
		System.out.println("Die 1 is: " + p.getValue1());
		System.out.println("Die 2 is: " + p.getValue2());
		
		
		
		if ((p.getValue1() == p.getValue2()) && (p.getValue1() == 6 )){
			System.out.println("Box cars!");}
			
			else if ((p.getValue1() == p.getValue2()) && (p.getValue1() == 1 )) {
				System.out.println("Snake eyes!");
			}
			else if  (p.getSum() == 7) {
				System.out.println("Craps!");
			}
		
		
		
		// see if the user wants to continue
		
    	System.out.println();
    	choice = Validator.getString(sc, "Roll again? : (y/n): ");
        if (choice.equalsIgnoreCase("n")) {
        	System.out.println("Goodbye.");
        }
        System.out.println();
	}
	} // end of while
}
