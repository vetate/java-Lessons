/**
 * 
 */
package arraysExamples;

/**
 * @author Ve
 *
 */
public class FirstArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// declare an array with 4 empty boxes/cells like in excel 
		int [] array;
		array = new int [4];
		
		//Assign a value to the empty boxes which default to 0
		array[0] = 2;
		array[1] = 4;
		array[2] = 6;
		array[3] = 8;
		
		// show access an element/box
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		
		
		System.out.println("Looping...");
		for (int count=0; count<array.length; count++) {
			System.out.println(array[count]);
			
		}

	}//main

}//class
