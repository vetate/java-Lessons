/**
 * 
 */
package arraysExamples;
import java.util.Arrays;
/**
 * @author Ve
 *
 */
public class ArrayDoubles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double [] temperatures = { 32.54, 61.95, 52.28, 41.27, 12.08 };
		
		System.out.println("The Temperature is");
		 for (int loop = 0; loop < temperatures.length; loop++) {
			 System.out.println(temperatures[loop]);
		 }//for
		 
		System.out.println(Arrays.toString(temperatures));
		Arrays.sort(temperatures);
		System.out.println(Arrays.toString(temperatures));

	}//main

}//class
