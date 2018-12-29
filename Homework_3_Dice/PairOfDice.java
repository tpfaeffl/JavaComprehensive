package Homework_3_Dice;

public class PairOfDice {
	
	private static int sides;
	public Die die_1;
	public Die die_2;
	public int sum;
	public int i, j;
	
	
	public PairOfDice() {
	this(sides);
	sides= 6;
	
	}

	
 	public PairOfDice(int sides) {
 		die_1 = new Die();
 		die_2 = new Die();
 	
 	
	
	}
	
	public void roll() {
		die_1.roll();
		die_2.roll();

		
	}
	
	// get the value of die_1
	public int getValue1() { 
		int i = die_1.getValue();
		return i;
	}
	
	// get the value of die_2
	public int getValue2() {
		int j = die_2.getValue();
		return j;
		
	}
	
	// get the value of both dice
	public int getSum() {
		sum = (die_1.getValue() + die_2.getValue());
		
		return sum;
	}
	
}
