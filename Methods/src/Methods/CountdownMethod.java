/**
 * 
 */
package Methods;

/**
 * @author Ve
 *
 */
public class CountdownMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		countdown(20, 10);

	}//main
	
	/**
	 * Method to print out more than 2 numbers in a parameter counting down.
	 * numbers int = start of count down | endpoint = end of countdown
	 * @param numbers
	 * @param endpoint
	 */
	public static void countdown(int numbers, int endpoint) {
		
		for ( int count = numbers; count >= endpoint; count--) {
			System.out.println(count);
		}
	}

}//class
