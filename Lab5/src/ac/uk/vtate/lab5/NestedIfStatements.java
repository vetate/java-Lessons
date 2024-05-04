package ac.uk.vtate.lab5;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Created by Go Media Academy on 10/08/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class NestedIfStatements
{
   public static void main(String[] arg) {
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("00.00");
      double mark;
      System.out.println("Your Mark: ");
      mark = keyboard.nextDouble();

      if (mark >= 70) {
         System.out.println(mark + " is a DISTINCTION");
      }//if
      else {
         if (mark >= 40) {
            System.out.println(mark + " is a PASS");
         }//if
         else {
            System.out.println(mark + " is a FAIL");
         }//else
      }//else
   }//main
}//class
