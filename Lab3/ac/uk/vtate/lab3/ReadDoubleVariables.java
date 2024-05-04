package ac.uk.vtate.lab3;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Created by ve on 03/08/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class ReadDoubleVariables
{
   public static void main(String[] arg)
   {
      Scanner keyboard = new Scanner (System.in);
      DecimalFormat df = new DecimalFormat("00.00");

      double price1, price2;

      System.out.print ("Please enter a value for price 1: ");
      price1 = keyboard.nextDouble ();

      System.out.print ("Please enter a value for price 2: ");
      price2 = keyboard.nextDouble();

      //Output values
      System.out.println ("The value entered for price 1 is " + df.format (price1));
      System.out.println ("The value entered for price 2 is " + df.format (price2));
   }//main
}//class
