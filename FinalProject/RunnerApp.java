package FinalProject;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.stream.XMLStreamException;

/**
 * Driver class for the Marathon Race application. Extends Thread class.
 * @author Thomas Pfaeffle
 */
public class RunnerApp extends Thread {
	
	// instance variables
	private static String runnerName;
	public static String s;
	
	/**
	 * Provides choices for the datasources for the Marathon application. 
	 * 1 = database as the datasource. In this case, provide the name of the database. Currently, 
	 * this choice only displays the contents of the database, starts then stops the threads. 
	 * 2 = XML file as the datasource. In this case, provide the name of the XML file. Currently, 
	 * this choice only displays the contents of the XML file, starts then stops the threads. 
	 * 3 = Text file as the datasource. In this case, provide the name of the text file. Currently, 
	 * this choice only displays the contents of the text file, starts then stops the threads. 
	 * 4 = Run default case of 2 runners.
	 * 5 = End the program. 
	 * 
	 * The program will continue as long as the user presses ENTER.
	 * @param args Arguments to main method.
	 * @throws FileNotFoundException If the filename entered is not found.
	 * @throws XMLStreamException If the database name was not found.
	 */
	public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
		
		System.out.println(" Welcome to the Marathon Race Runner Program");
		ArrayList<ThreadRunner> myReturnedList = null;
 		int choice = 0;
 		boolean goOn = true;
		ThreadRunner t = new ThreadRunner();
		Scanner sc = new Scanner(System.in);
		String runnerName = "";

		
	// continue as long as user presses the ENTER key.	
	while (goOn == true) {	
		displayMenu();
		choice = Validator.getInt(sc, "Select your data source  ", 0, 6);
		
		// choose the data source
		if (choice <= 5) {
			
			// use database as data source. Provide name of the database.
			if (choice == 1) {
				String source = Validator.getDatabaseName(sc, "Enter name of a database: "); 		
				myReturnedList = DataBank.getDBData(source);
				ThreadUtilities.startThreads(myReturnedList);

				ThreadUtilities.interruptThreads(myReturnedList);
			
			}			
			// use XML file as data source. Provide name of the file.
			else if (choice == 2) {
				String source = Validator.getRequiredXMLString(sc, "Enter XML file name: ");
				myReturnedList = DataBank.getXMLData(source);
				t = null;
				System.out.println("Runner count is : " + DataBank.runnerCount);
				ThreadUtilities.startThreads(myReturnedList);

				ThreadUtilities.interruptThreads(myReturnedList);
			
			}
			
			// use text file as data source. Provide name of the file.
			else if (choice == 3) {
				String source = Validator.getRequiredTextString(sc, "Enter text file name: ");
				myReturnedList = DataBank.getTextData(source);
				ThreadUtilities.startThreads(myReturnedList);

				ThreadUtilities.interruptThreads(myReturnedList);
			}
			
			// run default case with hard-coded data.
			else if (choice == 4) {
				DefaultHare Hare = new DefaultHare();
				DefaultTortoise Tortoise = new DefaultTortoise();
				
				ThreadUtilities.startDefaultThreads(Tortoise, Hare);
			

			}
			
			// exit the program
			else if (choice == 5) {
				System.out.println("Thank you for using my Marathon Race Program.");
				System.exit(1);
				
			}
			else
                System.out.println("Error! Not a valid choice.\n");
			
		
		} // end of choice while
		
		// prompt to continue the program
		goOn = StringUtilities.promptEnterKey(sc, "Press ENTER to continue.... \n");
		
	}  // end of goOn while	

} // end of main
	
		/**
		 * Displays the menu of choices for the program as strings.
		 */
	   public static void displayMenu()
	    {
	        System.out.println("");
	        System.out.println("1.    Derby Database");
	        System.out.println("2.    XML File");
	        System.out.println("3.    Text File");
	        System.out.println("4.    Default Two Runners");
	        System.out.println("5.    Exit");
	        System.out.println("");
	        
	    }
	   
	   /**
	    * Returns the name (runnerName) of this runner.
	    */
	   private static String getRunnerName() {
		 String name = runnerName;
		
		   return name;
	   }
	
	  
	
	

} // end of class


