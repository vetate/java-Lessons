/**
 * 
 */
package arraysExamples;

/**
 * @author Ve
 *
 */
public class PassingArrayToMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// assigning values in new array
		int[] shoes = {3, 5, 10,7};
		
		updateArray(shoes);
		displayArray(shoes);
		
		//update all show sizes by 1 !! Not great to do as its repetitive!
		//shoes[0] = shoes[0]+1;
		

	}//main
	
	public static void displayArray(int[] shoes) {
		//show values
		for ( int loop=0; loop<shoes.length; loop++) {
			System.out.println(shoes[loop]);
		}//for
	}//displayArray
	
	public static void updateArray(int[] myArrayToUpdate) {
		for (int loop = 0; loop <myArrayToUpdate.length; loop++) {
			myArrayToUpdate[loop] ++;
		}//for
	}//myArrayToUpdate
	
}//class