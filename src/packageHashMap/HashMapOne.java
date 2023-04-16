/**
 * 
 */
package packageHashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rnhc1
 *
 */
public class HashMapOne {

	/**
	 * @param args 
	 * Attention: HashMaps do not maintain
	 * order for the K,V pairs
	 */
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1,  "Bob");
		map.put(2,  "Alice");
		map.put(3,  "John");
		map.put(4,  "Claire");
		
		String text = map.get(3);
		
		System.out.println(text);
		
		
		for(Map.Entry<Integer, String> entry: map.entrySet() ) {
			
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key -> " + key + " Value -> " + value);
			
			
		}
		
		
	}

}
