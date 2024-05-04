/**
 * 
 */
package Methods;

/**
 * @author Ve
 *
 */
public class InvokeMeMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Start of Main");
		invokeMe();
		myName();
		System.out.println("End of Main");
		
	}//main
	
	/**
	 * This is a first method to output a message to screen
	 */
	public static void invokeMe() {
		System.out.println("Ouch, that hurt !"); //Method body
		
	}//invokeMe
	
	/**
	 * Print my name to screen
	 */
	public static void myName() {
		
		System.out.println("My name is Ve");
		invokeMe();
		
	}//myName

}//class
