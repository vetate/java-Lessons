/**
 * 
 */
package fileReading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Ve
 *
 */
public class BufferReadFromFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String line;
		try {
			// create a file object
			File file = new File ("Teams.txt");
			
			// create a file reader object relating to the file
			FileReader filereader = new FileReader(file.getName());
			
			//Note - using BufferWriter is more efficient with multiple writes to file
			BufferedReader bufferReader = new BufferedReader(filereader);
			
			// Read the contents
			line = bufferReader.readLine();
			while (line != null) {
				System.out.println(line);
				line = bufferReader.readLine();
			}//while
			
			// Close all resources
			bufferReader.close();
			filereader.close();
			System.out.println("File End...");
			
		}//try
		catch (IOException e) {
			e.printStackTrace();
		}//catch
		

	}//main

}//class
