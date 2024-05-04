/**
 * 
 */
package arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author Ve
 *
 */
public class ArrayListsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<String>();
	    
        fruits.add("Apples");
        fruits.add("Oranges");
        
        System.out.println(fruits.toString());
        
        fruits.add(0, "Pears");
        System.out.println(fruits.toString());

        
        System.out.println(fruits.size());
        
        System.out.println("For Loop here");
        for (int loop=0; loop<fruits.size(); loop++) {
        	System.out.println(fruits.get(loop));
        	
        }
        System.out.println("\n");
        
        //enhanced for
        System.out.println("Enhanced For Loop");
        for (String item : fruits) {
            System.out.println(item);
        }
        System.out.println("\n");
        
        System.out.println("Iterator start");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
     // for more useful methods 
        System.out.println("Contains start Search for an item");
        if (fruits.contains("Pears")) {
            System.out.println("Got pears");
        }
        
        System.out.println("Replace an item");
        fruits.set(1, "Peach");
        System.out.println(fruits.toString());
    
        System.out.println("Sorting by Alphabyte");
        Collections.sort(fruits);
        System.out.println(fruits);
        
        
        System.out.println("Remove an elelment");
        fruits.remove("Oranges");
        System.out.println(fruits);
        
        fruits.clear();
        
	}//main

}//class
