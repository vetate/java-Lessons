package ac.uk.vtate.lab3;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Created by Go Media Academy on 03/08/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class HolidayCost
{
   public static void main(String[] arg)
   {
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("00.00");

      //Set VAT
      final double VATRATE = 0.20;
      int noOfPeople;
      double flightCost, transferCost;
      double flightTotal, transferTotal, total;


      //People travelling
      System.out.print("How many people are travelling? ");
      noOfPeople = keyboard.nextInt();

      //Costs
      System.out.print("\nEnter the cost of each flight : £");
      flightCost = keyboard.nextDouble();
      System.out.print("Enter the cost of each transfer : £");
      transferCost = keyboard.nextDouble();

      //Totals
      flightTotal = noOfPeople * (flightCost * (1 + VATRATE));
      transferTotal = noOfPeople * (transferCost * (1 + VATRATE));
      total = flightTotal + transferTotal;

      //Output results
      System.out.println ("\nTotal Cost for flights:\t\t\t£" + df.format (flightTotal));
      System.out.println ("\nTotal Cost for transfers:\t\t\t£" + df.format(transferTotal));
      System.out.println ("\nTotal Cost \t\t\t\t\t\t£" + df.format (total));
   }//main
}//class
