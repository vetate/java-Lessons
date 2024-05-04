/**
 * 
 */
package arraysExamples;

/**
 * @author Ve
 *
 */
public class ArraysRevise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		int [] family; // declare array
		family = new int [5]; // assign the 5 elements
		*/
		// assign values of family
		
		/*
		family[0] = 23;
		family[1] = 25;
		family[2] = 28;
		family[3] = 46;
		family[4] = 49;
		*/
		// Array Initialiser = same as above commented out!
		int[] family = { 23, 25, 28, 46, 49 };
		
		System.out.println("Cara " +family[0]);
		System.out.println("Oran " +family[1]);
		
		//arrays start from 0 so loop =0, length to say size of array
		for (int loop=0; loop<family.length; loop++) {
			System.out.println(family[loop]); // [loop] is the value
		}//for
		
		System.out.println("End!");
		

	}//main

}//class
