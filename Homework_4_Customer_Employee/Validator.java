package Homework_4_Customer_Employee;


public class Validator {
	

	public  String s;

	
	public static String getChoiceString(String prompt, String s1, String s2) {
		System.out.println();
		System.out.println();
		System.out.print(prompt);
		String s = "";
		boolean isValid = false;
		while (isValid == false)
			{
			System.out.print("("+s1+"/"+s2+")");
			s = PersonApp.sc.next();
			
			if (s.isEmpty()) {
				System.out.print("Error! This entry is required. Try again.\n" );
			}
			
			else if (s.equals(s1) || s.equals(s2)) {
				isValid=true;
				
			}
			else if (!s.equals(s1) || !s.equals(s2)) {
        	System.out.print("Error! Entry must be " + s1 + " or " + s2 +". Try again.\n" );
        	PersonApp.sc.nextLine();
       // 	System.out.println();
			}	
			
		}
		PersonApp.sc.nextLine();
        return s; 		
	}
	
}
