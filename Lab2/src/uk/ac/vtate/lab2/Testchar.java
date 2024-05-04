package uk.ac.vtate.lab2;

import java.util.Scanner;
/**
 * Created by Go Media Academy on 05/08/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Testchar
{
   public static void main(String[] arg) {
      Scanner keyboard = new Scanner(System.in);
      char letter1;
      //int number1;

      //Prompt input for int number
      //System.out.print (" int number ");
      //Read int input
      //number1 = keyboard.nextInt();
      //Print int number
      //System.out.println ("the number is " + number1);

      // Prompt input for char letter
      System.out.println("Letter is ");

      //Read char input
      letter1 = keyboard.next ().charAt (0);

      //print out char letter
      System.out.print ("the letter is " + letter1);
   }//main
}//class
