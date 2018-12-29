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



public class Calculate_Interest {
	
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		
		double interest_rate= 0;
		double loan_amount = 0;
		String choice = "y";
		
		System.out.println("Welcome to the Interest Calculator");
		
		while (!choice.equalsIgnoreCase("n"))
        {
			// get loan amount and interest rate
			System.out.print("Enter loan amount:     ");
			loan_amount = sc.nextDouble();
			System.out.print("Enter interest rate:   ");
			interest_rate = sc.nextDouble();
			
			
			// convert values to Big Decimal
			BigDecimal bd_loan_amount = new BigDecimal(Double.toString(loan_amount));
			bd_loan_amount = bd_loan_amount.setScale(2, RoundingMode.HALF_UP);
			
			BigDecimal bd_interest_rate = new BigDecimal(Double.toString(interest_rate));
	//		bd_interest_rate = bd_interest_rate.setScale(5, RoundingMode.HALF_UP);
			
			BigDecimal interest = bd_interest_rate.multiply(bd_loan_amount);
			interest = interest.setScale(2, RoundingMode.HALF_UP);
			
		
			// format values
			NumberFormat currency = NumberFormat.getCurrencyInstance();
            NumberFormat percent = NumberFormat.getPercentInstance();
            percent.setMaximumFractionDigits(3);
            System.out.println();
            System.out.println("formatted values");
            String message = "Loan_Amount:          " + currency.format(bd_loan_amount) + "\n"
            		       + "Interest Rate:        " + percent.format(interest_rate) + "\n" 
            		       + "Interest:             " + currency.format(interest);
			
            System.out.println(message);
            
		 // see if the user wants to continue
		System.out.println();
		System.out.println();
        System.out.print("Continue? (y/n): ");
        choice = sc.next();
        System.out.println();
        }
		sc.close();
    } 
   
}
