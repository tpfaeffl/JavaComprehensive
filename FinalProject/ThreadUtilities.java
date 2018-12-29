package FinalProject;

import java.util.ArrayList;

/**
 * Provides utility methods associated with Threads.
 * 
 */
public class ThreadUtilities extends ThreadRunner {

	public final static int FINISH = 1000;
	public Dog d;
	
	public static void startThreads(ArrayList<ThreadRunner> myReturnedList) {

			for (int i = 0; i < myReturnedList.size(); i++) {
				ThreadRunner t = myReturnedList.get(i);
				t.start();
				System.out.println(t.getName() + "  is started");

			}
		}
	
		/**
		 * Interrupts the Threads associated with this program.
		 * @param myReturnedList An ArrayList of ThreadRunners associated with this program.
		 */
		public static void interruptThreads(ArrayList<ThreadRunner> myReturnedList) {

			for (int i = 0; i < myReturnedList.size(); i++) {
				ThreadRunner t = myReturnedList.get(i);
				System.out.println(t.getName() + "  is interrupted");
//				if (t.getRunnerName().equals("Dog")) {
//					String z = t.getRunnerName();
//					t.setName(z);
//					t.interrupt();
//					System.out.println(t.getName() + "  is interrupted");
//
//				}
//				if (t.getRunnerName().equals("Cat")) {
//					String z = t.getRunnerName();
//					t.setName(z);
//					t.interrupt();
//					System.out.println(t.getName() + "  is interrupted");
//
//				}
//				if (t.getRunnerName().equals("Hare")) {
//					String z = t.getRunnerName();
//					t.setName(z);
//					t.interrupt();
//					System.out.println(t.getName() + "  is interrupted");
//
//				}s
//				if (t.getRunnerName().equals("Tortoise")) {
//					String z = t.getRunnerName();
//					t.setName(z);
//					t.interrupt();
//					System.out.println(t.getName() + "  is interrupted");
//
//				}
				
			}
		}
		/**
		 * Starts the DefaultTortoise and DefaultHare threads.
		 * @param Tortoise The DefaultTortoise object.
		 * @param Hare The DefaultHare object.
		 */
		public static void startDefaultThreads(DefaultTortoise Tortoise, DefaultHare Hare ) {
			Tortoise.start();
			Hare.start();
		}
		 
		/**
		 * Interrupts the DefaultTortoise and DefaultHare threads. Unfortunately, it doesn't work and is
		 * never used.
		 * @param mt The DefaultTortoise thread.
		 * @param tDistance Distance the Tortoise traveled.
		 * @param ht The DefaultHare thread.
		 * @param hDistance Distance the Hare traveled.
		 */
		public static void interrruptDefaultThreads(Thread mt, int tDistance, Thread ht, int hDistance ) {
			if (hDistance >= FINISH) {
				mt.interrupt();
				mt.notify();
				ht.interrupt();
				ht.notify();
				StringUtilities.finished("Hare");
				System.out.println("Tortoise " + ": You beat me fair and square==============");
			}
			else if (tDistance >= FINISH) {
				ht.interrupt();
				ht.notifyAll();
				mt.interrupt();
				mt.notify();
				StringUtilities.finished("Tortoise");
				System.out.println("Hare " + ": You beat me fair and square===================");
			} 
		}



}
