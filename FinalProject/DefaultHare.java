package FinalProject;

/**
 * Defines the behavior and data belonging to the DefaultHare object.
 * @author Thomas Pfaeffle
 *
 */
public class DefaultHare extends ThreadRunner implements IRunner {

	// instance variables
	public static int hDistance = 0;
	public static int tDistance = 0;
	public final static int FINISH = 1000;
	public DefaultHare Hare;
	public static int distance =0 ;
	public volatile boolean runIt = true;
	
	
	public DefaultHare() { 
		super("Hare", 100, 90);
	}
	
	/**
	 * Pits two runners, Tortoise and Hare against each other. If a generated random number
	 * is greater than than the Hare's rest percentage (restPercentage=90), the Hare runs at its
	 * speed (runnerSpeed=100). If the Hare reaches 1000, the Hare wins and the Tortoise concedes.
	 * If the random number is less than the rest percentage, the Tortoise runs.
	 * @see DefaultTortoise
	 *   
	 */
	public synchronized void run()  {
		
		Thread ht = DefaultHare.currentThread();
		Thread mt = new Thread(new DefaultTortoise());
	//	runIt = true;
		
while (runIt == true) {		
while (!ht.isInterrupted()) {
	while (distance <= FINISH) {
		int random = StringUtilities.getRandom();
		System.out.println("   Hare" + " Random number is: " + random);
	if (random > 90) {
		
		hDistance += 100;
		distance = hDistance;
		
		
		
		if (distance > FINISH) {
			
			StringUtilities.finished("Hare");
			break; //if you break from here, it is automatic end of thread
		
		
		} else{
			System.out.println("Hare" + ": " + hDistance);
		//	Thread.yield();
			
			try {
				System.out.println("Hare" + " " + "is sleeping");
				Thread.sleep(1000 * (90/100));
			//	Thread.yield();
				
				}
				catch (InterruptedException e) {
					System.out.println("ERROR: Hare Thread out");
					
					break;
				} // end of catch

			if (hDistance >= FINISH) {
				mt.interrupt();
				StringUtilities.finished("Hare");
				System.out.println("Tortoise " + ": You beat me fair and square==============");
				runIt = false;
		
				return;
				
			}
			else if (tDistance >= FINISH) {
				ht.interrupt();
				StringUtilities.finished("Tortoise");
				System.out.println("Hare " + ": You beat me fair and square===================");
				runIt = false;
				
				return;
			} 
			

		} // end of distance else
	
				
	} // end of outer if
	
	Thread.yield();
	
	} // end of distance while
	break;
	} // end of interrupt while
	} // end of runit while 
	   } // end of run
	
	/**
	 * Returns the name of the DefaultHare runner.
	 * @return The name of the DefaultHare runner.
	 */
	public String getRunnerName() {

	return  DefaultHare.runnerName;
	}
	
	/**
	 * Returns the speed of the DefaultHare runner.
	 * @return The speed of the DefaultHare runner.
	 */
	public int getRunnerSpeed() {
		return DefaultHare.runnerSpeed;
	}
	
	/**
	 * Returns the percentage of time the DefaultHare rests.
	 * @return The percentage of time the DefaultHare rests.
	 */
	public int getRestPercentage() {
		return DefaultHare.restPercentage;
	}
}
