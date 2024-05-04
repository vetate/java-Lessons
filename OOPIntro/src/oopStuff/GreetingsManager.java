/**
 * 
 */
package oopStuff;

/**
 * @author Ve
 *
 */
public class GreetingsManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Staring Application");
		
		// create the messageCentre object! lowercase messageCentre name is a reference to the method
		MessageCentre messageCentre = new MessageCentre();
		messageCentre.displayWelcomeMessage();
		
		System.out.println("End of Application");

	}// main

}// class
