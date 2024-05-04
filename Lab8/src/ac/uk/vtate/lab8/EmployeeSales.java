package ac.uk.vtate.lab8;

import java.util.Scanner;

/**
 * Created by Go Media Academy on 24/08/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class EmployeeSales {
   static Scanner keyboard = new Scanner(System.in);
   // Method to read in and return the name
   public static String enterName() {
      System.out.print("Please enter the employee's name: ");
      return keyboard.nextLine();
   }//enterName

   // Method to read in and return a value
   public static double enterValue(String saletype) {
      System.out.println();
      System.out.print("Please enter the " + saletype + " value: ");
      return keyboard.nextDouble();
   }//enterValue

   // Method to check if a value is in the range 0..100
   public static boolean checkValue(double value) {
      return ((value >= 0) && (value <= 100));
   }//checkValue

   // Method to calculate and return the overall value
   public static double calculateValue(double cashSales, double cardSales)
   {
      return Math.round((cashSales + cardSales) / 2);
   }//calculateValue

   // Method to assign and return the overall level
   public static String assignLevel(double cashSales, double cardSales,
                                    double finalLevel) {
      final int STEADY = 40;
      final int OUTSTANDING = 70;
      if ((cashSales < STEADY) || (cardSales < STEADY)) {
         return "Under Performing";
      }//if
      else {
         if (finalLevel < OUTSTANDING) {
            return "Steady";
         }//if
         else {
            return "Outstanding";
         }//else
      }//else
   }//assignLevel

   // Method to output the results
   public static void outputResults(String pname, double pcashSales,
                                    double pcardSales, double pfinalLevel)
   {
      System.out.println();
      System.out.println("Name \t\t\t\tCash Sales \t\tCard Sales\t\tOverall\t\tSales Level");
            System.out.println(pname + "\t\t\t\t\t" + (int) pcashSales + "\t\t\t\t" + (int) pcardSales + "\t\t\t\t" + (int) pfinalLevel + "\t\t\t" + assignLevel(pcashSales, pcardSales, pfinalLevel));
   }//outputResults

   public static void main(String[] args) {
      String name;
      double cashSales, cardSales, finalLevel;
      boolean cashSalesValueOK, cardSalesValueOK;
      name = enterName();
      cashSales = enterValue("cash sales");
      cashSalesValueOK = checkValue(cashSales);
      if (cashSalesValueOK) {
         cardSales = enterValue("card sales");
         cardSalesValueOK = checkValue(cardSales);
         if (cardSalesValueOK) {
            finalLevel = calculateValue(cashSales, cardSales);
            outputResults(name, cashSales, cardSales, finalLevel);
         }//if
         else {
            System.out.println("Cash Sales value out of range");
         }//else
      }//if
      else {
         System.out.println("Card Sales value out of range");
      }//else

   }//main
}//class