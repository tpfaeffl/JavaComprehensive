package FinalProject;

/**
 * IRunner interface defines methods that can be used by classes which implement it. 
 * @author Thomas Pfaeffle
 *
 */
public interface IRunner {
	

	String name = "";
	
	/**
	 * Returns the name of the runner as a string.
	 * @return runnerName The name of the runner.
	 */
	String getRunnerName();
	
	/**
	 * Returns the runner's speed.
	 * @return runnerSpeed The speed of the runner as an integer.
	 */
	int getRunnerSpeed();

	/**
	 * Returns the runner's rest percentage as an integer.
	 * @return restPercentage The percentage of time the runner rests.
	 */
	int getRestPercentage();
}


