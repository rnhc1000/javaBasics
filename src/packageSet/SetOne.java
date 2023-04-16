/**
 * 
 */
package packageSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author rnhc1
 *
 * Set is a kind of collection that
 * store only UNIQUE values
 */
public class SetOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// HashSet does not retain order
		Set<String> setOne = new HashSet<String>();
		setOne.add("dog");
		setOne.add("cat");
		setOne.add("fox");
		setOne.add("pig");
		setOne.add("ant");
		setOne.add("bee");
		setOne.add("oax");
		
		
		System.out.println(setOne);
		// [bee, ant, cat, oax, dog, fox, pig]

		// LinkedHashSet remembers the order you added items in
		Set<String> setTwo = new LinkedHashSet<String>();
		setTwo.add("dog");
		setTwo.add("cat");
		setTwo.add("fox");
		setTwo.add("pig");
		setTwo.add("ant");
		setTwo.add("bee");
		setTwo.add("oax");
		
		
		System.out.println(setTwo);
		// [dog, cat, fox, pig, ant, bee, oax]
		
		// Treeset puts data in natural order
		
		Set<String> setThree = new TreeSet<String>();
		setThree.add("dog");
		setThree.add("cat");
		setThree.add("fox");
		setThree.add("pig");
		setThree.add("ant");
		setThree.add("bee");
		setThree.add("oax");
		
		System.out.println(setThree);
		// [ant, bee, cat, dog, fox, oax, pig]

		// Adding duplicates in a set does nothing
		
		setThree.add("bee");
		System.out.println(setThree);
		// [ant, bee, cat, dog, fox, oax, pig]

		// Iteration
		
		for (String elements: setThree) {
			
			System.out.println(elements);
		}
		
		// Does set contains a certain item
		
		if (setThree.contains("cat")) {
			
			System.out.println("There is cat...");
		} else {
			System.out.println("There is no cat...");
		}
		
		
		// Intersection
		
		Set<String> setFour = new TreeSet<String>();
		
		setFour.add("cat");
		setFour.add("dog");
		setFour.add("lion");
		setFour.add("giraffe");
		setFour.add("ant");
		
		Set<String> intersection = new HashSet<String>(setFour);
		
		// intersection is now a copy of setFour
		// Please see the constructor passed at the end
		
		System.out.println(intersection);
		// [ant, giraffe, cat, dog, lion]

		
		intersection.retainAll(setThree);
		/**
		 * If the specified collection is also
		 * a set, this operation effectively 
		 * modifies this set so that its value 
		 * is the intersection of the two sets.
		 */
		
		System.out.println(intersection);
		// setThree [ant, bee, cat, dog, fox, oax, pig]
		// setFour [ant, giraffe, cat, dog, lion]
		// Common elements Three&Four [ant, cat, dog]
		
		
		Set<String> setFive = new TreeSet<String>();
		
		setFive.add("cat");
		setFive.add("dog");
		setFive.add("lion");
		setFive.add("giraffe");
		setFive.add("ant");
		setFive.add("tiger");
		setFive.add("eagle");
		
		
		Set<String> difference = new HashSet<String>(setFive);
		
		difference.removeAll(setFour);
		
		System.out.println(difference);
		
		


		
		
	}

}
