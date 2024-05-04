package statements;

import java.util.Random;

public class coins {

	public static void main(String[] args) {
		coinToss("Heads");

	}
	/**
	 * Simulates a coin toss. Then checks if the user's call i.e. head or tails
	 * is correct
	 * 
	 * @param call
	 *            ie heads or tails (case insensitive)
	 */
	public static void coinToss(String call) {

		int result = 0;
		// var used to convert from users call eg "Heads" to a number value eg 1
		int callConvert = 0;

		// map the call to a numeric value. 1 = heads and 2 = tails
		if (call.equalsIgnoreCase("Heads")) {
			callConvert = 1;
		} else {
			callConvert = 2;
		}
		// "toss the coin". Generate either a 1 or a 2
		Random rand = new Random();
		result = rand.nextInt(2) + 1;

		// show the result of the coin toss
		if (result == 1) {
			System.out.print("Heads");
		} else {
			System.out.print("Tails");
		}

		// check if user called it correctly
		if (callConvert == result) {
			System.out.print(" you win");
		} else {
			System.out.print(" you lose");
		}
	}

}
