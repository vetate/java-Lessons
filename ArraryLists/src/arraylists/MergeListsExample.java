/**
 * 
 */
package arraylists;

import java.util.ArrayList;

/**
 * @author Ve
 *
 */
public class MergeListsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        list1.add("One");
        list1.add("Two");
        list1.add("Three");
        
        list2.add("Four");
        list2.add("Two");
        list2.add("Five");
        
        // merge without duplicates
        for (int loop=0;loop<list2.size();loop++) {
            if (!list2.contains(list1.get(loop))) {
                list1.add(list2.get(loop));
            }
        }
        
        System.out.println(list1);

	}

}
