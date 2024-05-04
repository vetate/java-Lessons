/**
 * 
 */
package arraysExamples;

/**
 * @author Ve
 *
 */
public class ageArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//declare the array
		
		int[] ages = { 2,3,4,5,6,7,8,5,2};
		
		displayAll(ages);
		System.out.println("Average age " + averageAge (ages));
		System.out.println("Max age" + maxAge (ages));

	}//main
	
	/**
	 * Age Array
	 */
	 public static void displayAll(int [] ageArray) {
		 System.out.println("All ages");
		 for (int loop = 0; loop < ageArray.length; loop++) {
			 System.out.println(ageArray[loop] + " ");
		 }//for
	 }//displayAll
	 
	 public static int averageAge (int[] ageArray) {
		int total = 0;
		for (int loop = 0; loop < ageArray.length; loop++) {
			total += ageArray[loop];
		}//for
		return total/ageArray.length;
	 }//averageAge
	 
	 /**
	  *  Max Age Method
	  */
	 
	 public static int maxAge (int[] ageArray) {
		 int max = ageArray[0];
		 for  (int loop = 0;loop <ageArray.length; loop++) {
			 if (max < ageArray [loop]){
				 max = ageArray[loop];
			 }//if
		 }//for
		 return max;
			 }//maxAge

}//class
