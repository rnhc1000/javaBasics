/**
 * 
 */
package packageTwelve;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author rnhc1
 *
 */
public class HandlingExceptions {

//	public static void main(String[] args) throws FileNotFoundException {
	public static void main(String[] args) {
//String fileName = "C:\\Users\\rnhc1\\Documents\\workspace-spring-tool-suite-4-4.18.0.RELEASE\\javaBasics\\src\\packageTwelve\\fileOne.txtt";
		// String fileName = "fileOne.txt";
//		File file = new File(fileName);
//		Scanner input = new Scanner(fileName);
//		while (input.hasNextLine() ) {
//			String line = input.nextLine();
//			System.out.println(line);	
//		}		
//		input.close();

//		try {
//			FileReader fr = new FileReader(fileName);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		String str = new String("Java");
//		char fourthChar = str.charAt(4);
		if ("Welcome".trim() == "Welcome".trim())
			System.out.println("Equal");
		else
			System.out.println("Not Equal");

		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * 2;
		}
		
		
		ArrayList<Integer> array = new ArrayList<Integer>(40);
		
		
		for (Integer integer: arr) {
			
			array.add(integer);
		}
		
		
		//System.out.println(Arrays.toString(arr));
		
		System.out.println(array);
		
	         
	             byte x = 64;
	             int i;
	             byte y; 
	             i = x << 2;
	             y =  (byte) (x << 2);
	             System.out.print(i + " " + y);
	             
	             LinkedList list = new LinkedList();
	             list.add(new Integer(2));
	             list.add(new Integer(8));
	             list.add(new Integer(5));
	             list.add(new Integer(1));
	             Iterator j = list.iterator();
	             Collections.reverse(list);
	 	    Collections.sort(list);
	             while(j.hasNext())
	 	        System.out.print(j.next() + " ");
	             
	             System.out.println(list);
	 

	}

}
