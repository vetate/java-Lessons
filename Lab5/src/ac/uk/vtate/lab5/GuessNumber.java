package ac.uk.vtate.lab5;
import java.util.Scanner;
/**
 * Created by Veronica on 10/08/2020
 * Program to guess a number between 1 and 5
 */
public class GuessNumber
{
   public static void main(String[] arg) {

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

   }//main
}//class
