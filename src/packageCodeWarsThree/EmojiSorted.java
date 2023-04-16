/**
 * 
 */
package packageCodeWarsThree;

/**
 * @author rnhc1
 * [ ':D', ':)', ':|', ':(', 'T_T' ]
 */

import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;

public class EmojiSorted {

	/**
	 * @param args String originalString = "abcdcba";
	 * 
	 *             StringBuilder strBuilder = new StringBuilder(originalString);
	 *             String reverseString = strBuilder.reverse().toString();
	 * 
	 * 
	 *             boolean isPalindrame = originalString.equals(reverseString);
	 * 
	 *             System.out.println(isPalindrame); //true
	 */

	private static HashMap<Integer, String> map = new HashMap<>(5);
	static {
		map.put(0, "T_T");
		map.put(1, ":(");
		map.put(2, ":|");
		map.put(3, ":)");
		map.put(4, ":D");
	};

	public static Map<Object, Object> areEqualKeyValues(Map<Integer, String> map, Map<Integer, String> ss) {
		return map.entrySet().stream()
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue().equals(ss.get(e.getKey()))));
	}

	public static String[] sortEmotions(boolean order, String[] emotions) {
		// (ง •̀_•́)ง

		// for (Integer count: map.keySet()) {

		// System.out.println(count);
		// }
		String s = "";
		String response[] = new String[emotions.length];
		TreeMap<Integer, String> mapSorted = new TreeMap<>(map);
		// Array[String] -> Map<Integer, String>
		Map<Integer, String> emotionsMap = IntStream.range(0, emotions.length).boxed()
				.collect(Collectors.toMap(idx -> idx, idx -> emotions[idx]));
		System.out.println("Map of emojis " + emotionsMap.keySet() + " -> " + emotionsMap.values());
		int m = 0;
		// Iterate over a Map - entrySet(), getKey(), getValue()
		for (Map.Entry<Integer, String> entry : emotionsMap.entrySet()) {
//				System.out.println((entry.getKey() + " -> " + entry.getValue()));
			if ((map.get(entry.getKey())).equals(emotionsMap.get(entry.getKey()))) {
				System.out.println("Existent : " + entry.getValue());
				response[m] = entry.getValue();
				m++;

			} else {
				System.out.println("Non-existent : " + entry.getKey() + "-> " + entry.getValue());
				response[m] = entry.getValue();
				m++;
			}
		}

		for (String z : response) {
			System.out.print(z + " ");
//			System.out.println(response.length);
		}
		ArrayList<Integer> keys = new ArrayList<Integer>(map.keySet());
		ArrayList<String> values = new ArrayList<String>(map.values());
		for (int c : keys) {
			// System.out.println(c);
		}
		for (String v : values) {
			// System.out.println(v);
		}

		int lenKeys = keys.size() - 1;

		if (order) {
			System.out.println("\n1. Sort HashMap by ascending keys: ");

			int j = 0;
			for (int i = 0; i <= lenKeys; i++) {
				response[j] = map.get(keys.get(i));
//	        	System.out.print(i);
				j++;
			}
//			mapSorted.forEach((key, value) -> {
//				System.out.println(key + ", " + value);
//			});

		} else {
			System.out.println("\n2. Sort HashMap by descending keys: ");
//			mapSorted.descendingMap().forEach((key, value) -> {
//				System.out.println(key + ", " + value);
//			});
			int j = 0;

			for (int i = lenKeys; i >= 0; i--) {
//	        	System.out.print(i);
				response[j] = map.get(keys.get(i));
				j++;
			}

		}
		// return new String[0];

		return response;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String emotions[] = { "T_T", ":D", ":)", ":|", ":(" };
		String[] res = sortEmotions(true, emotions);

		for (String v : res) {
			System.out.print(v + " ");
		}
		byte[] b = { 100, 101, 102 };
		String s = new String(b);
		System.out.println(s);
	}

}
