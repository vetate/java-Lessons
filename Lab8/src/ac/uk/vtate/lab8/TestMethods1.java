package ac.uk.vtate.lab8;
import java.util.Scanner;

/**
 * Created by Go Media Academy on 19/08/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class TestMethods1
{
   static Scanner keyboard = new Scanner(System.in);

   public static String whoAmI () {
      Scanner keyboard = new Scanner(System.in);
      String name;
      System.out.print("Enter your name: ");
      name = keyboard.nextLine();

      //Below for output of printout
      System.out.println ("Hello " + name);
      return keyboard.nextLine();

   }//whoAmI


   public static void goodGuess () {

      int guess;
      final int number = 100;
      System.out.println("Guess a number between 1 and 100: ");
      guess = keyboard.nextInt();

      //Calculate guess
      if (guess == number)
      {
         //If true print Yes
         System.out.println("You Guessed it!! \t Well Done!");
      } //if
      if (guess != number)
      {
         //If true print No
         System.out.println("Sorry It was the number 100");
      } //if

   }//goodGuess

   public static int sumOfNumbers () {
      Scanner keyboard = new Scanner(System.in);
      int num1, num2, total;
      System.out.print("Enter Number 1 ");
      num1 = keyboard.nextInt();
      System.out.print("Enter Number 2 ");
      num2 = keyboard.nextInt();
      total = num1 + num2;
      System.out.println("Total is: " + total);
      return keyboard.nextInt();
   }//sumOfNumbers

   public static void main(String[] arg)
   {


      System.out.println("Testing whoAmI()");
      sumOfNumbers();

   }//main
}//class
