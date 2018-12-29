package Homework_5_Students;

/* 
 * Thomas Pfaeffle
 * Java Comprehensive
 * Homework 5
 * 
 */

import java.util.Scanner;

public interface IStudent  {
//	int studentCount = 0;
	
	public String getFirstName(Scanner sc);
	public void setFirstName(String first); 
	
	public String getLastName(Scanner sc);
	public void setLastName(String last);
	
	public int getScore(Scanner sc);
	public void setScore(int score);
	
	public int getNumStudents(Scanner sc);

	

}
