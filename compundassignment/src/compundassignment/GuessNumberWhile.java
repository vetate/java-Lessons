/**
 * 
 */
package compundassignment;
import java.util.Scanner;
import java.util.Random;
/**
 * @author Ve
 *
 */
public class GuessNumberWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int randomNumber, userGuess;

		// default value
		userGuess = -1;

		// get the random number
		randomNumber = random.nextInt(10);
		randomNumber++; // how come this ? cause it counts from 0 and we want to count from 1

		while (randomNumber != userGuess) {

		 // get user input
			System.out.println("Enter your guess (1-10) ?");
			userGuess = scanner.nextInt();
		 }

		 System.out.println("Well done.. you got it !");
		 scanner.close();

	}//main

}//class
