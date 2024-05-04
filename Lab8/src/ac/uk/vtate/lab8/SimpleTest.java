package ac.uk.vtate.lab8;

import java.util.Scanner;

/**
 * Created by Go Media Academy on 18/08/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class SimpleTest {
   static Scanner keyboard = new Scanner (System.in);
   public static int getDimension(String side) {
      int dimension;
      System.out.print("Enter the " + side + ": ");
      dimension= keyboard.nextInt();
      return dimension;
   }//getDimension

   public static void main(String[] args) {
      int length, breadth, height, volume;
      length = getDimension ("length");
      breadth = getDimension ("breadth");
      height = getDimension ("height");
      volume = length * breadth * height;
      System.out.println("The volume of the box is " + volume);

   }//main
}//class