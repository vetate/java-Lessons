package uk.ac.vtate.lab2;
import java.text.*;

/**
 * Created by Go Media Academy on 05/08/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Circle {
      public static void main(String[] args) {
         DecimalFormat df = new DecimalFormat("0.00");
// Declare and initialise the radius
         double radius = 4.5;
// Declare variables
         double diameter, circumference, area;
// Calculate diameter
         diameter = 2 * radius;
// Calculate circumference
         circumference = 2 * Math.PI * radius;
// Calculate area
         area = Math.PI * Math.pow(radius, 2);
// Output results
         System.out.println("The radius is " + df.format(radius) + " units");
         System.out.println("The diameter is " + df.format(diameter) + " units");
         System.out.println("The circumference is " + df.format(circumference) + " units");
         System.out.println("The area is " + df.format(area) + " units squared");
      }//main
}//class
