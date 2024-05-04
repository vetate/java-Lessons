package ac.uk.vtate.lab5;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Created by Go Media Academy on 10/08/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class IfStatement
{
   public static void main(String[] arg)
   {

      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("00.00");
      double age;
      
      System.out.println("What is your age? ");
      age = keyboard.nextDouble();
      
      if (age <= 18) {
         System.out.println("You are not an adult");
      }//if
      System.out.println("Age: ");
      

   }//main
}//class
