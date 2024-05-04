/**
 * 
 */
package rw;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ve
 *
 */
public class ArraySortReadWrite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] numbers = new int[5];
		//Arrays.sort(numbers);
		
		Scanner scanner = new Scanner(System.in);
		
		for (int loop = 0; loop < numbers.length; loop++) {
			System.out.println("Enter numbers");
			numbers[loop] = scanner.nextInt();
		}
		
		System.out.println(Arrays.toString(numbers));
		
		scanner.close();
		
	//sort
		Arrays.sort(numbers);;
		System.out.println(Arrays.toString(numbers));
		
		//open or create file
		File file = new File("InputNumbers.txt");
		
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			// write to the file
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (int loop = 0; loop < numbers.length; loop++) {
				bw.write(numbers[loop] + " ");
			}
			bw.close();
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
