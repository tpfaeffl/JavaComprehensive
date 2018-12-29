package Homework_4_Customer_Employee;

public class Employee extends Person {
	
	public String socialSecurityNumber;

	public Employee() {
		
	}
	
	public String getSocialSecurityNumber() {
		
		return socialSecurityNumber;
	}
	
	public void setSocialSecrityNumber(String s) {
		System.out.print("Enter Social security number: ");
		socialSecurityNumber = PersonApp.sc.next();
		
	}

	@Override
	public String getDisplayText() {
		// TODO Auto-generated method stub
		return super.toString() + "Social security number: " + getSocialSecurityNumber() + "\n";
	}

}
