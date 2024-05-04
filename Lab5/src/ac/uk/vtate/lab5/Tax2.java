package ac.uk.vtate.lab5;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Created by Go Media Academy on 10/08/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Tax2
{
   public static void main(String[] arg)
   {
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("00.00");
      final int TAXLEVEL = 10000;
      final double TAXRATE = 0.20;
      double grossPay, tax, netPay;

      // Prompt for and read in the gross pay
      System.out.print("Pleas enter your Gross Pay: £");
      grossPay = keyboard.nextDouble();

      // Calculate tax and net pay
      if (grossPay > TAXLEVEL){
      tax = (grossPay - TAXLEVEL) * TAXRATE;
      }//if
      else {
      tax = 0;
      }//else
      netPay = grossPay - tax;

      // Output gross pay, tax and net pay
      System.out.println("Gross Pay:\t\t£" + df.format(grossPay));
      System.out.println("Tax:\t\t\t£" + df.format(tax));
      System.out.println("Net Pay:\t\t£" + df.format(netPay));
   }//main
}//class
