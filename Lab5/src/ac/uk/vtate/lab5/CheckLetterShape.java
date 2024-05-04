package ac.uk.vtate.lab5;
import java.util.Scanner;
/**
 * Created by Veronica on 11/08/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class CheckLetterShape
{
   public static void main(String[] arg) {

      Scanner keyboard = new Scanner(System.in);

      //Declare letters
      char letter;

      //Prompt user input
      System.out.print("Please enter a character: ");
      letter = keyboard.nextLine().charAt(0);

      //Calculate results
      if ((letter >= 'a') && (letter <= 'z')) {
         System.out.println("\nThe character '" + letter + "' is a lowercase letter");
      }//if
      else {
         System.out.println("\nThe character '" + letter + "' is not a lowercase letter");
      }//else
   }//main
}//class
