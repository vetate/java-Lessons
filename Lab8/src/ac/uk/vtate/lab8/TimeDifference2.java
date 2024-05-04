package ac.uk.vtate.lab8;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Go Media Academy on 19/08/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
   public class TimeDifference2 {
      static Scanner keyboard = new Scanner(System.in);
      static DecimalFormat df = new DecimalFormat("00");

      static int startHour, startMinute, startSecond;
      static int finishHour, finishMinute, finishSecond;
      static int hour, minute, second;

      // Method to read in and return an integer
      public static int getTime() {
      return keyboard.nextInt();
      }//getTime

      // Method to read in the data
      public static void readData() {
      // Read in the start time
      System.out.println("What is the start time (24-hour clock):");
      System.out.print("Hour: ");
      startHour = getTime();
      System.out.print("Minutes: ");
      startMinute = getTime();
      System.out.print("Seconds: ");
      startSecond = getTime();

      // Read in the finish time
      System.out.println("What is the finish time (24-hour clock):");
      System.out.print("Hour: ");
      finishHour = getTime();
      System.out.print("Minutes: ");
      finishMinute = getTime();
      System.out.print("Seconds: ");
      finishSecond = getTime();

      }//readData
      // Method to calculate the time difference
      public static void calculateDifference() {
      final int SECMINHOUR = 60;
      final int HOURSINDAY = 24;

      second = finishSecond - startSecond;
      minute = finishMinute - startMinute;
      hour = finishHour - startHour;
      if (second < 0) {
         second = second + SECMINHOUR;
         minute = minute - 1;
         }//if
      if (minute < 0) {
         minute = minute + SECMINHOUR;
         hour = hour - 1;
         }//if
      if (hour < 0) {
         hour = hour + HOURSINDAY;
         }//if
      }//calculateDifference

      // Method to output the results
      public static void outputResults() {
      System.out.println("\nStart Time:\t\t\t" + df.format(startHour) + ":" + df.format(startMinute) + ":" + df.format(startSecond));
      System.out.println("Finish Time:\t\t" + df.format(finishHour) + ":" + df.format(finishMinute) + ":" + df.format(finishSecond));
      System.out.println("Time Difference:\t" + df.format(hour) + ":" + df.format(minute) + ":" + df.format(second));
      }//outputResults

      public static void main(String[] args) {
      readData();
      calculateDifference();
      outputResults();

      }//main
}//class