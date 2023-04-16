/**
 * 
 */
package packageSeventeen;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 * @author rnhc1
 *
 */
public class OutputClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassX a = new ClassX();
		ClassY b = new ClassY();
		
		Class obj;
		obj = a.getClass();
		System.out.println(obj.getName());
	
	
		try {
			URL url = new URL("https://easypay.simatef.com.br");
			URLConnection connection = url.openConnection();
			Date lastModified = new Date(connection.getLastModified());
			System.out.println(lastModified);
			System.out.println(connection.getHeaderField("Last-Modified"));

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
