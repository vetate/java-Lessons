package ac.uk.vtate.lab8;

import java.util.Scanner;

/**
 * Created by Go Media Academy on 22/08/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class BiggestNumberMethod
{
   public static void main(String[] arg)
   {
      Scanner keyboard = new Scanner(System.in);

      int num = biggestNumber(22,66);
      System.out.println(num);
      System.out.println(biggestNumber(22,88));

   }//main

   public static int biggestNumber (int num1, int num2) {
      {
         int biggestNumber;

         if (num1 > num2){
            biggestNumber = num1;
         }
         else {
            biggestNumber = num2;
         }
         return biggestNumber;
      }

   }
}//class
