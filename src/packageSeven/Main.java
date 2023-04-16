/**
 * 
 */
package packageSeven;

/**
 * @author rnhc1
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main obj = new Main();
		System.out.println(obj.fun());
		/**
		 * Notably, the built-in == operation on floating-point values is not an
		 * equivalence relation. Despite not defining an equivalence relation, the
		 * semantics of the IEEE 754 == operator were deliberately designed to meet
		 * other needs of numerical computation. There are two exceptions where the
		 * properties of an equivalence relation are not satisfied by == on
		 * floating-point values:
		 */
		if (Float.NaN == Float.NaN) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public int fun() {
		return 20;
	}

}
