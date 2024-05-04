package ac.uk.vtate.lab8;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Created by Veronica on 25/08/2020
 * Program to test methods with parameters
 */
public class TestMethods2 {
   static Scanner keyboard = new Scanner(System.in);
   static DecimalFormat df = new DecimalFormat("00.00");

   // Method to read in and return an integer
   public static int readInteger(String text) {
      System.out.print("Enter " + text);
      return keyboard.nextInt();
   }//readInteger

   // Method which accepts an integer and return 3 times the integer
   //Return didn't need brackets and any named int could have been declared
   //not necessarily number1
   public static int multiplyBy3( int num1) {
      return num1 * 3;
   }//multiplyBy3


   // Method to accept a number and return the number plus 1
   public static int addOne(int number1){
      return (number1 +1);
   }//addOne

   // Method to accept 3 numbers and return their product
   public static int product(int number1, int number2, int number3) {
      return (number1 + number2 + number3 *3);
   }//product
   // Method to accept 3 integers (yards, feet, inches) and return

   public static double convertToMetres(int number1, int number2, int number3) {
      return ((number3 + (number1 *36) + (number2 * 12)) / 39.37);
   }//convertToMetres

   // Method to accept an integer and return the equivalent word
   //PLEASE NOTE: I have tried the switch and was going to do the If Else, but have run out of time.
   //I will continue to solve this one.

//   public static int convertToWords(int number1) {
//      return (number1);
//   }//convertToWords


   public static void main(String[] args) {
      int number1, number2, number3, answer;
      double metres;
      String numberInWords;


      System.out.println("Testing multiplyBy3()");
      System.out.println("*********************");
      number1 = readInteger("a number: ");
      answer = multiplyBy3(number1);
      System.out.println(number1 + " multiplied by 3 = " + answer + "\n");


      System.out.println("Testing addOne()");
      System.out.println("*************");
      number1 = readInteger("a number: ");
      answer = addOne(number1);
      System.out.println(number1 + " + 1 = " + answer + "\n");


      System.out.println("Testing product()");
      System.out.println("*****************");
      number1 = readInteger("first number: ");
      number2 = readInteger("second number: ");
      number3 = readInteger("third number: ");
      answer = product(number1, number2, number3);
      System.out.println(number1 + " * " + number2 + " * " + number3 + " = " + answer + "\n");


      System.out.println("Testing convertToMetres()");
      System.out.println("*************************");
      number1 = readInteger("yards: ");
      number2 = readInteger("feet: ");
      number3 = readInteger("inches: ");
      metres = convertToMetres(number1, number2, number3);
      System.out.println(number1 + " yards, " + number2 + " feet, " + number3 + " inches = " + df.format(metres) + " metres\n");


//      System.out.println("Testing convertToWords()");
//     System.out.println("************************");
//     number1 = readInteger("a number: ");
//     numberInWords = convertToWords(number1);
//     System.out.println(number1 + " = " + numberInWords + "\n");
   }//main
}//class