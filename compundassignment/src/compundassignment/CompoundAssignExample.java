/**
 * 
 */
package compundassignment;

/**
 * @author Ve
 *
 */
public class CompoundAssignExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num;
		num = 998;
		num = num +2;
		System.out.println(num);
		
		// or
		num += 2;
		System.out.println(num);
		
		// not just addition
		num -=2;
		System.out.println(num);
		
		num /=2;
		System.out.println(num);
		
		num *=2;
		System.out.println("Multiply " + num);
		
		num %=2;
		System.out.println("Remanider " + num);
		
		int num2 =0;
		
		
		//Increment or decrement by 1
		num2 ++;
		System.out.println(num);
		
		num2 --;
		System.out.println(num);
		
		
		// post & prefix
		 System.out.println("post & pre fix");

		 num = 2;

		 // post
		 System.out.println("post fix");
		 System.out.println(num);
		 System.out.println(++num);
		 System.out.println(num);
		 
		 //modulus %
		 int ans = 10%3;
		 System.out.println(ans);

	}

}
