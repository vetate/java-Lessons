/**
 * 
 */
package compundassignment;
import java.util.Scanner;
/**
 * @author Ve
 *
 */
public class GuessNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


	      Scanner keyboard = new Scanner(System.in);

	      //Declare the user input and the constant number of 3
	      int guess;
	      final int number = 3;

	      //User Input
	      System.out.print("Guess a number between 1 and 5: ");
	      guess = keyboard.nextInt();

	      //Calculate guess
	      if (guess == number)
	      {
	         //If true print Yes
	         System.out.println("You Guessed it!! \t Well Done!");
	      } //if
	      else
	      {
	         //If False print Try again
	         System.out.println("Sorry try again.");
	      }

	}

}
