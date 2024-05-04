package ac.uk.vtate.lab3;
import java.util.Scanner;
/**
 * Created by ve on 03/08/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class ReadCharVariable
{
   public static void main(String[] arg)
   {
      Scanner keyboard = new Scanner (System.in);

      String input;
      char letter;

      //assign input to the variable
      System.out.print ("Are you happy? (Y=yes, N=no) :");
      input = keyboard.nextLine();

      //convert to string to character Y or N
      letter = input.charAt (0);
      System.out.println ("Letter entered was " + letter);



   }//main
}//class
