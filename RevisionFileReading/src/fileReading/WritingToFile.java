/**
 * 
 */
package fileReading;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Ve
 *
 */
public class WritingToFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			String teamToAdd = "Ve";
			char newLine = '\n';
			
			File file = new File ("Teams.txt");
					
			if (!file.exists()) {
				file.createNewFile();
			}
					
			FileWriter fw = new FileWriter(file, true);
					
			BufferedWriter bw = new BufferedWriter (fw);
			bw.write(newLine+teamToAdd);
			bw.close();
			System.out.println("Write complete");
					
		} catch (IOException e) {
			e.printStackTrace();
		}

	}//main

}//class
