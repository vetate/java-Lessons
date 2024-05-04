package ac.uk.vtate.lab5;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Created by Go Media Academy on 10/08/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Tax3
{
   public static void main(String[] arg) {
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("00.00");

      final int LOWLEVELTAX = 10000, HIGHTAXLEVEL = 40000;
      final double LOWTAXRATE = 0.20, HIGHTAXRATE = 0.40;
      double grossPay, tax = 0, netPay;

      // Prompt for and read in the gross pay
      System.out.print("PleasE enter your Gross Pay: £");
      grossPay = keyboard.nextDouble();

      // Calculate tax and net pay
      if (grossPay > HIGHTAXLEVEL){
         tax = ((grossPay - HIGHTAXLEVEL) * HIGHTAXRATE) +
               ((HIGHTAXLEVEL - LOWLEVELTAX) * LOWTAXRATE);
         }//if
       else {
         if (grossPay > LOWLEVELTAX){
            tax = (grossPay - LOWLEVELTAX) * LOWTAXRATE;
            }//if
          }//else
      netPay = grossPay - tax;

      // Output gross pay, tax and net pay
      System.out.println("\nGross Pay:\t\t£" + df.format(grossPay));
      System.out.println("Tax:\t\t\t£" + df.format(tax));
      System.out.println("Net Pay:\t\t£" + df.format(netPay));
   }//main
}//class
