/**
 * 
 */
package Loopers;

/**
 * @author Ve
 *
 */
public class ForLoopEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		int total;
		total = 0;
		
		for (int num=2; num<=20; num+=2) {
			System.out.println(num);
			
			total +=num;
			System.out.println(total);
		}//for
		System.out.println("Final" +total);

	}

}
