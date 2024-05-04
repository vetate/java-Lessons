/**
 * 
 */
package inOut;
import java.util.Scanner;
/**
 * @author Ve
 *
 */
public class ifExercise1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int age;
		
		System.out.println("What is your age?");
		age = scanner.nextInt();
		
		System.out.println(" your age is: " + age);
		
		if (age >=18) {
			System.out.println("You are over 18! " + age + " Yeah!!!");
		}
		
		if (age <18) {
			System.out.println("You are " + age + " too young! :(");
		}
		
		System.out.println("Bye");
		scanner.close();

	}

}
