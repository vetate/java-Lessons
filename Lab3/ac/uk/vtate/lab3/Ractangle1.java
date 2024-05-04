package ac.uk.vtate.lab3;

/**
 * Created by Ve on 03/08/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Ractangle1
{
   public static void main(String[] arg)
   {
      double length, breadth, area, perimeter;
      length = 24.7;
      System.out.println ("Rectangle length = " + length);

      breadth = 25.9;
      System.out.println ("Rectangle breadth = " + breadth);

      area = length * breadth;
      System.out.println ("Rectangle Area = " + area);

      perimeter = (length + breadth) * 2.0;
      System.out.println ("Rectangle Perimeter = " + perimeter);
   }//main
}//class
