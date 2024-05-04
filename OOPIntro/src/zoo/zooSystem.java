/**
 * 
 */
package zoo;

/**
 * @author Ve
 *
 */
public class zooSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Hippo h1 = new Hippo();
		
		// View the print out of the default attributes like null and 0 weight
		System.out.println(h1.getName());
		System.out.println(h1.getWeight());
		
		// Set new attributes 
		h1.setName("Hippio 1");
		h1.setWeight(250);
		
		System.out.println(h1.getName());
		System.out.println(h1.getWeight());
		
		
		// 2nd Instance of Hippo Class (Like a movie in lingo used again starting at different in point
		Hippo h2 = new Hippo();
		h2.setName("Hippio 2");
		h2.setWeight(888);
		
		System.out.println(h2.getName());
		System.out.println(h2.getWeight());
		
		
		// From the Hippo class new contructor with arguments ARGS
		Hippo h3 = new Hippo("Hippo 3", 1234);
		System.out.println(h3.getName());
		System.out.println(h3.getWeight());
		
		

	}// main

}// class
