/**
 * 
 */
package Methods;

/**
 * @author Ve
 *
 */
public class ReturnMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int theNewBigNumber;
		theNewBigNumber = biggestNumber (88, 90);
		System.out.println("The Biggest Number is: " + theNewBigNumber);
		
	}//main
	
	public static int biggestNumber (int number1, int number2) {
		int biggest;
		
		if (number1>number2) {
			biggest = number1;
		} else {
			biggest = number2;
		}
		return biggest;
	}//biggestNumber

}//class
