/**
 * 
 */
package exceptional;

/**
 * @author Ve
 *
 */
public class ArraysIssue1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 6 is out of array
		/** Original
		 * int[] myArray = {1,4,3,6};
		 for (int loop = 0; loop <6; loop++) {
			 System.out.println(myArray[loop]);
		 }
		 */
		
		
		// Fixed with Try Catch
		try {
		int[] myArray = {1,4,3,6};
		 for (int loop = 0; loop <5; loop++) {
			 System.out.println(myArray[loop]);
		 }// for
		} catch (Exception exception ) {
			System.out.println("A Problem");
		}// catch
		 

	}// main

}// class
