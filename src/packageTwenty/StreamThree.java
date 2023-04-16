/**
 * 
 */
package packageTwenty;

import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;
import java.security.*;

/**
 * @author rnhc1
 *
 */
public class StreamThree {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		try {

			FileOutputStream fos = new FileOutputStream("serial.txt");
			ObjectOutputStream oss = new ObjectOutputStream(fos);
			oss.writeInt(5);
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
			x = ois.readInt();
			ois.close();
			System.out.println(x);

		} catch (Exception e) {
			System.out.println("Deserialization! " + e);
			e.printStackTrace();
			System.exit(0);
		}

		// int y = double z = Math.random();
		// System.out.println(y);

		Vector obj;
		obj = new Vector(4, 2);

		try {

			obj.addElement(new Integer(5));
			obj.addElement(new Integer(3));
			obj.addElement(new Integer(5));
			System.out.println(obj.capacity());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
//		for (int i=0; i < obj.capacity(); i++) {
//			
//			System.out.println(obj.elementAt(i));
//		}

			LinkedList objx = new LinkedList();

			objx.add("A");
			objx.add("B");
			objx.add("C");
			objx.addFirst("D");

			System.out.println(objx);

			String objy = "abc";

			byte b[] = objy.getBytes();

			System.out.println(Arrays.toString(b));
			ByteArrayInputStream objz = new ByteArrayInputStream(b);
			for (int i = 0; i < 2; i++) {
				int c;

				while ((c = objz.read()) != -1) {
					System.out.print("\t" + Character.toUpperCase((char) c));

					if (i == 0) {
						System.out.print("\t" + Character.toUpperCase((char) c));
						// objz.write(1);
					}
				}

				// System.out.print(objz.toString());

			}
			String o = "abcdefg";
			int l = o.length();
			char c[] = new char[l];
			o.getChars(0, l, c, 0);

			System.out.print("\n");
			System.out.println(c);
			CharArrayReader iOne = new CharArrayReader(c);
			CharArrayReader iTwo = new CharArrayReader(c, 1, c.length);
			int p;
			int q;

			try {

				while ((p = iOne.read()) == (q = iTwo.read())) {
					System.out.println("Eu");
					System.out.println(p);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			int xx, yy, zz;
			xx = 0;
			yy = 1;
			xx = yy = zz = 8;

			System.out.println(xx + " " + yy + " " + zz);

			int as = 8;

			try {
				if (as == 8) {

					//int as = 10; // duplicate local variable
					System.out.println(as);
				}
			} catch (Exception e) {

				System.out.println("erro....");
				e.printStackTrace();
			}
		}
	}
}
