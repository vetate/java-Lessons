/**
 * 
 */
package Methods;

/**
 * @author Ve
 *
 */
public class MethodParameter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ageComment(15);

	}//main
	
	public static void ageComment(int age) {
		
		
		if (age>=18) {
			System.out.println("You're an Adult");
		} else {
			System.out.println(" You are a pup!");
		}
		
		
	}//ageComment
	

}//class
