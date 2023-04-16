/**
 * 
 */
package packageSixteen;

import java.io.*;
import java.net.*;

/**
 * @author rnhc1
 *
 */
public class UrlOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.google.com");
			System.out.println("Protocol: " + url.getProtocol());
			System.out.println("Host Name: " + url.getHost());
			System.out.println("Port Number: " + url.getPort());
			System.out.println("User Info: " + url.getUserInfo());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
