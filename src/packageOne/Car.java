/**
 * 
 */
package packageOne;

/**
 * @author rnhc1
 *
 */
public class Car extends Machine {

	public void wipeWindShield() {
		System.out.println("Wiping windshield");
	}
	
	/**
	 * Overriding inherited methods from Machine
	 */
	
	public void start() {
		System.out.println("Car started!!!");
	}
	
	public void stop() {
		System.out.println("Car stopped!!!");
	}

}
