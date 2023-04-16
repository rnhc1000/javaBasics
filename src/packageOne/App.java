/**
 * 
 */
package packageOne;

/**
 * @author rnhc1000
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Machine machOne = new Machine();
		
		machOne.start();
		machOne.stop();
		
		Car carOne = new Car();
		
		Car carTwo = new Car();
		
		carOne.start();
		carOne.wipeWindShield();
		carOne.stop();
		Person personOne = new Person("Bob");
		personOne.greet();
		carTwo.start();
		
		machOne.showInfo();
		


	}

}
