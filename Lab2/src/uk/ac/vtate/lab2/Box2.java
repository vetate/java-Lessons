package uk.ac.vtate.lab2;

public class Box2 {
    public static void main(String[] args) {
       int height = 20, width = 25, depth = 30;
       int volume, perimeter;

       //Calculate volume
            volume = height * width * depth;

            //Calculate perimeter
            perimeter = (4 * height) + (4 * width) + (4 * depth);

            //Print out the height, width and depth
        System.out.println("The box is " + height + "cm deep");

    //Print out volume
        System.out.println("The volume of the box is " + volume + " cms cubed");

    //Print out perimeter
        System.out.println("The perimeter of the box is " + perimeter + "cms");

}//main
}//class