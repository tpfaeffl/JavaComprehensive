package Homework_3_Dice;




public class Die {
	
	public int value;
	public int sides;
	
	public Die() {
	//	this.value = 0;
		this.sides = 6;
	}
	
	public Die(int sides) {
		this.sides = 6;
		
	}
	
	public void roll() {
		value = (int) ((Math.random() * sides) + 1);
		
	}
	
	
	public int getValue() {
		int w = value;
		return w;
		
	}
	

	
}
