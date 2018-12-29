package FinalProject;

import java.util.Scanner;

/**
 * Provides utilities for printing strings. Also contains a random number generator.
 * @author Thomas Pfaeffle
 *
 */
public class StringUtilities extends ThreadRunner {
	
	
	/**
	 * Calculates and returns a random number between 0 and 100.
	 * @return A random number between 0 and 100.
	 */
	public static int getRandom() {
		int upper = 100;
		int lower = 0;
	int r = (int) (Math.random() * (upper - lower)) + lower;
	return r;
	}
	
	/**
	 * Tests whether Enter was pressed to continue with the program. If anything else is entered,
	 * the test is repeated.
	 * 
	 * @param sc A scanner object.
	 * @param prompt A string prompt provided by the caller.
	 * @return boolean True if user presses Enter. False for anything else.
	 */
	public static boolean promptEnterKey(Scanner sc, String prompt)
	    {
	 
	        System.out.print(prompt);
	        while (sc.hasNextLine()) {
	        	if (sc.nextLine().equals("")) {
	        	return true;
	        	}
	        	else {
	        		System.out.println("You must press Enter to continue");
	        		sc.nextLine();  // discard any other data entered on the line
	        		System.exit(1);
	        		}
	        	
	        	} // end of nextLine while
	        return false;
	    } // end of method
	
	 /**
	    *  Prints to the console the name of the runner who is the winner of the race.
	    * 
	    * @param finishString The name of the winner of the race. The finishString 
	    * can be provided by the caller. See the following classes that use finished:
	    * @see Dog
	    * @see Cat
	    * @see Hare
	    * @see Tortoise
	    * @see DefaultHare
	    * @see DefaultTortoise
	    * 
	    */
	public static void finished(String finishString) {
		System.out.println(finishString + " " + "is the winner");
	}
}
