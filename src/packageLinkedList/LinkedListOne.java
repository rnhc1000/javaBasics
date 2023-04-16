/**
 * 
 */
package packageLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author rnhc1
 *
 */
public class LinkedListOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
	}

	private static void doTimings(String type, List<Integer> list) {

		long start = System.currentTimeMillis();
		// Adding items at the end of the list
		for (int i = 0; i < 1E5; i++) {

			list.add(i);
		}

		long end = System.currentTimeMillis();

		System.out.println("Time taken " + (end - start) + "ms " + type);
		System.out.println("-----------------------");
		// Adding items elsewhere
		start = System.currentTimeMillis();
		for (int i = 0; i < 1E5; i++) {

			list.add(0, i);
		} 	
		end = System.currentTimeMillis();

		System.out.println("Time taken " + (end - start) + "ms " + type);

	}

}
