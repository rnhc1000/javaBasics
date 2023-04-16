/**
 * 
 */
package packageSortedMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author rnhc1
 *
 */
public class SortedMapOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//HashMap<Integer,String> hashMap =  new HashMap<Integer, String>();
		//LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		//TreeMap<Integer, String> treeHashMap = new TreeMap<Integer, String>();
		// or
		//
		Map<Integer,String> hashMap =  new HashMap<Integer, String>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treeHashMap = new TreeMap<Integer, String>();
		
		
		System.out.println("HashMap....");
		testMap(hashMap);
		System.out.println("LinkedHashMap");
		testMap(linkedHashMap);
		System.out.println("TreeMap....");
		testMap(treeHashMap);
	}
	
	public static void testMap(Map<Integer,String> map) {
		map.put(9, "Fox");
		map.put(7, "Cat");
		map.put(6, "Dog");
		map.put(3, "Monkey");
		map.put(1, "Bird");
		map.put(0, "Parrot");
		map.put(8, "Snake");
		
		
		for (Integer key: map.keySet() ) {
			
			String value = map.get(key);
			
			System.out.println(key + " : " + value);
			
		}
		
	}
}
