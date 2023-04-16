/**
 * 
 */
package packageTen;

/**
 * @author rnhc1
 *
 */

class Machine {

	public void start() {
		
		System.out.println("Machine started!!!");
	}
}

interface Plant {
	public void grow();
}

public class AnonymousClass {
	
	public static void main(String[] args) {
	
	//Machine machineOne = new Machine();
		/**
		 * @Override annotation
		 * original start() method overridden;
		 */
		
		Machine machineOne = new Machine() {
			
			@Override public void start() {
				
				System.out.println("Camera snapping...");
			}
		};
		
		machineOne.start();
		
		// interface Plant
		Plant plantOne = new Plant() {
			/**
			 * there is no way to instantiate an interface
			 * so the usage of an anonymous class
			 * sorts out the problem 
			 */
			@Override
			public void grow() {
				System.out.println("Plant growing...");
			}
		};
		
		plantOne.grow();
		
	}

}
