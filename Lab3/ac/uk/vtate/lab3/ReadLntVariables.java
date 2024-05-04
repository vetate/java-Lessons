package ac.uk.vtate.lab3;

import java.util.Scanner;

/**
 * Created by ve on 03/08/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class ReadLntVariables
{
   public static void main(String[] arg)
   {
      Scanner keyboard = new Scanner(System.in);
    //Declare integer variables
   int length, breadth;

   //Read input
   System.out.println("Please enter a value for length");
   length = keyboard.nextInt ();
   System.out.println("Please enter a value for breadth");
   breadth = keyboard.nextInt ();

   //Output to screen
   System.out.println ("The value entered for length is " + length);
   System.out.println ("The value entered for breadth is " + breadth);

   }//main
}//class
