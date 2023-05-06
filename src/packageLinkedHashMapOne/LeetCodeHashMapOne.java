/**
 * 
 */
package packageLinkedHashMapOne;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author rnhc1
 *
 */
public class LeetCodeHashMapOne {

	/**
	 * @param args Given an Integer array, return TRUE if any value appear at least
	 *             TWICE in the array and return FALSE if every element is distinct
	 *             Input: nums = [1,2,3,1]; Output: true Input : nums = [1,2,3,4];
	 *             Output: false Input: nums = [1,1,1,3,4,4,3,4,4,2]; Output: false
	 */

	/**
	 * 
	 * @param nums
	 * @return boolean true if duplicates, false otherwise TC=O(n2), SC=O(1)
	 */

	public static boolean evaluateDuplicatesOne(int[] nums) {

		int lenNums = nums.length;
		try {
			if (lenNums < 2)
				throw new ArithmeticException();
		} catch (Exception e) {

			return false;
		}
		System.out.print("Nums informed: ");
		System.out.println(Arrays.toString(nums));

		for (int i = 0; i < lenNums; i++) {

			for (int j = 1; j < lenNums; j++) {

				if ((i != j) && (nums[i] == nums[j])) {

					System.out.println("Números repetidos: " + nums[i] + " " + nums[j]);

					return true;
				}
			}
		}
		System.out.println("There are no duplicates!!!");

		return false;
	}

	public static boolean evaluateDuplicatesTwo(int[] nums) {

		Arrays.sort(nums);

		System.out.println(Arrays.toString(nums));

		int lenNums = nums.length;

		for (int i = 0; i < lenNums - 1; i++) {

			if (nums[i] == nums[i + 1]) {

				System.out.println("Números Repetidos Método 2: " + nums[i] + " " + nums[i + 1]);
				return true;

			}
		}
		System.out.println("There are no duplicates!!!");
		return false;
	}

	public static boolean evaluateDuplicatesThird(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int lenNums = nums.length;
		boolean hasDuplicates = false;
		for (int i = 0; i < lenNums; i++) {
			if (map.containsKey(nums[i])) {
				System.out.println(map.entrySet());
//				return true;
				hasDuplicates = true;
			}

			map.put(nums[i], i);
		}
		if(hasDuplicates) return true; 
		System.out.println("There are no duplicates!!!");
		return false;

	}
	
	public static boolean evaluateDuplicatesFourth(int [] nums) {
		
		HashSet<Integer> map = new HashSet<Integer>();
		
		int lenNums = nums.length;
		
		for (int i=0; i < lenNums; i++) {
			
			map.add(nums[i]);
		}
		
		if (map.size() != lenNums) {
			
			System.out.println(map);
			
			return true;
		} else {
			System.out.println("There are no duplicates!!!");
			return false;
			
		}
		
	}

	public static void main(String[] args) {
		int[] nums = { 1,3,2,2,3,4,5, 6, 7, 8, 9, 5, 4, 5 };

		System.out.println(evaluateDuplicatesOne(nums));
		evaluateDuplicatesTwo(nums);
		evaluateDuplicatesThird(nums);
		 evaluateDuplicatesFourth(nums);
	}

}
