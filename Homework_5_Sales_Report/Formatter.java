package Homework_5_Sales_Report;

/* 
 * Thomas Pfaeffle
 * Java Comprehensive
 * Homework 5
 * 
 */

import java.math.RoundingMode;
import java.text.NumberFormat;

public class Formatter {
	
	// rounds the amount to two decimal places. returns amount as a String 
	public static String formatAmount(double amount) {
		
		NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
		currencyInstance.setMaximumFractionDigits(3);
		currencyInstance.setRoundingMode(RoundingMode.HALF_UP);
		String formattedAmount = currencyInstance.format(amount);

		return formattedAmount;
	}

}
