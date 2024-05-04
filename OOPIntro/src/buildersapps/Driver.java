/**
 * 
 */
package buildersapps;

/**
 * @author Ve
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Driver Started");
		
		SimpleCalc simpleCalc = new SimpleCalc();
		simpleCalc.divide(3, 4);
		simpleCalc.subtract(100, 25);
		
		System.out.println("Driver Ended");

	}// main

}//class
