/**
 * 
 */
package Methods;

/**
 * @author Ve
 *
 */
public class yearTurn100 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		yearTurn();

	}//main
	
	public static void yearTurn() {
		int currentAge, currentYear, yearTurning100;
		
		currentAge = 49;
		yearTurning100 = 0;
		currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
		yearTurning100 = 100 - currentAge + currentYear;
		System.out.println("Year turing 100 is : " + yearTurning100);
	}

}//class
