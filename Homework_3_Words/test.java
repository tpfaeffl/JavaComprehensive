package Homework_3_Words;

public class test {

	public static void main(String[] args) {

//		String s_digit;
//		String t_digit;
//		String t_string;
		int hj = 5678;
		String OnesArray[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", 
				"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
//		String TensArray[] = {" ", " ", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		
		
//		public String getThousands(int hj) {
			if (hj > 1000) {
			int x = (int)(hj/1000);
			String t_string = OnesArray[x];
			}
	//		System.out.println(t_string);
		//	return t_string;

	}

}
