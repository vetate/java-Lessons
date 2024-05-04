/**
 * 
 */
package compundassignment;

/**
 * @author Ve
 *
 */
public class WhileIfExam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//even numbers 1 - 50
		int counter=1;
		
		// 1- 99. Going to be 
		while (counter <=50) {
			//divide by 2 the remainder is 
			if (counter %2 == 0) {
				//even number
				System.out.println(counter);
			}//if
			counter++;
		}//while
		

	}

}
