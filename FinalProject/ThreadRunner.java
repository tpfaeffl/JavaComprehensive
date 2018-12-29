package FinalProject;

/**
 * Defines useful methods that will be used in classes which implement ThreadRunner. This 
 * includes getters and setters for runnerName, runnerSpeed, and restPercentage. Also include is a run() method
 * an a getRandomNumber() method.
 * @author Thomas Pfaeffle
 *
 */
public class ThreadRunner extends Thread {
	
	protected static String runnerName;
	protected static int runnerSpeed;
	protected static int restPercentage;
	
	int distance = 0;
	
	/**
	 * Stub for the run() method which will be overridden in classes that extend ThreadRunner.
	 */
	@Override
	public void run() {
		
	//	while (distance < 1000) {
			
			
	//	} // end of while
	} // end of run
	/**
	 * Constructor for the ThreadRunner object. Initializes it to runnerName=empty string, runnerSpeed=0, 
	 * and restPercentage=0.
	 */
	public ThreadRunner() {
		this("", 0,0);
	}
	
	/**
	 * Constructor for the ThreadRunner object.
	 * @param runnerName The name of the runner as a string.
	 * @param runnerSpeed The speed of the runner as an integer.
	 * @param restPercentage The rest percentage of the runner as an integer.
	 */
	public ThreadRunner(String runnerName, int runnerSpeed, int restPercentage)  {	
		this.runnerName = runnerName;
		this.runnerSpeed = runnerSpeed;
		this.restPercentage = restPercentage;
		
	} // end of ThreadRunner
	
	
	/**
	 * Calculates and returns a random number between 0 an 100.
	 * @return number A random number between 0 and 100.
	 */
	public int getRandomNumber() {
		int number = 0;
				
	 return number;
	}
	
	/**
	 * Sets the name of the runner as a string.
	 * @param runnerName The name of the runner.
	 */
	public void setRunnerName(String runnerName) {
		this.runnerName = runnerName;
	}
	
	/**
	 * Returns the name of this object.
	 * @return name The name of the object.
	 */
	public String getRunnerName() {
		return runnerName;
		
	}
	
	/**
	 * Sets the speed of the runner as an integer.
	 * @param runnerSpeed The speed of the runner.
	 */
	public void setRunnerSpeed(int runnerSpeed) {
		this.runnerSpeed = runnerSpeed;
	}
	
	/** 
	 * Returns the speed for this object.
	 * @return runnerSpeed The speed of this object.
	 */
	public int getRunnerSpeed() {
		return runnerSpeed;
	}
	
	/**
	 * Sets the rest percentage for the runner as an integer.
	 * @param restPercentage The percentage of time the runner rests.
	 */
	public void setRestPercentage(int restPercentage) {
		this.restPercentage = restPercentage;
	}
	
	/**
	 * Returns the percentage of time the object rests.
	 * @return restPercentage The percentage of time the object rests.
	 */
	public int getRestPercentage() {
		return restPercentage;
	}
	
}
		
	

