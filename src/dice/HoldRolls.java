package dice;

public class HoldRolls {
	int[] rolls;
	Dice bDie;

	public HoldRolls(){
		bDie = new Dice();
	}
	
	public void setRolls(int numDie, int sides){
		rolls = new int[numDie];
		for(int i = 0; i < numDie; i++){
			bDie.setRoll(sides);
			rolls[i] = bDie.getRoll();
		}
	}
	public int[] getRolls(){
		return rolls;
	}
}
