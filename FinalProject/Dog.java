package FinalProject;

import java.util.ArrayList;

/**
 * Class to define the Dog object. Extends ThreadRunner implements IRunner.
 * @author Thomas Pfaeffle
 * @see ThreadRunner
 * @see IRunner
 */
public class Dog extends ThreadRunner implements IRunner {
	private static String runnerName = " ";
	private static int runnerSpeed;
	private static int restPercentage;
	private String name;
//	public ThreadRunner h = new ThreadRunner(String, int, int);
	
	/**
	 * Constructor for the Dog class.
	 */
	public Dog() {
		super(runnerName, runnerSpeed, restPercentage);
	}
	
//	public Dog(String runnerName, int runnerSpeed, int restPercentage) {
//			
//	}
	
	/**
	 * Returns the name of this Dog object.
	 * @return name The name of the Dog object.
	 */
	public String getRunnerName() {
		return name;
	}

	/** 
	 * Returns the speed for this Dog object.
	 * @return runnerSpeed The speed of this object.
	 */
	public int getRunnerSpeed() {
		
		return runnerSpeed;
	}

	/**
	 * Returns the percentage of time the Dog object rests.
	 * @return restPercentage The amount of time the Dog object rests.
	 */
	public int getRestPercentage() {
		
		return restPercentage;
	}
	
	/**
	 * Pulls the Dog object out of the array of ThreadRunner objects.
	 * @param list An ArrayList of ThreadRunner objects.
	 * @return Dog A Dog object.
	 */
	public Dog getDogObject(ArrayList<ThreadRunner> list) {
		Dog d = null;
		for  (int i = 0; i< list.size(); i++) {
			ThreadRunner t = list.get(i);
			if ( t.getRunnerName().equals("Dog")) {
				runnerName = t.getRunnerName();
				runnerSpeed = t.getRunnerSpeed();
				restPercentage = t.getRestPercentage();
				ThreadRunner h = new ThreadRunner(runnerName, runnerSpeed, restPercentage);
				d = (Dog)(h); 
				
			} // end of if
			
		} // end of for
		
		return d;
		
	} // end of getDogObject
	
	/**
	 * Runs the dog thread. 
	 * Dog thread, then exits.
	 */
	@Override
	public void run() {
		
	
		Dog ct = (Dog)Thread.currentThread();
		System.out.println("This is the name of the dog thread:  " + ct.getName());
	
	
	}

}
