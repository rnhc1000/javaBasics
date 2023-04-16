/**
 * 
 */
package packageArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rnhc1
 *
 */
public class ArrayListOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers  = new ArrayList<Integer>();
		/**
		 * Default size: 10
		 */
		
		numbers.add(10);
		numbers.add(40);
		numbers.add(100);
		// Getting values
		System.out.println(numbers.get(0));

		
		System.out.println("Interation #1");
		for (int i=0; i < numbers.size(); i++){
			
			System.out.println(numbers.get(i));
		}
		
		// be very careful when removing items 
		numbers.remove(numbers.size() -1);
		
		// very slow
		numbers.remove(0);
		
		System.out.println("Iteration #2");
		
		for (Integer number: numbers) {
			
			System.out.println(number);
		}
		
		// List interface ....
		List<String> values = new ArrayList<String>();
		

	}

}
