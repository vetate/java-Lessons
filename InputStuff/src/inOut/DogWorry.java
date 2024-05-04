/**
 * 
 */
package inOut;

/**
 * 
 * @author Ve
 *
 */
import java.util.Scanner;
public class DogWorry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Declare variable
		String isDogAwake;
		
		// Get the Scanner
		Scanner scanner = new Scanner(System.in);
		
		//Prompt the user
		System.out.println("Is the Dog awake? Yes or No?");
		
		//Get user response
		isDogAwake = scanner.nextLine();
		
		//Make a decision IF (String Comparison) Not a ==
		if(isDogAwake.equalsIgnoreCase("yes")) {
			System.out.println("Continue to teach!");
		}
		System.out.println("Bye!");
		
		//Close for Database use as it wont get access to database as resource is open
		scanner.close();
		
		for (int loop=1;loop<=4;loop++) {
			System.out.print(loop + " "); 
		}
		
		byte myB;
		myB = 127;
		System.out.println("My value is "+myB);
		
		int value2;
		value2 = 5/3;
		System.out.println(value2);
		

	}

}
