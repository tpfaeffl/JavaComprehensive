package Homework_5_Students;
/* 
 * Thomas Pfaeffle
 * Java Comprehensive
 * Homework 5
 * 
 */

import java.util.Scanner;

public class Student implements IStudent, Comparable<Object> {
	int num = 0;
	public Scanner sc;
	public  String lastName;
	public String firstName;
	public int score;
	public static Student st;

	public Student() {
		
		
		
	}
	
	public Student(String lastName, String firstName, int score) {
	
		this.lastName = lastName;
		this.firstName = firstName;
		this.score = score;
	}

	

	@Override
	public String getFirstName(Scanner sc) {
		firstName = Validate.getRequiredString("", sc);
		return firstName;
	}

	@Override
	public void setFirstName(String first) {
		
		
	}

	@Override
	public String getLastName(Scanner sc) {
		lastName = Validate.getRequiredString("", sc);
		return lastName;
		
	}

	@Override
	public void setLastName(String last) {
		
		
	}
	

	@Override
	public int getScore(Scanner sc) {
		score = Validate.getIntWithinRange("", 0, 100, sc);
		return score;
	}


	
	
	@Override
	public int compareTo(Object o) {
		if (o instanceof Student) {
			Student st = (Student) o;
			
		
			
			if (getLastName().compareTo(st.lastName) !=0) {
				return (getLastName().compareTo(st.lastName));
			}
				
//			}
			else
				return (getFirstName().compareTo(st.firstName));
		}
		return 6; //  not a student object		

	}

	
	
/*
* THIS COMAPRE TO WORKS
*	@Override
*	public int compareTo(Object o) {
*		if (o instanceof Student) {
*			Student st = (Student) o;
*			
*			return getLastName().compareTo(st.lastName);
*	}
*		return 0;
*	}
*	
*/

	private String getLastName() {
		
	
		
		return lastName;
	}
	
	private String getFirstName() {
		
		return firstName;
	}
	@Override
	public void setScore(int score) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getNumStudents(Scanner sc) {
		num = Validate.getIntWithinRange("Enter the number of students to process  ", 0,  100, sc);
		return num;
		
	}

}
