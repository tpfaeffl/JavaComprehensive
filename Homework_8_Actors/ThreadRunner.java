package Homework_8_Actors;

public class ThreadRunner extends Thread {
	
	
		
		protected String actor;
		protected String movie;
		protected int year;
		
		
		
		@Override
		public void run() {
			
		} // end of run
		
		public ThreadRunner() {
			this("", "", 0);
		}
		
		public ThreadRunner(String actor, String movie, int year)  {	
			this.actor = actor;
			this.movie = movie;
			this.year = year;
			
		} // end of ThreadRunner
		
		
		
	
		
		public void setActor(String actor) {
			this.actor = actor;
		}
		
		public String getActor() {
			return actor;
			
		}
		public void setMovie(String movie) {
			this.movie = movie;
		}
		
		public String getMovie() {
			return movie;
		}
		
		public void setYear(int year) {
			this.year = year;
		}
		
		public int getYear() {
			return year;
		}
	
}
