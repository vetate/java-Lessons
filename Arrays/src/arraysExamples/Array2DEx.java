/**
 * 
 */
package arraysExamples;

/**
 * @author Ve
 *
 */
public class Array2DEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int [] [] myArray = new int [3] [4];
		
		System.out.println(myArray [0] [0]);
		System.out.println(myArray [0] [3]);
		//the last row and column
		System.out.println(myArray [2] [3]);
		
		// assignment of values
		
		myArray [0] [0] =  9;
		System.out.println(myArray [0] [0]);
		
		// assignment
		for (int row=0; row <myArray.length; row++) {
			for (int col=0; col<myArray[row].length; col++ ) {
				myArray [row] [col] =3;
			}//for2 The Internal 
			
		}//for1
		
		
		// nested for loop 
		for (int row=0; row <myArray.length; row++) {
			for (int col=0; col<myArray[row].length; col++ ) {
				System.out.print(myArray [row] [col] + " ");
			}//for2 The Internal 
			System.out.println("****");
		}//for1

	}//main

}//class
