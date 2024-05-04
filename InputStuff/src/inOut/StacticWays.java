/**
 * 
 */
package inOut;
import java.util.Scanner;
/**
 * @author Ve
 *
 */
public class StacticWays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Static Field 
		System.out.println(Math.PI);
		
		//Static Method call
		System.out.println(Math.pow(2,3));
		
		
		//Exercise to prompt user for length of a square as a double
		
		Scanner scanner = new Scanner(System.in);
		
		//Declare and assign variable to store the keyboard input
		double side = 0;
		
		//Prompt user
		System.out.println("Enter the side of the square (in cms) ?");
		
		//Store value added as a double from the scanner keyboard
		side = scanner.nextDouble();
		
		//Calculate using Printf (The %s is a string. %.2f = for the decimal place)
		System.out.printf("Perimeter : %.2f %s",side*4 ," cm \n");
		System.out.printf("Area :      %.2f %s",Math.pow(side, 2) ," cm2");
		scanner.close();


	}

}
