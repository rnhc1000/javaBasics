/**
 * 
 */
package packageNine;

/**
 * @author rnhc1
 *
 */

import java.util.ArrayList;

class Machine {
	
}


class Camera extends Machine {
	
}



public class GenericTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<String> strings = new ArrayList<String>();

		Animals animals = new Animals();
		
		
		String[] animal = animals.wildlife();

		for (String count : animal) {

			strings.add(count);
		};

		showList(strings);
		
	}
	
	public static void showList(ArrayList<String> strings) {
		for (String value: strings) {
			System.out.printf("%s\t", value);
//			return "Ok";
		}
	}

}
