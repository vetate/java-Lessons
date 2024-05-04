package ac.uk.vtate.lab8;


/**
 * Created by Veronica on 19/08/2020
 * COMMENTS ABOUT PROGRAM HERE
 */

public class DrawX
{

   public static void drawTop () {
      System.out.println("*\t\t\t\t*");
   }//drawTop

   public static void draw2nd () {
      System.out.println("\t*\t\t*\t\t");
   }//draw2nd

   public static void drawMid () {
      System.out.println("\t\t*\t\t");
   }//drawMid

   public static void draw3rd () {
      System.out.println("\t*\t\t*\t\t");
   }//draw3rd

   public static void drawBot () {
      System.out.println("*\t\t\t\t*");
   }//drawBot

   public static void main(String[] arg) {

      drawTop();
      draw2nd();
      drawMid();
      draw3rd();
      drawBot();

   }//main
}//class
