/**
 * 
 */
package packageTwentyThree;

import java.io.IOException;
import java.text.ParseException;

/**
 * @author rnhc1
 *
 */
public class MultipleExceptions {

	/**
	 * @param args
	 * @throws ParseException 
	 * @throws IOException 
	 * main throws IOException, ParseException
	 */
	//public static void main(String[] args) throws IOException, ParseException {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Test test = new Test();
		
		
		
//		try {
//			test.run();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		try {
			test.run();
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/**
		 * Exception is the parent class
		 * of both IOException and
		 * ParseException
		 */
		
		try {
			test.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
