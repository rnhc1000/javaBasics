/**
 * 
 */
package packageNineteen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author rnhc1
 *
 */
public class StreamTwo implements Serializable {

	/**
	 * @param args
	 */

		String s;
		int t;
		double d;

		StreamTwo(String s, int t, double d) {

			this.s = s;
			this.t = t;
			this.d = d;

		}

	public static void main(String[] args) {

		try {
			StreamTwo obj1 = new StreamTwo("Hello", -7, 2.1e10);
			FileOutputStream fos = new FileOutputStream("serial.txt");
			ObjectOutputStream oss = new ObjectOutputStream(fos);
			oss.writeObject(obj1);
			oss.flush();
			oss.close();
			System.out.println("Serialization Done!!!");
		} catch (Exception e) {

			System.out.println("Serialization!" + e);
			e.printStackTrace();
			System.exit(0);
		}

		try {

			int x;
			FileInputStream fis = new FileInputStream("serial.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ois.readObject();
			ois.close();
			System.out.println(ois);
		} catch (Exception e) {
			System.out.println("Deserialization! " + e);
			e.printStackTrace();
			System.exit(0);
		}

	}

}
