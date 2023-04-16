/**
 * 
 */
package packageTwentyNine;

/**
 * @author rnhc1
 *
 */
public class AutoCloseableOne implements AutoCloseable{
	@Override
	public void close() throws Exception {
		
		System.out.println("Closing!!!");
	}

}
