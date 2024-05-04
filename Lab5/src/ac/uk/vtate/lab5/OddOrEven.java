package ac.uk.vtate.lab5;
import java.util.Scanner;
/**
 * Created by Veronica on 10/08/2020
 * To print out if a number input is Odd or Even
 */
public class OddOrEven
{
   public static void main(String[] arg)
   {

      Scanner keyboard = new Scanner(System.in);

      //Declare user input
      int number;

      //Promp User Input
      System.out.print("Enter a Number to see if it is Odd or Even: ");
      number = keyboard.nextInt();

      //Calculate the Odd or Even
      if (number % 2 == 0)
      {
         //If true print Even
         System.out.println("Your Number is Even");
      } //if
      else
      {
         //If False print Odd
         System.out.println("Your Number is Odd");
      }

   }//main
}//class