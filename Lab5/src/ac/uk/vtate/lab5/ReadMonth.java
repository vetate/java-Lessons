package ac.uk.vtate.lab5;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Created by Go Media Academy on 10/08/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class ReadMonth
{
   public static void main(String[] arg) {
      Scanner keyboard = new Scanner(System.in);
      int month, noOfDays = 0;
      //String jan = 1, feb = 2, march = 3; ????
      System.out.print("Enter the month (1 – 12) : ");
      month = keyboard.nextInt();
      switch (month) {
         case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            noOfDays = 31;
            break;
         case 2:
            noOfDays = 28;
            break;
         case 4: case 6: case 9: case 11:
            noOfDays = 30;
            break;
         default:
            System.out.println("Invalid month");
      }//switch
      System.out.println("There are " + noOfDays + " days in month " + month);
   }//main
}//class
