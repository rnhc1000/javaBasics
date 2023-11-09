package packageLeetCodeLongestString;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		// indexOf returns the index of the first occurrence of a specified character in
		// a
		// string
		int index = 0;
//		String myStr = "The quick frown foxx dog jumps over the lazy fog";
//		StringBuilder str = new StringBuilder();
//		str.append("f");
//		for (int i = 0; i < myStr.length(); i++) {
//
//			// System.out.print(str.indexOf(String.valueOf(myStr.charAt(i))) + " ");
//			if (str.indexOf(String.valueOf(myStr.charAt(i))) != -1) {
//
//				break;
//			}
//			System.out.print(i + " ");
//
//		}

		String ax = "abcabcd";
		int l = 0;
		l = lengthOfLongestSubstring(ax);
		System.out.println(l);
		StringBuilder r = longestSubstring(ax);
		System.out.println(r);
		ax = "abcabecd";
		System.out.println(lengthOfLongestSubstringHashMap(ax));

	}

	public static int lengthOfLongestSubstringHashMap(String s) {

		int lenMax = 0;

		int lenStr = s.length();
		Map<Character, Integer> map = new HashMap<>();
		// we're gonna use two pointers, right and left;
		// sliding windows
		for (int right = 0, left = 0; right < lenStr; right++) {

			char currentChar = s.charAt(right);
			// recover character and its position as index thru get for the map

			if (map.containsKey(currentChar) && map.get(currentChar) >= left) {
				// gotta move the left pointer;
				left = map.get(currentChar) + 1;
			}
			lenMax = Math.max(lenMax, right - left + 1);
			map.put(currentChar, right);
		}
		System.out.println(map);
		return lenMax;
	}

	public static int lengthOfLongestSubstring(String s) {

		int lenMax = 0;

		int lenStr = s.length();
		StringBuilder currentSubstring = new StringBuilder();
		for (int i = 0; i < lenStr; i++) {

			for (int j = i; j < lenStr; j++) {
				// it returns the current position of the s.charAt(j)
				// indexOf returns the position of a character so we need to
				// use String.valueOf(s.charAt(j))
				if (currentSubstring.indexOf(String.valueOf(s.charAt(j))) != -1) {
					break;

				}
				currentSubstring.append(s.charAt(j));
				lenMax = Math.max(lenMax, currentSubstring.length());
			}
		}
		// System.out.println(currentSubstring);
		return lenMax;
	}

	public static StringBuilder longestSubstring(String s) {

		int lenMax = 0;

		int lenStr = s.length();
		StringBuilder currentSubstring = new StringBuilder();
		for (int i = 0; i < lenStr; i++) {

			for (int j = i; j < lenStr; j++) {
				// it returns the current position of the s.charAt(j)
				// indexOf returns the position of a character so we need to
				// use String.valueOf(s.charAt(j))
				if (currentSubstring.indexOf(String.valueOf(s.charAt(j))) != -1) {
					break;

				}
				currentSubstring.append(s.charAt(j));
				lenMax = Math.max(lenMax, currentSubstring.length());
			}
		}
		// System.out.println(currentSubstring);
		return currentSubstring;
	}

}
