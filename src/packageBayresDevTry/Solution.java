package packageBayresDevTry;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

	public static void aMethod() throws Exception {
		try /* Line 5 */
		{
			throw new Exception(); /* Line 7 */
		} catch (Exception e) {

			System.out.println("Catch Exception....");
		} finally /* Line 9 */
		{
			System.out.print("finally "); /* Line 11 */
		}
		System.out.println();
	}

	public static double mergedArrays(double[] numsOne, double[] numsTwo) {

		double medianArrayValue = 0.0;
		int sizeNumsOne = numsOne.length;
		int sizeNumsTwo = numsTwo.length;
		int sizeMergedArray = sizeNumsOne + sizeNumsTwo;
		double[] mergedArray = new double[sizeMergedArray];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < sizeNumsOne && j < sizeNumsTwo) {

			if (numsOne[i] <= numsTwo[j]) {

				mergedArray[k] = numsOne[i];
				System.out.println("One i " + i);
				i++;

			} else {

				mergedArray[k] = numsTwo[j];
				System.out.println("Two j " + j);

				j++;
			}

			k++;
		}

		while (i < sizeNumsOne) {

			mergedArray[k] = numsOne[i];
			System.out.println("One i " + i);
			System.out.println("One k " + k);

			k++;
			i++;
		}
		while (j < sizeNumsTwo) {
			mergedArray[k] = numsTwo[j];
			System.out.println("One j " + j);
			System.out.println("One k " + k);
			k++;
			j++;
		}
		// mergedArray[k] = numsTwo[j];

		if (sizeMergedArray % 2 == 0) {

			medianArrayValue = (mergedArray[sizeMergedArray / 2] + mergedArray[(sizeMergedArray / 2) - 1]) / 2;
		} else {
			medianArrayValue = Math.ceil(mergedArray[(sizeMergedArray / 2)]);
		}

		System.out.println(Arrays.toString(mergedArray));
		return medianArrayValue;
	}

	public static void main(String args[]) {
		try {
			aMethod();
		} catch (Exception e) /* Line 20 */
		{
			System.out.print("exception ");
		}
		System.out.print("finished \n"); /* Line 24 */

		List<Integer> lists = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

		System.out.print(lists.stream().filter(e -> e % 2 == 0).collect(Collectors.toList()));
		System.out.println();
		System.out.print(lists.stream().map(e -> e % 2 == 0).collect(Collectors.toList()));

		System.out.println();
		lists.forEach(list -> System.out.print(list.toString() + " "));
		System.out.println();

		for (Integer a : lists) {
			System.out.print(a + " ");
		}
		System.out.println();

		String s = "Hello World";
		System.out.println(s);
		double[] numOne = { 1, 3, 5, 7, 9 };
		double[] numTwo = { 2, 4, 6, 8 };

		double r = mergedArrays(numOne, numTwo);
		System.out.println(r);

	}
}
