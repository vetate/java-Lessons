package ac.uk.vtate.lab3;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Created by: Created on:
 * Program to read in the cost of flights and transfers for a number of
 * people for a holiday and calculate the total cost (including VAT)
 */
      public class HolidayCostTest {

      public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("00.00");

      // Set the VAT rate
      final double VATRATE = 0.20;
      int noOfPeople;
      double flightCost, transferCost;
      double flightTotal, transferTotal, total;

      // Enter the number of people travelling
      System.out.print("How many people are travelling? ");
      noOfPeople = keyboard.nextInt();

      // Enter the costs
      System.out.print("\nEnter the cost of each flight : £");
      flightCost = keyboard.nextDouble();
      System.out.print("Enter the cost of each transfer : £");
      transferCost = keyboard.nextDouble();

     // Calculate the totals
      flightTotal = noOfPeople * (flightCost * (1 + VATRATE));
      transferTotal = noOfPeople * (transferCost * (1 + VATRATE));
      total = flightTotal + transferTotal;

      // Output the result of the calculations
      System.out.println("\nTotal Cost for flights:\t\t\t£" +
            df.format(flightTotal));
      System.out.println("Total Cost for transfers:\t\t£" +
            df.format(transferTotal));
      System.out.println("\nTotal Cost \t\t\t\t\t\t£" + df.format(total));
      }//main
}//class