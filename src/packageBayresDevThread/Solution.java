package packageBayresDevThread;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeMap;
import java.util.Vector;

public class Solution implements Runnable {
	final static short rf = 2;
	public static int ax = 0;

	class Test1 {
		public int value;

		public int hashCode() {
			return 42;
		}
	}

	class Test2 {
		public int value;

		public int hashcode() {
			return (int) (value ^ 5);
		}
	}

	static boolean b1, b2;
	int x, y;

	public void run() {
		for (int i = 0; i < 1000; i++)
			synchronized (this) {
				x = 12;
				y = 12;
			}
		System.out.print(x + " " + y + " " + "\n");
	}

	public static void stringReplace(StringBuilder text) {

		try {
			text = text.append("c"); /* Line 5 */
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void bufferReplace(StringBuffer text) {
		text = text.append("c"); /* Line 9 */
	}

	public void x() {
		java.util.TreeSet t = new java.util.TreeSet();
		t.clear();
	}

	public void clear() {
		TreeMap m = new TreeMap();
		m.clear();
	}

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Solution run = new Solution();
		Thread t1 = new Thread(run);
		Thread t2 = new Thread(run);
		t1.start();
		t2.start();

		StringBuilder textString = new StringBuilder("java");
		StringBuffer textBuffer = new StringBuffer("java"); /* Line 14 */
		stringReplace(textString);
		bufferReplace(textBuffer);
		System.out.println(textString.toString() + textBuffer);

		float f1[], f2[];
		f1 = new float[10];
		f2 = f1;

		for (float a : f1) {
			System.out.print(a + " ");
		}
		System.out.println("\nf2[0]" + f2[0]);

		int x = 0;

		if (!b1) /* Line 7 */
		{
			if (!b2) /* Line 9 */
			{
				b1 = true;
				x++;
				if (5 > 6) {
					x++;
				}
				if (!b1)
					x = x + 10;
				else if (b2 = true) // if evaluate for false|true
					x = x + 100;
				else if (b1 | b2) /* Line 21 */
					x = x + 1000;
			}
		}
		System.out.println(x);

		int i = 0;
		while (true) {
			if (i == 4) {
				break;
			}
			++i;
		}

		try {
			int xx = 0;
			int yx = 5 / xx;
		} catch (Exception e) {
			System.out.println("Exception");
		}
//        catch (ArithmeticException ae) 
//        {
//            System.out.println(" Arithmetic Exception"); 
//        } 
		System.out.println("finished");

		Object xz = new Vector<Object>().elements();
		System.out.print((xz instanceof Enumeration) + ",");
		System.out.print((xz instanceof Iterator) + ",");
		System.out.print(xz instanceof ListIterator);

		int ii = 1, j = 0;
		switch (ii) {

		default:
			j += 2;
		case 2:
			j += 6;
		case 4:
			j += 1;
		case 0:
			j += 4;

		}
		System.out.println("\nj = " + j);

		System.out.println("---------");

		int zx[] = new int[10];
		System.out.print("Int -> ");

		for (int jr : zx) {
			System.out.print("-" + jr + "-");
		}

		System.out.println();
		String[] rr = new String[10];
		System.out.print("String -> ");

		for (String js : rr) {

			System.out.print("-" + js + "-");
		}
		System.out.println();

		boolean[] ss = new boolean[10];
		System.out.print("Boolean -> ");

		for (boolean jx : ss) {

			System.out.print("-" + jx + "-");
		}
		System.out.println();

		Object[] o = new Object[10];
		System.out.print("Object -> ");

		for (Object ix : o) {

			System.out.print("-" + ix + "-");
		}
		System.out.println();

		char[] yz = new char[10];
		System.out.print("char -> ");

		for (char A : yz) {

			System.out.print("-" + A + "-");
		}

		double[] db = new double[10];

		System.out.println();
		System.out.print("double -> ");

		for (double ddd : db) {
			System.out.print("-" + ddd + "-");
		}

		float[] fff = new float[10];
		System.out.println();
		System.out.print("float -> ");

		for (float ffff : fff) {
			System.out.print("-" + ffff + "-");
		}

		byte bbbb[] = new byte[10];
		System.out.println();
		System.out.print("byte ");

		for (float bbbbb : bbbb) {
			System.out.print("-" + bbbbb + "-");
		}

		int[] Scores[] = new int[10][10];
		int[][] ScoresOne = new int[10][10];
		System.out.println();
		int xa = 20;
		String sup = (xa < 15) ? "small" : (xa < 20) ? "tiny" : "huge";
		System.out.println();

		System.out.println(sup);
		System.out.println();

		int w = (int) 888.8;
		byte r = (byte) 1000L;
		long f = (byte) 100;
		byte y = (byte) 100L;

		System.out.println(w + " " + r + " " + f + " " + y);
		final int axx = 2;
		int axy = 0;

		for (int rfx = 0; rfx < 4; rfx++) {
			switch (rfx) {
			case axx:
				System.out.print("0 ");
				break;
			default:
				System.out.print("def ");
			case axx - 1:
				System.out.print("1 ");
				break;
			case axx - 2:
				System.out.print("2 ");
			}
		}

		String rgz = "NULL";
		System.out.println();

		int dx = 0;
		int dy = 0;
		for (int dz = 0; dz < 5; dz++) {
			if (++dx > 2 && ++dy > 2) {
				dx++;
			}

			System.out.println("dz-> " + dz + " " + dx + " " + dy);
		}
		System.out.println(dx + " " + dy);

		int vi = 1;
		int vj = -1;

		switch (vi) {
		case 0:
		case -1:
			vj = 1; /* Line 4 */
		case 2:
			vj = 2;

		default:
			vj = 0;
		}
		System.out.println("vj = " + vj);

		for (int nx = 0; nx < 7; nx++, nx++) {
			System.out.print(" " + nx);
		}

		boolean fg = true;
		boolean gf = false;

		if (fg = gf) {

			System.out.println(fg);
		}

		int[] Array = { 1, 3, 4, 2, 2, 2, 7, 0 };
		int toSum = 0;
		int sum = 10;

		int len = Array.length;
		outer:
		for (int im = 0; im < len; im++) {

			for (int mi = 1; mi < len; mi++) {

				toSum = Array[im] + Array[mi];
				
				System.out.print("\ntoSum "+ toSum);

				if (toSum == sum) {
					System.out.print("\n" + Array[im] + " " + Array[mi]);
					break outer;
				}

			}

		}
		
		
		int gh = (int) ((int)Math.random() + 0.5);
		
		double hg = Math.random() + 0.5;
		
		System.out.println("\nRand " + gh);

		System.out.println("\nRandOne " + hg);

	}
}

//interface Foo {
//	public static final int k = 4; /* Line 3 */
//}

/**
 * You want subclasses in any package to have access to members of a superclass.
 * Which is the most restrictive access that accomplishes this objective?
 * 
 * public
 * 
 * private
 * 
 * protected
 * 
 * transient Your Answer: Option Correct Answer: Option Explanation: Access
 * modifiers dictate which classes, not which instances, may access features.
 * 
 * Methods and variables are collectively known as members. Method and variable
 * members are given access control in exactly the same way. private makes a
 * member accessible only from within its own class protected makes a member
 * accessible only to classes in the same package or subclass of the class
 * default access is very similar to protected (make sure you spot the
 * difference) default access makes a member accessible only to classes in the
 * same package. public means that all other classes regardless of the package
 * that they belong to, can access the member (assuming the class itself is
 * visible) final makes it impossible to extend a class, when applied to a
 * method it prevents a method from being overridden in a subclass, when applied
 * to a variable it makes it impossible to reinitialise a variable once it has
 * been initialised abstract declares a method that has not been implemented.
 * transient indicates that a variable is not part of the persistent state of an
 * object. volatile indicates that a thread must reconcile its working copy of
 * the field with the master copy every time it accesses the variable.
 * 
 * After examining the above it should be obvious that the access modifier that
 * provides the most restrictions for methods to be accessed from the subclasses
 * of the class from another package is C - protected. A is also a contender but
 * C is more restrictive, B would be the answer if the constraint was the "same
 * package" instead of "any package" in other words the subclasses clause in the
 * question eliminates default
 */
