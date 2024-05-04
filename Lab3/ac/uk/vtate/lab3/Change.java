package ac.uk.vtate.lab3;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Created by Veronica on 03/08/2020
 * Calculate the change due on an item sold
 */
public class Change
{
   public static void main(String[] arg)
   {
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("00.00");

      //Declare variable for the item cost, money tendered and the change due
      double itemCost, tendered, changeDue;

      //Input Enter the cost of the item
      System.out.print("The item cost?: £");
      itemCost = keyboard.nextDouble();

      //Input Enter the money tendered
      System.out.print("The money tendered?: £");
      tendered = keyboard.nextDouble();

      //Calculate the change due
      changeDue = tendered - itemCost;

      //Print out the change due in decimal format
      System.out.println ("\nChange Due \t\t£" + df.format (changeDue));

   }//main
}//class
