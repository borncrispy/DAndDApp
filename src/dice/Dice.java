package dice;

public class Dice {
	int dieSides = 0;
	int rollResults = 0;
	public Dice(){
		
	}
	public Dice(int sides){
		toss(sides);
	}
	public void setRoll(int sides){
		toss(sides);
	}
	
	public int getRoll(){
		return rollResults;
	}
	void toss(int sides){
		rollResults = 1 + (int)(sides * Math.random());
	}
}
