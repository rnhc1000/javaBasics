/**
 * 
 */
package packageSix;

/**
 * @author rnhc1
 *
 */
public class UpDownCasting {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {

		// Create a variable machineOne that references
		// the object Machine
		Machine machineOne = new Machine();
		
		// Create variable cameraOne that references
		// the object Camera
		
		Camera cameraOne = new Camera();
		
		// Accessing the methods provided
		// by each Object
		
		machineOne.start();
		cameraOne.start();
		cameraOne.snap();
		
		// Up casting
		
		// Machine  machineTwo = new Camera();
		// A variable of type Machine references the 
		// object referenced by the variable cameraOne
		// but as the variable is of type MAchine
		// only the methods provided by the Object Machine
		// will be available
		Machine machineTwo = cameraOne;
		
		machineTwo.start();
		
		/**
		 * machineTwo.snap();
		 * won´t work because machineTwo is a 
		 * variable assigned to the object machine
		 * that does not have a snap() method
		 * A Camera is a Machine but not the contrary.
		 * The type of variable determines what
		 * method can be called but the type of the object
		 * that variable refers to that determines
		 * which actual methods implementations will actually
		 * be called when u call that method
		 */

        //Down casting
		
		Machine machineThree = new Camera();
		// wont work a 
		Camera cameraTwo = (Camera) machineThree;
		
		cameraTwo.snap();
		cameraTwo.start();
		
		
		
		
	}

}
