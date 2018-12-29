package Homework_3_PigLatin;

import java.util.Scanner;

public class Convert_PL {
	
	public String VowelArray[] = {"a", "e", "i", "o", "u"};
	public static String phrase = " ";
	public static int m;
	
	
	public Convert_PL(){
		this(phrase);
		
	}
	public Convert_PL(String phrase) {
	}
	
	
	public String getString(Scanner sc, String prompt) {
	String phrase = " ";
//	int i=0;
	boolean isValid = false;
	while (isValid == false)
	{
		System.out.print(prompt);
		if (sc.hasNextLine()) {
			phrase = sc.nextLine();	
			isValid = true;
		}
		else 
			System.out.println("No More input");
	}
	return phrase.trim();
}
	
	public String[] parseString(String myString) {
		String stringParts[] = myString.split(" ");
		return stringParts;
	}
	
	public String[] convertWords(String[] parsed_string) {
	
		String[] converted_words = new String[parsed_string.length];
		String temp = " ";

		for (int i = 0; i <=parsed_string.length -1; i++) {
		//	String const_string = new String();
			temp = parsed_string[i];
			String tester = temp.toLowerCase();
			if (tester.charAt(0) == 'a' || tester.charAt(0) == 'e' || tester.charAt(0) == 'i' || tester.charAt(0) == 'o' || tester.charAt(0) == 'u') {
				converted_words[i] =  temp + "way"; // removed converted_words[i]
			//	System.out.println("reached line 50");
			} // end of if loop
			else {
						for (int k = 1; k<= temp.length() -1; k++) {
							if (tester.charAt(k) != 'a' || tester.charAt(k) != 'e' || tester.charAt(k) != 'i' || tester.charAt(k) != 'o' || tester.charAt(k) != 'u') {
								m = k;
								tester = tester.substring(m) + tester.substring(0, m) + "ay";
								System.out.println("reached line 62");
								converted_words[i] = tester;
							//	break;
							} // end of if loop
							    
			//					tester = tester.substring(m) + tester.substring(0, m) + "ay";
			//					System.out.println("reached line 62");
			//					converted_words[i] = tester;					
							}	// end of for loop
						
					}	 // end of else loop
							
		} //  end of for loop

		return converted_words;
	} // end of method

}

//---------------------
//this else works for one consonant

//	else {
//				converted_words[i] = temp.substring(1) + temp.charAt(0) + "ay"; 
//			} // end of else loop

//-------------------------------
			
			
			
	
				

