package br.dev.ferreiras;

import java.util.ArrayList;
/**
 * Hello world!
 *
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		try {
			aMethod();
		} catch (Exception e) /* Line 20 */ {
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
		Double[] numOne = { 1.0, 3.0, 5.0, 7.0, 9.0 };
		Double[] numTwo = { 2.0, 4.0, 6.0, 8.0 };

		Double[] r = mergedArrays(numOne, numTwo);
		System.out.println(Arrays.toString(r));

		List<Car> cars = new ArrayList<Car>(
				Arrays.asList(new Car(1L, "Astra", "Opel", 100, 18000d), new Car(2L, "Opala", "GM", 120, 20000d),
						new Car(3L, "Maverick", "Ford", 240, 30000d), new Car(4L, "XC40", "Volvo", 120, 40000d),
						new Car(5L, "Golf", "VW", 220, 40000d), new Car(6L, "UP", "VW", 100, 20000d)));

		System.out.println(cars);
		Map<Long, Car> carsMap = cars.stream().collect(Collectors.toMap(Car::getId, Function.identity()));

		carsMap.entrySet().forEach(System.out::println);

		Map<String, String> brandModel = cars.stream()
				.collect(Collectors.toMap(Car::getBrand, Car::getModel, (m1, m2) -> m1 + ", " + m2));
		brandModel.entrySet().forEach(System.out::println);

		List<Integer> nonUnique = Arrays.asList(1, 3, 2, 2, 33, 4, 5, 6, 77, 8, 9, 9, 12, 13, 12);
		List<String> nonAsc = Arrays.asList("Ricardo", "Abaco", "Perpetua", "Costa", "Aberto", "Z", "Ricardo",
				"Perpetua");
		Set<String> uniqueAsc = new HashSet<String>(nonAsc);
		Set<Integer> unique = new HashSet<Integer>(nonUnique);
		System.out.println(nonUnique);
		System.out.println(unique.stream().sorted().collect(Collectors.toList()));
		System.out.println(uniqueAsc.stream().sorted().collect(Collectors.toList()));

		List<Integer> numbersToFilter = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		Predicate<Integer> isOddNumber = value -> value % 2 == 1;
		List<Integer> odd = filterOddNumbers(numbersToFilter, isOddNumber);
		System.out.println(odd);

	}

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

	public static List<Integer> filterOddNumbers(List<Integer> numbersToFilter, Predicate<Integer> predicate) {
		return numbersToFilter.stream().filter(predicate).collect(Collectors.toList());
	}

	public static Double[] mergedArrays(Double[] numsOne, Double[] numsTwo) {

		double medianArrayValue = 0.0;
		int sizeNumsOne = numsOne.length;
		int sizeNumsTwo = numsTwo.length;
		int sizeMergedArray = sizeNumsOne + sizeNumsTwo;
		Double[] mergedArray = new Double[sizeMergedArray];
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
//		return medianArrayValue;
		Integer num1 = 400;
		Integer num2 = 400;
		String num3 = "Ricardo";
		String num4 = "Ricardo";

		if (num1.equals(num2)) {
			System.out.println("true");
		} else {
			System.out.println("Not equal");
		}

		if (num3.equals(num4)) {
			System.out.println("Num3 === Num4");
		}

		return mergedArray;

	}

}
