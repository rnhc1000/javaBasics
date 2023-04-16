/**
 * 
 */
package packageFourteen;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

/**
 * @author rnhc1
 *
 */
public class OverloadOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		OverloadMethods obj = new OverloadMethods();

		int a = 2;
		double b = 32.24;

		obj.add(a, a);
		obj.add(b, b);

		System.out.println(obj.x + " " + obj.y);

		char array_variable[] = new char[10];
		for (int i = 0; i < 10; ++i) {
			array_variable[i] = 'i';
			System.out.print(array_variable[i] + "");
			++i;
		}

		char d = 'A';
		d++;
		System.out.print("\n" +  (int) d + "\n");
		
	    enum Season 
	    {
	        WINTER, SPRING, SUMMER, FALL
	    };
	    System.out.println(Season.WINTER.ordinal());
	    
	    Date now = new Date();
	    SimpleDateFormat sdf = new SimpleDateFormat ("dd-MM-yyyy'T'HH:MM:ss");
	    Instant nowStr = Instant.now();
	    //nowStr = sdf.format(nowStr);
	    System.out.println("Current Date: " + nowStr);
	}

}
