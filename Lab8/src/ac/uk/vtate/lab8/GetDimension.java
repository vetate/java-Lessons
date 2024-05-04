package ac.uk.vtate.lab8;

import java.util.Scanner;

/**
 * Created by Go Media Academy on 24/08/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class GetDimension
{
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int number1, number2;

      System.out.print("Please enter a number: ");
      number1 = keyboard.nextInt();
      System.out.print("Please enter a number: ");
      number2 = keyboard.nextInt();
      if (number1 > number2) {
         System.out.println(number1 + " is the larger number");
         }//if
      else {
         System.out.println(number2 + " is the larger number");
         }//else
      }//main

   public static int getDimension(String side) {
      int dimension;
      System.out.print("Enter the " + side + ": ");
      Scanner keyboard = new Scanner(System.in);
      dimension= keyboard.nextInt();
      return dimension;
   }//getDimension

}//class
