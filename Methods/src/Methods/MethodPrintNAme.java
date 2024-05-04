/**
 * 
 */
package Methods;

/**
 * @author Ve
 *
 */
public class MethodPrintNAme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		printNameToScreen(4, "Ve");
		//MethodPrintNAme.printNameToScreen();

	}//main
	
	/**
	 * 
	 * @param numberOfTimes - 1 - 1000 allowed
	 * @param name
	 */
	
	public static void printNameToScreen(int numberOfTimes, String name) {
		
		for (int loop=0; loop <= numberOfTimes; loop++) {
			System.out.println(name);
		}//for
			
	}//printNameToScreen

}//class
