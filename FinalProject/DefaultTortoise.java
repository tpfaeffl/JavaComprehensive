package FinalProject;


/**
 * Defines the behavior and data belonging to the DefaultTortoise object.
 * @author Thomas Pfaeffle
 *
 */
public class DefaultTortoise extends ThreadRunner implements IRunner {
	
	// 	instance variables
	public final static int FINISH = 1000;
	public static int distance = 0;
	public static int hDistance = 0;
	public static int tDistance = 0;
	public DefaultTortoise Tortoise;
	public volatile boolean  runIt = true; 

	
		public DefaultTortoise() { 
			super("Tortoise", 10, 0);
		}  // end constructor
		
		
		/**
		 * Pits two runners, Tortoise and Hare against each other. If a generated random number
		 * is less than than the Hare's rest percentage (restPercentage=90), the Tortoise runs at its
		 * speed (runnerSpeed=10). If the Tortoise reaches 1000, the tortoise wins and the hare concedes.
		 * If the random number is less than the rest percentage, the Hare runs.
		 * @see DefaultHare
		 * @see IRunner
		 * @see ThreadRunner
		 */
		public synchronized void run() {
	//		runIt = true;
			Thread mt = DefaultTortoise.currentThread();
			Thread ht = new Thread(new DefaultHare());

while (runIt == true) {		
	while (!mt.isInterrupted()) {
		while (distance <= FINISH) {
			int random = StringUtilities.getRandom();
			System.out.println("   Tortoise " + " Random number is: " + random);
			
			if (random <= 90 ){
				
				tDistance += 10;
				distance = tDistance;			
			
				if (distance > FINISH) {
					
					break; //break out of loop
					
					
				} else {
					
					System.out.println("Tortoise" + ": " + tDistance);
				
					try {
						System.out.println("Tortoise sleeps");
						Thread.sleep(0);				
					
					}
					catch (InterruptedException e) {
						
						System.out.println("ERROR: Tortoise Thread is out ");
						
						break;
						
					}
					
					if (hDistance >= FINISH) {
						mt.interrupt();
						StringUtilities.finished("Hare");
						System.out.println("Tortoise " + ": You beat me fair and square==============");
						runIt = false;
						
						return;
//						}
					}
					else if (tDistance >= FINISH) {
						ht.interrupt();
						StringUtilities.finished("Tortoise");
						System.out.println("Hare "  + ": You beat me fair and square===================");
						runIt = false;
						
						return;
					}
					
				} // end of distance else
				
				
			} // end of outer if
			Thread.yield();
		
		} // end of distance while
		 break;
		} // end of interrupt while
	} // end of runIt while
	return;
} // end of run
		
	/**
	 * Returns the name of the DefaultTortoise runner.
	 * @return The name of the DefaultTortoise runner.
	 */
	public String getRunnerName() {
		return  DefaultTortoise.runnerName;
	}
	
	/**
	 * Returns the speed of the DefaultTortoise runner.
	 * @return The speed of the DefaultTortoise runner.
	 */		
	public int getRunnerSpeed() {
		return DefaultTortoise.runnerSpeed;
	}
	
	/**
	 * Returns the percentage of time the DefaultTortoise rests.
	 * @return The percentage of time the DefaultTortoise rests.
	 */
	public int getRestPercentage() {
		return DefaultTortoise.restPercentage;
	}
}