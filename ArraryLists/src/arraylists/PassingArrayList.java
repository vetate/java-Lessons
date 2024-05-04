/**
 * 
 */
package arraylists;

import java.util.ArrayList;

/**
 * @author Ve
 *
 */
public class PassingArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<String> goodSingers = new ArrayList<String>();
        ArrayList<String> crooners = new ArrayList<String>();
        
        goodSingers.add("Prince");
        goodSingers.add("Bowie");
        goodSingers.add("U2");
        
        crooners.add("person1");
        crooners.add("Sinartra");
        
        System.out.println("Good Singers...");
        displayAllSingers(goodSingers);
        
        System.out.println("Crooners...");
        displayAllSingers(crooners);

       
	}//main
	
	public static void displayAllSingers(ArrayList<String> singers) {
		
		System.out.println(singers.toString());
	}

}//class
