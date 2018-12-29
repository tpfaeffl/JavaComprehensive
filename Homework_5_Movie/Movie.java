package Homework_5_Movie;

/* 
 * Thomas Pfaeffle
 * Java Comprehensive
 * Homework 5
 * 
 */

import java.util.ArrayList;


public class Movie {
	
	public String title;

	public String m_category;
    
	
	public Movie (String title, String m_category) {
		this.title = title;
		this.m_category = m_category;
		
	}
	
	public static void setCategory(String m_category) {
		
	}
	
	public ArrayList<Movie> getMovies(String m_category) {
		
		// create arrays for all movies and movies for a specified category
		ArrayList<Movie> movieArray = new ArrayList<Movie>();
		ArrayList<Movie> categoryArray = new ArrayList<Movie>();
		
		//instantiate Movie  object
		Movie m = new Movie(title, m_category);
		
		for (int i = 0; i < 100; i++) {
			
			// get Movie from MovieIO into Movie object
			m = MovieIO.getMovie(i+1);
			
			// put all movie objects into the arrayList
			movieArray.add(m);	
			
		} // end of for loop
		
		// put movies of specified category into an arrayList
		for (Movie s : movieArray) {
			if (m_category.equals(s.m_category)) {
			categoryArray.add(s);
			}
		}
		
		return categoryArray;
	

	}
}
