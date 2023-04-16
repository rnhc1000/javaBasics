/**
 * 
 */
package packageFifteen;

/**
 * @author rnhc1
 *
 */
/**
 * @author rnhc1
 *
 */
public class ArgumentsOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[][] argument = new String[2][2];
		int x;
		argument[0] = args;
		x = argument[0].length;
		for (int y = 0; y < x; y++)
			System.out.print(" " + argument[0][y]);

		int arr[] = new int[5];
		for (int integers : arr) {

			System.out.print(arr[integers]);
		}

//		Object[] names = new String[3];
//		//names[0] = new Integer(0);
//		System.out.println(names[0]);

		int ascii[] = { 65, 66, 67, 68 };
		String s = new String(ascii, 1, 3);

		System.out.println(s);
		
		
		String t = "Hello I love Java";
		int start = 2;
		int end  =  9;
		char u[] = new char[end-start];
		t.getChars(start,end,u,0);
		System.out.println(u);
		
		int xx = (int)3.14;
		int y = (int)Math.abs(xx);
		System.out.println(y);
		
		byte aa[] = { 64,65 };
		byte bb[] = { 71, 72};
		
		System.arraycopy(aa, 0, bb, 0, aa.length);
		System.out.print((new String(aa) + " " + new String(bb)));
		
		}
		

	}
