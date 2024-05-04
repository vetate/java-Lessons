/**
 * 
 */
package mountains;

/**
 * @author Ve
 *
 */
public class MountainManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Mountain mountain = new Mountain();
		Mountain mountain2 = new Mountain();
		
		mountain.setName("Everest");
		mountain.setHeight(8888);
		
		mountain2.setName("Donnard");
		mountain2.setHeight(5555);
		
		System.out.println(mountain.getName());
		System.out.println(mountain2.getName());
		
		System.out.println("Name: " +mountain.getName() + " : Height " +mountain.getHeight());
		System.out.println("Name: " +mountain2.getName() + " : Height " +mountain2.getHeight());
		

	}// main

}// class
