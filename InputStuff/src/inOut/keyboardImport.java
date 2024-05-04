/**
 * 
 */
package inOut;

//Import here!
import java.util.Scanner;
/**
 * 
 * @author Ve
 *
 */
public class keyboardImport {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 01. create the scanner for use
		Scanner scanner = new Scanner(System.in);
		
		//02. Variable of a string for the name
		String name, city;
		
		//03. User prompt for name
		System.out.println("What's your name? ");
		//Assign input to the variable name
		name = scanner.nextLine();
		
		//04. Print out
		System.out.println("Hello there " + name);
		
		
		System.out.println("Where do you live?");
		city = scanner.nextLine();
		
		System.out.println("Nice place! " + city + ". Well it's always raining!");
		
		scanner.close()
;	}//main

}//class
