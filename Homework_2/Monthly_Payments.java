package Homework_2;

/**
 * Author: Thomas Pfaeffle
 * Java Comprehensive
 * 25 Jan 2018
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;
import java.lang.Math;




public class Monthly_Payments {
	
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		double loan_min = 0.0;
		double loan_max = 1000000.0;
		double interest_min = 0.0;
		double interest_max = 15.0;
		int years_min = 0;
		int years_max = 100;
		double interest_rate= 0;
		int years = 0;
		double loan_amount = 0;
		String choice = "y";
		
		System.out.println("Welcome to the Loan Calculator");
		
		while (!choice.equalsIgnoreCase("n"))
        {
			// get loan amount, number of years, and interest rate
			loan_amount =  getDoubleWithinRange(sc, "Enter loan amount:   ", loan_min, loan_max);
			
			interest_rate =  getDoubleWithinRange(sc, "Enter yearly interest rate:   ", interest_min, interest_max);
			
			years = getIntegerWithinRange(sc, "Enter number of years:   ", years_min, years_max);
			
		
			
			// calculate monthly interest and monthly payment
			double monthly_interest_rate = interest_rate/100/12;
			int term = years * 12;
			
		//	System.out.println("monthly interest rate " + monthly_interest_rate +  "  term  " + term);	
			double payment = (loan_amount * monthly_interest_rate)/ (1 - Math.pow(1 + monthly_interest_rate, -term));
			
		//	System.out.println("Payment: " + payment);
	
			
		
			// format values
			NumberFormat currency = NumberFormat.getCurrencyInstance();
            NumberFormat percent = NumberFormat.getPercentInstance();
            percent.setMaximumFractionDigits(3);
            System.out.println();
            System.out.println("FORMATTED RESULTS");
            String message = "Loan_Amount:          " + currency.format(loan_amount) + "\n"
           		       + "Yearly Interest Rate: " + percent.format(interest_rate/100) + "\n" 
            		       + "Number of Years:      " + years + "\n"
            		       + "Monthly Payment       " + currency.format(payment);
			
            System.out.println(message);
            
         // See if user  wants to continue
         	choice = getResponse(sc, "Continue? (y/n)   ");		
         	System.out.println();
        }
		sc.close();
    } 
	
	// method to continue or not
	public static String getResponse (Scanner sc, String prompt)
	
	{
		String response = null;
		boolean isValid = false;
		while (isValid == false)
		{
			
			System.out.print(prompt);
			if (sc.hasNext())
			{
				
				response = sc.next();
				if (response.equalsIgnoreCase("n") || response.equalsIgnoreCase("y"))
					isValid = true;
				
				else {
					System.out.println("Error! This entry is required. Try again.");
				}
			sc.nextLine();		
			}			
		}
		return response;
	}
	
	// method to test if integer values were provided
	public static int getInteger (Scanner sc, String prompt)
	
	{
		int i = 0;
		boolean isValid = false;
		while (isValid == false)
		{
			System.out.print(prompt);
			if (sc.hasNextInt())
			{
				
				i = sc.nextInt();
				isValid = true;
			}
			else 
			{
				System.out.println("Error! Invalid integer value. Try again.");
				System.out.println("");
			}
			sc.nextLine();
			
		}
		return i;
			
	}
	
	// method to test if integer values are within range
	public static int getIntegerWithinRange(Scanner sc, String prompt, int min, int max)
	
	{
		int i = 0;
		boolean isValid = false;
		while (isValid == false)
		{
			i = getInteger(sc, prompt);
			if (i <= min)
			{
				System.out.println("Error! number must be greater than: " + min + ".");
				System.out.println("");
			}
			else if (i >= max)
			{
			System.out.println("Error! Number must be less than: " + max + "." );
			System.out.println("");
			}
			else 
				isValid = true;
		}
		return i;
		
	}
	
	
	// method to test if double values were provided
	public static double getDouble (Scanner sc, String prompt)
	
	{
		double d = 0.0;
		boolean isValid = false;
		while (isValid == false)
		{
			System.out.print(prompt);
			if (sc.hasNextDouble())
			{
				
				d = sc.nextDouble();
				isValid = true;
			}
			else 
			{
				System.out.println("Error! Invalid decimal number. Try again.");
				System.out.println("");
			}
			sc.nextLine();
			
		}
		return d;
			
	}
	
	// method to test if double values are within range
	public static double getDoubleWithinRange(Scanner sc, String prompt, double min, double max)
	
	{
		double d = 0.0;
		boolean isValid = false;
		while (isValid == false)
		{
			d = getDouble(sc, prompt);
			if (d <= min)
			{
				System.out.println("Error! number must be greater than: " + min + ".");
				System.out.println("");
			}
			else if (d >= max)
			{
			System.out.println("Error! Number must be less than: " + max + "." );
			System.out.println("");
			}
			else 
				isValid = true;
		}
		return d;
		
	}
   
}