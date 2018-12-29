package Homework_4_Customer_Employee;


public class Customer extends Person {
	

	public String customerNumber;

	public Customer() {
	
	}
	
	public String getCustomerNumber() {
		
		return customerNumber;
	}
	
	public void setCustomerNumber(String s) {
		System.out.print("Enter customer number: ");
		customerNumber = PersonApp.sc.next(); 
		
	}

	@Override
	public String getDisplayText() {
		
		return super.toString() + "Customer number: " + getCustomerNumber() + "\n";
	}

}
