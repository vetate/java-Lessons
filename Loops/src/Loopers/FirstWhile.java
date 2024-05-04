/**
 * 
 */
package Loopers;

/**
 * @author Ve
 *
 */
public class FirstWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int counter; // control Var
		counter = 1; // Initial Value
		
		while (counter <11) { //Loop Termination condition. Is counter less than 11
			//Loop Body - In here is condition is TRUE.
			System.out.println("Value of Counter " +counter);
			counter = counter+1; //Increment it
			
		}//While End
		
		System.out.println("Done!");
			
	}//main

}//class
