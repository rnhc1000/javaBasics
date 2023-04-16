/**
 * 
 */
package packageEight;

import java.util.ArrayList;

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

		System.out.println(integers);

	}

}