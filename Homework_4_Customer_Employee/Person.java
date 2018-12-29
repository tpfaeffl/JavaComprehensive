package Homework_4_Customer_Employee;

// import java.util.Scanner;

public abstract class Person {
//	public static Scanner sc;
	public String firstName;
	public String lastName;
	public String email;
//	private String s;
	
	public Person() {
		
	}

	public String getFirstName() {
				
		return firstName;
	}
	
	public void setFirstName(String s) {
	//	this.firstName = firstName;
		System.out.print("Enter first name: " );
		
		firstName= PersonApp.sc.next();
	}
	
	public String getLastName() {
		
		return lastName;
		
	}
	public void setLastName(String s) {
		
		System.out.print("Enter last name:  ");
		lastName  = PersonApp.sc.next();
		
	}
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String s) {
		System.out.print("Enter email address:  ");
		email = PersonApp.sc.next();
		
	}
	
	
	public abstract String getDisplayText();
		

	
	@Override
	public String toString(){
	return "\n" + "You entered: " + "\n" + 
	"Name: " + getFirstName() + " " + getLastName() + "\n" +
		"Email: " + getEmail() + "\n"; 
	}
	
}
