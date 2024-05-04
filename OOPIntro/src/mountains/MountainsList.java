/**
 * 
 */
package mountains;

import java.util.ArrayList;

/**
 * @author Ve
 *
 */
public class MountainsList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// creating mountain 
		Mountain m1 = new Mountain();
		m1.setName("Everest");
		m1.setHeight(8899);
		
		//k2 8601
		Mountain m2 = new Mountain("k2", 8601);
		
		// creating an ArrayList to hold the mountains
        ArrayList<Mountain> mountains = new ArrayList<Mountain>();
        
        //add each mountain to arraylists
        mountains.add(m1);
        mountains.add(m2);
        
     // accessing all the details of each mountain by looping
        // through each one in the arraylist
        for (Mountain mountain : mountains) {
            System.out.println(mountain.getName() +" "+mountain.getHeight());
        }
  
		
	}
	// create a method that will identifiy and output to screen the name of all mountains less than 9000
	public static void findMountainsByHeight(ArrayList<Mountain> mountains, int height) {
        System.out.println("Mountains less than " + height);
        for (Mountain mountain : mountains) {
            if (mountain.getHeight() <= height) {
                System.out.println(mountain.getName() + " " + mountain.getHeight());
            }
        }
    }//main

}//class
