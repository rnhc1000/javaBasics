/**
 * 
 */
package packageTwentyNine;

import java.io.File;

/**
 * @author rnhc1
 *
 */
public class ReadFileTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(AutoCloseableOne autocloseable = new AutoCloseableOne()) {
			
		} catch(Exception e) {
			e.printStackTrace();
		}
				
		
		/**
		 * Java 7 
		 * surround the instantiation with
		 * a try/catch
		 * It´s called try-with-resources
		 * The close() is automatically called
		 */
//		try {
//			autocloseable.close();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
