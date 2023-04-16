/**
 * 
 */
package packageTwentyEight;

/**
 * @author rnhc1
 *
 */
public class EqualsOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person personOne = new Person(7, "Ricardo");
		Person personTwo = new Person(7, "Ricardo");
		
		/**
		 * Even if we do this 
		 * personOne = personTwo 
		 * in this case the reference 
		 * are the same
		 * and use the comparator operator
		 * they will be false;
		 * 
		 */
		if (personOne.equals(personTwo)) {
				System.out.println(personOne.toString());
				System.out.println(personTwo.toString());
		} else {
			System.out.println("Objetos Diferentes");
		}

	}
}
