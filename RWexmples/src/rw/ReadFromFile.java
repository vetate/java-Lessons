/**
 * 
 */
package rw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Ve
 *
 */
public class ReadFromFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		String line;
		
		// get the file
		File file = new File("Teams.txt");
		
		
		// open the file
		
		System.out.println("About to open and read file");
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			// read contents
			line = bufferedReader.readLine();
			
			// while loop to continue reading till no text which is a null.
			while(line!=null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
			
			// Close resources 
			bufferedReader.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("About to finish program");
		

		
		
		
		

	}//main

}//class
