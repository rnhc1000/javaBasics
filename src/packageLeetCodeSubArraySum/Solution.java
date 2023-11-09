package packageLeetCodeSubArraySum;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author rferreira This solution is based on Kadaneś Algorithm It is an
 *         interactive dynamic programming algorithm Define two-variable currSum
 *         which stores maximum sum ending here and maxSum which stores maximum
 *         sum so far. Initialize currSum with 0 and maxSum with INT_MIN. Now,
 *         iterate over the array and add the value of the current element to
 *         currSum and check If currSum is greater than maxSum, update maxSum
 *         equals to currSum. If currSum is less than zero, make currSum equal
 *         to zero. Finally, print the value of maxSum
 * 
 */
class Solution {
	public int maxSubArray(int[] nums) {
		int len = nums.length;
		int maxValue = Integer.MIN_VALUE;
		int sumUP = 0;
		// Do not waste time.... cleaning
		switch (len) {
		case 0:
			return 0;
		case 1:
			return nums[0];
		default:
			break;
		}
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < len; i++) {
			sumUP += nums[i];
			System.out.println("i " + i + " " + "SumUP: " + sumUP);
			if (sumUP > maxValue) {
				maxValue = sumUP;
				System.out.print("Index Positivo: " + i + " \n");
				System.out.println("maxValue: " + maxValue);
				queue.add(nums[i]);
				System.out.println(queue);

			}
			if (sumUP < 0) {
				sumUP = 0;
				System.out.println(" ----- ");
				System.out.print("Index sumUP=0: " + i + " \n");
				System.out.println(" ----- ");
				queue.removeAll(queue);
				System.out.println(queue);

			}
		}
		System.out.println(queue);
		return maxValue;
	}

	public static void main(String[] args) {

		int arr[] = { 1, -3, 2, 6, -8, 5, 4, -1, 7 };
		int result = 0;

		Solution solution = new Solution();

		result = solution.maxSubArray(arr);

		System.out.println("Resultado: " + result);
	}
}