package uk.ac.vtate.lab2;

public class Rectangle1 {
    public static void main(String[] args) {
        // Declare 4 variables to hold length,
        // breadth, perimeter and area
        double length, breadth, area, perimeter;
        // Assign values to length and breadth
        length = 34.55;
        System.out.println("Rectangle length = " + length);
        breadth =23.67;
        System.out.println("Rectangle breadth = " + breadth);
        // Calculate, store and print out the area
        area = length * breadth;
        System.out.println("Rectangle Area = " + area);
        // Calculate, store and print out the perimeter
        perimeter = (length + breadth) * 2.0;
        System.out.println("Rectangle Perimeter = " + perimeter);
    }//main
}//class