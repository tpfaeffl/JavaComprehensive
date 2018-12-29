package FinalProject;

import java.util.ArrayList;

/**
 * Defines the Hare object. Extends ThreadRunner, implements IRunner.
 * @see ThreadRunner
 * @see IRunner
 * @author Thomas Pfaeffle
 */
public class Hare extends ThreadRunner implements IRunner{
	
	private static String runnerName;
	private static int runnerSpeed;
	private static int restPercentage;
	private String name;
	

	/**
	 * Constructor for the Hare object, Inherits runnerName, runnerSpeed, restPercentage
	 * from ThreadRunner.
	 * 
	 * @see ThreadRunner
	 */
	public Hare() {
		super(runnerName, runnerSpeed, restPercentage);
		
	}
	
	/**
	* Returns the name (runnerName) of this runner.
	* @return - runner's name as a string
	*/
	public String getRunnerName() {
		return name;
	}

	/**
	* Returns the speed (runnerSpeed) of this runner.
	* @return - runner's speed as an integer
	*/
	public int getRunnerSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	* Returns the rest percentage of this runner.
	* @return rest percentage as an integer.
	*/
	public int getRestPercentage() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * Pulls the Hare object out of the array of ThreadRunner objects.
	 * @param list An ArrayList of ThreadRunner objects. 
	 * 
	 * @return A Hare object.
	 * @see ThreadRunner
	 */
	public Hare getHareObject(ArrayList<ThreadRunner> list) {
		Hare h = null;
		for  (int i = 0; i< list.size(); i++) {
			ThreadRunner t = list.get(i);
			if (t.getRunnerName().equals("Hare")) {
				runnerName = t.getRunnerName();
				runnerSpeed = t.getRunnerSpeed();
				restPercentage = t.getRestPercentage();
				ThreadRunner r = new ThreadRunner(runnerName, runnerSpeed, restPercentage);
				h = (Hare)(r); 
				
			} // end of if
			
		} // end of for
		
		return h;
	} // end of getHareObject

/**
 * Run method for the Hare thread. 
 * @see FinalProject.ThreadRunner#run() 
 */
public void run() {
	
	System.out.println("Starting Hare");
	interrupt();
}
}
