/**
 * 
 */
package Loopers;

import java.util.Scanner;

/**
 * @author Ve
 *
 */
public class MenuTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// vars
		int userOption;
		Scanner scanner = new Scanner(System.in);

		// show a menu on screen
		do {

		System.out.println("Menu");
		System.out.println("1. File");
		System.out.println("2. Edit");
		System.out.println("3. Delete");
		System.out.println("4. Quit");

		// prompt user for menu option
		System.out.println("Enter an Option");
		// Capture user option
		userOption = scanner.nextInt();

		// process menu option
		switch (userOption) {
		case 1:
			System.out.println("Filing....");
			break;
		case 2:
			System.out.println("Editing....");
			break;
		case 3:
			System.out.println("Deleting....");
			break;
		case 4:
			System.out.println("Save");
			break;
		case 5:
			System.out.println("Quit");
			break;
		default:
			System.out.println("Not an Option. Try again please");
		}
		} while (userOption !=5); //Repeats the menu options

		// output repeat the menu options ... depending on option
		

		// program printout bye
		System.out.println("Bye thanks for using me");

	}

}
