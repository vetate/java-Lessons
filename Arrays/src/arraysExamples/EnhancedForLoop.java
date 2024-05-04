/**
 * 
 */
package arraysExamples;

/**
 * @author Ve
 *
 */
public class EnhancedForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] numbers = {2,3,5,7,8,9,8};
		String[] names = {"Ve", "Simon", "Amy", "Oran", "Cara", "Ciaran", "Stephen"};
		
		for (int loop=0; loop<numbers.length; loop++) {
			System.out.println(numbers[loop] + " ");
		}//for
		
		System.out.println("\n FOR Enhanced...");
		
		// Enhanced For Loop.. The : = (INSIDE)
		
		for (int number : numbers) {
			System.out.println(number);
		}// 2nd for
		
		for (String name : names) {
			System.out.println(name);
		}

	}//main

}//class
