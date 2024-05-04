/**
 * 
 */
package arraysExamples;

/**
 * @author Ve
 *
 */
public class ArraySummingEle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] myArray = new int[10];
		
		// assigning values, starting with 2 multiplied by 2
		for (int loop=0; loop<myArray.length; loop++) {
			myArray[loop] = 2 + 2*loop;
		}//for
		
		//show
		for (int loop=0; loop<myArray.length; loop++) {
			System.out.println(myArray[loop]);
		}//2nd for
		
		int total=0;
		//sum it up
		for (int loop =0; loop<myArray.length; loop++) {
			total += myArray[loop];
		}//3rd for
		
		//total
		System.out.println(total);
		
		//average
		System.out.println(total/myArray.length);
		

	}

}
