/**
 * 
 */
package packageTwentySeven;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author rnhc1
 *
 */
public class CreatingFilesOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("src/test.txt");
		
		try(BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
			
			br.write("This is line one");
			br.newLine();

			br.write("This is line two");
			br.newLine();

			br.write("This is line three");
			br.newLine();
			br.write("This is the last one");
			br.newLine();

			
			
			System.out.println("Fim");
			
		} catch (IOException e) {
			
			System.out.println("File could not be created!!! " + file);
		}

	}

}
