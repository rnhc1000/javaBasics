/**
 * 
 */
package packageTwentyFour;

/**
 * @author rnhc1
 *
 */
public class AbstractClassOne {

	/**
	 * @param args
	 * Abstract classes are used
	 * when you want to start creating
	 * a class hierarchy
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Camera camOne = new Camera();
		
		camOne.setId(5);
		
		Car carOne = new Car();
		carOne.setId(4);
		
		/**
		 * Abstract classes can not be instantiated
		 */
		//Machine machineOne = new Machine();
		
		carOne.run();
	}

}
