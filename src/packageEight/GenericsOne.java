/**
 * 
 */
package packageEight;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


/**
 * @author rnhc1
 *
 */
public class GenericsOne {

	public static void main(String[] args) {

		ArrayList<String> strings = new ArrayList<String>();

		String[] animals = { "alligator", "lion", "tiger", "monkey", "snake", "eagle" };

		for (String animal : animals) {

			strings.add(animal);
		};

		System.out.println(strings);

//		for (String string : strings) {
//
//			System.out.println(string);
//		}

		ArrayList<Integer> integers = new ArrayList<Integer>();

		for (int i = 0; i < 20; i++) {

			integers.add(i);
		}

//		System.out.println(integers);
//		
//        Scanner in = new Scanner(System.in);
//        String S = in.next();
//        int start = in.nextInt();
//        int end = in.nextInt();  
//        int len = S.length();
//        in.close();
//        System.out.println(S);
//        System.out.println(len); 
//       // S = "DSFDlskajfDSLJFDLFJRNHC1000RICARDOFNnDFJDLFJnnDLFJDFJLnnFDFJDSFNFDFnDAFD";
//        int dif = 0;
//        dif = start-end;
//        dif = (dif < 0) ? dif*-1 : dif;
//        end+=start;
//        //System.out.println("dif " + dif + " start " + start + " " + end);
//        String str = S.substring(start,start+1) + S.substring(start+1, start+1+dif);
//        //System.out.println(str);
        Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        Map<String, Integer> book = new LinkedHashMap<String, Integer>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            book.put(name, phone);
		}
        Set set = book.entrySet();
        Iterator it = set.iterator();
		while(in.hasNext())
		{
			String s=in.nextLine();
            Map.Entry<String, Integer> entry=(Map.Entry)it.next();
            String key = entry.getKey().toString();
            if( s.equals(key) )  {
                System.out.println(entry.getKey() + "="
                               + entry.getValue(
                            		   ));
            } else {
                System.out.println("Not found ");     
            }
		}
	}     
}