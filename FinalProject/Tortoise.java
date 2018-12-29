package FinalProject;

import java.util.ArrayList;

/**
 * Class to define the Tortoise object. Extends ThreadRunner implements IRunner.
 * @author Thomas Pfaeffle
 * @see ThreadRunner
 * @see IRunner
 */
public class Tortoise extends ThreadRunner implements IRunner {
	
	public static int FINISH = 1000;
	
	private int tDistance;

	private static String runnerName;
	private static int runnerSpeed;
	private static int restPercentage;
	private String name;

	
	/**
	 * Constructor for the Tortoise class. Calls the super (ThreadRunner) with 
	 * parameters runnerName, runnerSpeed, and restPercentage. 
	 */
	public Tortoise() {
		super(runnerName, runnerSpeed, restPercentage);
	}
	
	/**
	 * Returns the name of this Tortoise object.
	 * @return name The name of the Tortoise object.
	 */
	public String getRunnerName() {
		
		return name;
	}

	/** 
	 * Returns the speed for this Tortoise object.
	 * @return runnerSpeed The speed of this object.
	 */
	public int getRunnerSpeed() {
		// TODO Auto-generated method stub
		return runnerSpeed;
	}

	/**
	 * Returns the percentage of time the Dog object rests.
	 * @return restPercentage The amount of time the Dog object rests.
	 */
	public int getRestPercentage() {
		// TODO Auto-generated method stub
		return restPercentage;
	}
	

//	public Tortoise(String name, int runnerSpeed, int restPercentage) {
//		this.name = name;
//		this.runnerSpeed = runnerSpeed;
//		this.
		
		// TODO Auto-generated constructor stub
	
	/**
	 * Pulls the Tortoise object out of the array of ThreadRunner objects.
	 * @param list An ArrayList of ThreadRunner objects.
	 * @return Tortoise A Tortoise object.
	 */
	public Tortoise getTortoiseObject(ArrayList<ThreadRunner> list) {
		Tortoise m = null;
		for  (int i = 0; i< list.size(); i++) {
			ThreadRunner t = list.get(i);
			if ( t.getRunnerName().equals("Tortoise")) {
				runnerName = t.getRunnerName();
				runnerSpeed = t.getRunnerSpeed();
				restPercentage = t.getRestPercentage();
				ThreadRunner r = new ThreadRunner(runnerName, runnerSpeed, restPercentage);
				m = (Tortoise)(r); 			
			} // end of if
			
		} // end of for
		
		return m;
	} // end of getTortoiseObject
	

	
	/**
	 * Creates a Tortoise object. 
		* Creates a new Tortoise object. Tests to see if rest 
		* percentage is greater than or equal to 0 and less than 40. If it is, add 10 (runnerSpeed) to the total distance. 
		* 
		* A diagnostic message is printed with the runner name and the random number generated.
		* 
		* A diagnostic message with the runner name and distance covered is printed 
		* if distance covered is less than than 1000. 
		* 
		* If distance is greater than than 1000,  the 
		* runner name and distance covered is printed to the console. Printing is handled by the
		* StringUtilities.finished() method.
		* @see StringUtilities#finished(String)
		* 
		*/
	public void run() {
//		Tortoise m = new Tortoise();
		System.out.println("Starting Tortoise");
		try {
			while (distance <= FINISH) {
				int random = StringUtilities.getRandom();
				
				if (random >= 0 && random < 40 ){
					
					interrupt();
					notifyAll();
					tDistance += getRunnerSpeed();
					distance = tDistance;
					
					if (distance < FINISH) {
						System.out.println(getRunnerName() + ": " + tDistance);
					} // end of inner if
					if (distance >= FINISH) {
						StringUtilities.finished(getRunnerName());
						System.exit(1);
//						Hare.interrupt();
//						try {
//							Hare.join();
//						} catch (InterruptedException e) {
//							System.out.println("Tortoise: you beat me ");
//							e.printStackTrace();
//						}
				//		notifyAll();
				//		Hare.stop();
						
					}
				
				} // end of outer if
				
				// if random less than 50, get out of Tortoise 
				else { 
					Thread.yield();
					join();
				
				} // end of else

			} // end of while
			} // end of try
			catch (InterruptedException e) {
				System.out.println("ERROR: Thread was interrupted");
			}
	}

}
