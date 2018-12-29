package FinalProject;

import java.util.ArrayList;

/**
 * Defines the Cat object. Extends ThreadRunner, implements IRunner.
 * @author Thomas Pfaeffle
 * @see ThreadRunner
 * @see IRunner
 */
public class Cat extends ThreadRunner implements IRunner  {
	
	//instance variables
	private static String runnerName;
	private static int runnerSpeed;
	private static int restPercentage;
	private String name;
	
	/**
	 * Constructor to define the Cat object. Calls the super (ThreadRunner) with 
	 * parameters runnerName, runnerSpeed, and restPercentage.
	 */
	public Cat() {
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
	 * Pulls the Cat object out of the array of ThreadRunner objects.
	 * @param  list - an array of ThreadRunner objects.
	 * @return Cat A Cat object.
	 */
	public Cat getCatObject(ArrayList<ThreadRunner> list) {
		Cat c = null;
		for  (int i = 0; i< list.size(); i++) {
			ThreadRunner t = list.get(i);
			if ( t.getRunnerName().equals("Cat")) {
				runnerName = t.getRunnerName();
				runnerSpeed = t.getRunnerSpeed();
				restPercentage = t.getRestPercentage();
				ThreadRunner h = new ThreadRunner(runnerName, runnerSpeed, restPercentage);
				c = (Cat)(h); 
				
			} // end of if
			
		} // end of for
		
		return c;
	} // end of getCatObject
	

	/**
	 * Run method for the Cat thread.
	 * @see FinalProject.ThreadRunner#run()
	 */
	public void run() {
		Cat c = new Cat();
		System.out.println("Starting Cat");
	//	interrupt();
	}
}
