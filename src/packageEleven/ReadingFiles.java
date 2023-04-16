/**
 * 
 */
package packageEleven;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 * @author rnhc1
 *
 */
public class ReadingFiles {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		String fileName = "C:\\Users\\rnhc1\\Documents\\debitoDiario.sql";
		File textFile = new File(fileName);
		
		/**
		 * try catch - surround with or the other
		 * option is to launch an exception via
		 * main function
		 */
//		try {
//			Scanner input = new Scanner(fileName);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		Scanner input = new Scanner(textFile);
		
		int countLine = 0;
		
		while(input.hasNextLine()) {
			
			String line = input.nextLine();
			
			System.out.println(line);
			
			countLine++;
			
		}
		
		input.close();
		
		System.out.println("Aquivo contem " + countLine + " Linhas!");

	}

}
