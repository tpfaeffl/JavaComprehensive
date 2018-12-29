package Homework_3_Words;

/*
 * Java Comp.
 * Homework 3 Convert numbers to words
 * Author: Tom Pfaeffle 
 * 
 */

public class Words 
{
	
	public String s_digit;
	public String t_digit;
	public String t_string;
	public static int number; 
	public String OnesArray[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", 
			"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	public String TensArray[] = {" ", " ", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	
	public Words() {
		this(number);
		
	}
	
	
	public Words(int number) {
	
	}
	
	// Get the thousands word
	public String getThousands(int number) {
		if (number >= 1000) {
		int x = (int)(number/1000);
		return OnesArray[x] + " thousand ";
		}
		return " ";
		
	}
	
	// get the hundreds, tens, and singles
	public String getWords(int number) {
		if (number == 1000) {	
			return " ";
		}
		
		if (number >= 1000) {
			number = (number % 1000);
		}
		if (number % 100 < 20) {
			s_digit  = OnesArray[number % 100];
			number /= 100; 
		}
		else {
			s_digit = OnesArray[number %10];
			number /=10;
			
			s_digit = TensArray[number % 10] + s_digit;
			number /=10;
		}
		
		// test for zero
	//	if (number == 0) return s_digit;
		return OnesArray[number] + " hundred " + s_digit;
			
	}


}
