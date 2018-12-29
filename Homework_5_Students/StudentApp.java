package Homework_5_Students;

/* 
 * Thomas Pfaeffle
 * Java Comprehensive
 * Homework 5
 * 
 */

import java.util.Arrays;
import java.util.Scanner;

public class StudentApp  {
	
	public static Scanner sc;
	
	public static void main(String[] args) {
		
		System.out.print("Welcome to the Student Scores Application");
		
		sc = new Scanner(System.in);
		Student student = new Student();	
	
		int numStudents = student.getNumStudents(sc);
		Student[] array_student = new Student[numStudents];
	
  
		System.out.println();
		for (int i = 0; i < numStudents; i++) {
			
			System.out.print("Student " + (i+1) + "\t" + "last name: " );
			String lastName = student.getLastName(sc);
			System.out.print("Student " + (i+1) + "\t" + "first name: " );
			String firstName = student.getFirstName(sc);
			System.out.print("Student " + (i+1) + "\t" + "score: " );
			int score = student.getScore(sc);
			System.out.println();
		    Student n_student = new Student (lastName, firstName, score);
		    array_student[i] = n_student;
		
		}
		
		
		Arrays.sort(array_student);
		
		for (int i = 0; i< numStudents; i++) {
			System.out.println(array_student[i].lastName+", " + array_student[i].firstName +":" + array_student[i].score);
		}
		
		sc.close();

	}

}
