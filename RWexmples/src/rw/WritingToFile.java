/**
 * 
 */
package rw;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

/**
 * @author Ve
 *
 */
public class WritingToFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FileWriter fileWriter;
		BufferedWriter bufferedWriter;
		
		// open the file
		File file = new File("SixNations1996.txt");

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			
			fileWriter = new FileWriter(file, true);
			bufferedWriter = new BufferedWriter(fileWriter);
			
			bufferedWriter.write("\nEng");
			bufferedWriter.write("\nIre");
			bufferedWriter.write("\nScot");
			
			bufferedWriter.close();
			fileWriter.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}//main

}//class
