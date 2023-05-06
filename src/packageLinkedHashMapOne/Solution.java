/**
 * 
 */
package packageLinkedHashMapOne;

/**
 * @author rnhc1
 *
 */
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

class Solution {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();

		Hashtable<String, Integer> book = new Hashtable<String, Integer>();
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();
			book.put(name, phone);
			in.nextLine();

		}
		
		Enumeration<String> keys = book.keys();
		//in.nextLine();
//		Set<?> set = book.entrySet();
//		Iterator<?> it = set.iterator();
		String key = "";
		while (in.hasNext()) {
			String s = new String();
			s = in.nextLine();
			// Map.Entry<String, Integer> set = (Map.Entry)book.entrySet();
//			Map.Entry<String, Integer> list = (Map.Entry<String, Integer>) it.next();
			// String key = entry.getKey().toString();
			key = keys.nextElement();			
			if (book.containsKey(s)) {
				Integer fone = book.get(s);
				System.out.println(key + "=" + fone);
			} else {
				System.out.println("Not found ");
			}
		}
		in.close();
	}
}

//Complete this code or write your own from scratch

class SSolution{
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		
      HashMap<String, Integer> book = new HashMap<String, Integer>();
      in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
          book.put(name, phone);
          in.nextLine();

		}
      // Set<?> set = book.entrySet();
      // Iterator<?> it = set.iterator();
      //Enumeration<String> keys = book.keys();
      //String key = "0";
      String s = new String();
		while(in.hasNext())
		{	
          s = in.nextLine();
          
          //Map.Entry<String, Integer> set = (Map.Entry)book.entrySet();
          //Map.Entry<String, Integer> list = (Map.Entry<String, Integer>)it.next();
          // String key = entry.getKey().toString();
          //String key = keys.nextElement();
          //System.out.println("...." + key);

          if( book.containsKey(s) )  {
              //Integer fone = book.get(s);
              System.out.println(s  + "="
                             + book.get(s));
          } else {
              System.out.println("Not found ");     
          }
		}
	}
}




