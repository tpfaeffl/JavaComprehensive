package FinalProject;

import java.util.Scanner;

/**
 * Class to provide validations for user input. Includes methods for integers, strings, and file names.
 * @author Thomas Pfaeffle
 * 
 */
public class Validator {
	
	
	/**
	 * Tests that an integer was entered. Called by getInt(Scanner sc, String prompt,
     * int min, int max). 
	 * @param sc A Scanner object.
	 * @param prompt Prompt provided by the user.
	 * @return A valid integer.
	 * @see #getInt(Scanner, String, int, int)
	 */
    public static int getInt(Scanner sc, String prompt)
    {
        boolean isValid = false;
        int i = 0;
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
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

    /**
     * Tests that a valid integer in the range min-max was entered. Displays an  error
     * message if it is not and lets the user try again. Calls getInt(Scanner sc, String prompt)
     * to esure that an integer was actually entered.
     * @param sc Scanner object
     * @param prompt Prompt to be displayed to the console.
     * @param min The minimum value of the integer.  
     * @param max The maximum value of the integer. 
     * @return An integer within the range min-max. 
     * @see #getInt(Scanner, String)
     */
    public static int getInt(Scanner sc, String prompt,
    int min, int max)
    {
        int i = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            i = getInt(sc, prompt);
            if (i <= min)
                System.out.println(
                		"Error! Number must be greater than " + min + "  Try again. ");
            else if (i >= max)
                System.out.println(
                		"Error! Number must be less than " + max + "  Try again. ");
            else
                isValid = true;
        }
        return i;
    }

    /**
     * Reads a string value and tests whether it is a valid database name. If not, allows the user
     * to try again. 
     * @param sc A Scanner object.
     * @param prompt A prompt provided by the user.
     * @return A string representing the database name.
     */
	public static String getDatabaseName(Scanner sc, String prompt) {
		        
	        String s = "";
			System.out.println();
			System.out.println();
			
			boolean correctName = false;
			while (correctName == false) {
				System.out.println(prompt);
				s = sc.nextLine();

				
				if (!s.equals("derby")) {
					System.out.println("Error! Database " + s + " is not supported. Try again.");
					
				}
				else if (s.equalsIgnoreCase("derby")) {
					
					System.out.println("You are reading from database: " + s);
					return s;
				}
				correctName = false;
				
			}  	// end of while	
			return null;
		} // end of method
	
	
	/**
	 * Reads a string value and tests whether it is a valid text file name. If not, allows the user
     * to try again.  
	 * @param sc A Scanner object.
     * @param prompt A prompt provided by the user.
     * @return A string representing the text file name.
	 */
	public static String getRequiredTextString(Scanner sc, String prompt) {
		String s = "";
		System.out.println();
		System.out.println();

	try {	
		boolean correctName = false;
		while (correctName == false) {
			System.out.println(prompt);
			s = sc.nextLine();

			
			if (!s.equalsIgnoreCase("FinalTextData.txt")) {
				System.out.println("Error! " + s + " is not the correct text file name. Try again.");
			}
			else if (s.equalsIgnoreCase("FinalTextData.txt")) {
				
				System.out.println("You are reading from file: " + s);
				return s;
			}
			correctName = false;
			
		}  	// end of while	
	}
	catch (NullPointerException e ){
		System.out.println("The file cannot be found. Try again.");
		
	}
		return null;
	}
	
	/**
	 * Reads a string value and tests whether it is a valid XML file name. If not, allows the user
     * to try again.  
	 * @param sc A Scanner object.
     * @param prompt A prompt provided by the user.
     * @return A string representing the XML file name.
	 */
	public static String getRequiredXMLString(Scanner sc, String prompt) {
		String s = "";
		System.out.println();
		System.out.println();
			
		boolean correctName = false;
		while (correctName == false) {
			System.out.println(prompt);
			s = sc.nextLine();
		
			if (!s.equalsIgnoreCase("FinalXMLData.xml")) {
					
					System.out.println("ERROR: " + s + " is not the correct filename. Try again.");
					
				}
			
			else if (s.equalsIgnoreCase("FinalXMLData.xml")) {
				System.out.println("You are reaing from file: " + s);
				return s;
		}
				
			correctName = false;
		} // end of while
	

		return null;
		
	} // end of method
	

		
	/**
	 * Test whether the user pressed the Enter key. If the user did, control returns to the 
	 * calling program. If not, the user is allowed to try again.
	 * @param sc A Scanner object.
	 * @param prompt A prompt provided by the user.
	 * @return True if the user pressed Enter. If false, allows the user to try again. 
	 */
	public static boolean promptEnterKey(Scanner sc, String prompt)
    {
  //  	boolean goOn;
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

}
