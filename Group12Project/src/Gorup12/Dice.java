package Gorup12;

import java.util.Random;

public class Dice {

	/**
	 * Method to roll the dice
	 * @return
	 */
	public int rollDice() {
			
			Random rollDice = new Random();
			
			int roll = rollDice.nextInt(6)+1;
			
			if ((roll >=1) && (roll <=6)) {
				return roll;
			} else {
				throw new IllegalArgumentException();
			}
	}//RollDice method
}//Dice End