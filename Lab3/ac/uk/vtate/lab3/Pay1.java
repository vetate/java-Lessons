package ac.uk.vtate.lab3;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Created by Veronica on 03/08/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Pay1
{
   public static void main(String[] arg)
   {
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("00.00");

      //Declare variable for first name, initial, surname
      // hours worked, hourly rate and total pay calculated
      String firstName, surname;
      double workedHours, totalPay, payRate;
      char middleInitial;

      //Hourly pay rate
      payRate = 5.95;

      //Input first name
      System.out.print("Enter your First Name: ");
      firstName = keyboard.nextLine();

      //Input Middle Initial of name
      System.out.print("Middle Initial: ");
      middleInitial = keyboard.nextLine().charAt(0);

      //Input surname
      System.out.print("Enter your Surname: ");
      surname = keyboard.nextLine();

      // Input for the hours worked in a week
      System.out.print("Enter the hours Worked this week: ");
      workedHours = keyboard.nextDouble();

      //Calculate the total pay, hours worked * Hourly rate
      totalPay = workedHours * payRate;

      //Print out complete name and total pay for the week to 2 decimal places
      System.out.print ("Hello " +  firstName + " " + middleInitial +" " + surname );
      System.out.println ("\nYour total pay for the hours worked this week will be \t£" + df.format (totalPay));


   }//main
}//class
