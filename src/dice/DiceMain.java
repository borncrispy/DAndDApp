package dice;

import java.util.Scanner;

public class DiceMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		//while(true){
			Scanner input = new Scanner(System.in);
			System.out.println("How many die do you need?: ");
			int aDice = input.nextInt();
			System.out.println("How many sides are on your die?: ");
			int bSides = input.nextInt();
		
			Dice aDie = new Dice();
			HoldRolls roll = new HoldRolls();
			if(aDice > 1){
				roll.setRolls(aDice, bSides);
				int[] results = roll.getRolls();
				for(int j = 0; j < results.length; j++){
					System.out.println("(" + (j + 1) + ") Roll is " + results[j]);
				}
			}
			else{
				aDie.setRoll(bSides);
				System.out.println("You rolled a " + aDie.getRoll());
			}
			//Scanner an = new Scanner(System.in);
			//System.out.println("Do you need to roll again?(Yes or No): ");
			//1
		//String ans = an.nextLine();
			//if(ans == "No")
				//break;
		//}
	}

}
