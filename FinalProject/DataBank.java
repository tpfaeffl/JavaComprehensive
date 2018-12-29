package FinalProject;

// common imports
import java.util.ArrayList;

//imports for database
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


//imports for XML
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

// imports for text files methods
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Defines methods to pull data from a database, an XML file and a text file.
 * @author Thomas Pfaeffle
 *
 */
public class DataBank {
	
	// instance variables
	public static int runnerCount;
	private static int runnerSpeed;
	private static int restPercentage;
	private static String runnerName;

	ThreadRunner p = null;


	
	
	
	
	// --------------get database data starts here------------------ 
	
	/**
	 * Pulls data from a derby database. Uses the getConnection method to get the connection
	 * to derby. The data is read forward only, concur read only. The query selects runner name,
	 * runner speed, and rest percentage from the RunnerStats table in the derby database. these
	 * values are printed as a diagnostic.  
	 * 
	 * These values are stored in an ArrayList of ThreadRunners. A count is made of the rows 
	 * returned. 
	 * @param source The name of the database.
	 * @return ArrayList of ThreadRunner objects.
	 */
	public static ArrayList<ThreadRunner> getDBData(String source) {
		
	ThreadRunner t = null;
	ArrayList<ThreadRunner> list = new ArrayList<>();
	Connection connection = getConnection(source);
	try {
		Statement statement = connection.createStatement(
				ResultSet.TYPE_FORWARD_ONLY,
				ResultSet.CONCUR_READ_ONLY);
	
		// select from RunnersStats table
		String query = "SELECT Name, RunnerSpeed, RestPercentage "
				+ "FROM RunnersStats ORDER BY Name" ;
	
		ResultSet rs = statement.executeQuery(query);
		while(rs.next()) {
		String runnerName = rs.getString(1);
		int runnerSpeed = (int) rs.getDouble(2);
		int restPercentage = (int)rs.getDouble(3);
		System.out.println("Name:  " + runnerName + " Speed: " + runnerSpeed + " Rest: " + restPercentage);

		t = new ThreadRunner(runnerName, runnerSpeed, restPercentage);
		list.add(t);
		} // end of while
		runnerCount = list.size();
	
	} // end of try
	catch (NullPointerException e) {
		System.out.println("The connection to the database with the specified name cannot be made.");
	}
	catch (IndexOutOfBoundsException e) {
		System.out.println("The name of the database is incorrect.");
	}
	catch (SQLException e) {
		System.out.println("There was a SQL exception.");
		e.printStackTrace();
	} // end of catch
	
	return list;
} // end method getDBData
	
	/**
	 * Gets a connection to the Derby database.
	 * @param source The name of the database.
	 * @return A connection object.
	 * @throws SQLException if there was a problem connecting to the database or loading the 
	 * database driver.
	 */
private static Connection getConnection(String source) {
	
	Connection connection = null;
	try {
	
		String dbDirectory = "Resources";
		System.setProperty("derby.system.home", dbDirectory);
		
		// use the DriverManager to create a
		//Connection object
		String dbUrl = "jdbc:"+source+":RunnersDB";
		String username = "";
		String password = "";
		connection = DriverManager.getConnection(dbUrl, username, password);

	return connection;
	}
	
	catch (SQLException e) {
		System.err.println("Error loading database driver: " );
//		for (Throwable t:e) {
//			System.out.println(t);
//			e.printStackTrace();
//		}
		return null;
	}
} // end of getConnection
//---------get database data ends here-------------------

// ------------------------------------------------------

//---------get XML data starts here------------------------

/**
 * Reads data from an XML file. 
 * 
 * @param source The name of the XML file.
 * @return An ArrayList of ThreadRunner objects.
 */
public static ArrayList<ThreadRunner> getXMLData(String source) {

	String runnerName = "";
	int runnerSpeed = 0;
	int restPercentage = 0;
	
	ArrayList<ThreadRunner> list = new ArrayList<>();
	ThreadRunner t = null;
	XMLInputFactory  inputFactory= XMLInputFactory.newFactory();
	
try {		
	
	FileReader fileReader = new FileReader(source);
	XMLStreamReader reader = inputFactory.createXMLStreamReader(fileReader);		
			
	while (reader.hasNext()) 
	{
		int eventType = reader.getEventType();
		
		switch(eventType) 
		{
			case XMLStreamConstants.START_ELEMENT:
			String elementName = reader.getLocalName();

			if (elementName.equals("Runner")) 
			{
				t = new ThreadRunner();
				System.out.println("process Runner");
				runnerName = reader.getAttributeValue(0);
				t.setRunnerName(runnerName);
				System.out.println(t.getRunnerName());
			} // end if
			
			if (elementName.equals("RunnersMoveIncrement")) {
				
				System.out.println("process RunnerMoveIncrement");
				String runnerSpeedString = reader.getElementText();
				runnerSpeed = Integer.parseInt(runnerSpeedString);
				t.setRunnerSpeed(runnerSpeed);
				System.out.println(t.getRunnerSpeed());
				
			} // end if
			
			if (elementName.equals("RestPercentage")) {
				
				System.out.println("process restPercentage");
				String restPercentageString = reader.getElementText();
				 restPercentage = Integer.parseInt(restPercentageString);	
				 t.setRestPercentage(restPercentage);
				 System.out.println(t.getRestPercentage());
				 
			} // end if
			
			break;
	
		case XMLStreamConstants.END_ELEMENT:
			elementName = reader.getLocalName();
			if (elementName.equals("Runner")) 
			{
				list.add(t);
			} // end if
			runnerCount = list.size();
			break;
			default:
				break;
			} // end switch
		reader.next();
		} // end while
}
catch (NullPointerException e) {
	System.out.println("Cannot connect to the file with the specified name " + source +". Try again.");
}
catch (IOException | XMLStreamException e)
{
	System.out.println("There was a problem reading from the file: " + source);
	System.out.println(e);
}
	
		
		return list;
	} 

/**
 * Returns the runner's speed.
 * @return The runner's speed as an integer.
 */
public static int getRunnerSpeed() {
	
	return runnerSpeed;
}

//-----------get XML data ends here----------------

//-------------------------------------------------

//----------get text data starts here--------------

/**
 * Reads the data from a text file. Includes a test to see if the file exists.
 * Prints the runner's name, speed, and rest percentage 
 * as a diagnostic. Returns a ArrayList of ThreadRunner objects.
 * 
 * @param source The name of the Text file.
 * @return An array of ThreadRunner objects.
 */
public static ArrayList<ThreadRunner> getTextData(String source){
	
	ThreadRunner t = null;
	ArrayList<ThreadRunner> list = new ArrayList<>();

	String [] columns = null;
	String line = null;


		String fileString = source;
		Path filePath = Paths.get(fileString);
	if (Files.exists(filePath)) {
		
		File textFile = filePath.toFile();
		try (BufferedReader in = new BufferedReader (new FileReader(textFile)))
		{
			line = in.readLine();
			while (line !=null) {
			
			columns = line.split("\t");
			String runnerName = columns[0];
			String runnerSpeed = columns[1];
			String restPercentage = columns[2];
			System.out.println("Name:  " + runnerName + " Speed: " + runnerSpeed + " Rest: " + restPercentage);

			t = new ThreadRunner (runnerName, Integer.parseInt(runnerSpeed), Integer.parseInt(restPercentage));
			list.add(t);
			runnerCount = list.size();
			line = in.readLine();
			} // end of while
		} // end of try
		catch (IOException e) {
			System.out.println("The data cannot be read.");
			System.out.println(e);
		} // end of catch
	}  // end of if
		else {
			System.out.println(filePath.toAbsolutePath() + " doesn't exist. ");
		}
	return list;
	}

}// end class
