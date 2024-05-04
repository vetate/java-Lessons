/**
 * 
 */
package exceptional;

/**
 * @author Ve
 *
 */
public class CallStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		getValue();
		
	}	
	
	public static void showValue(int index){
			int[] myArray = { 1,2,3,4,5 };
			System.out.println("Value is : "+myArray[index]);
	}
			
	public static void getValue(){
			int index = 7;
			showValue(index);
	}
			

}