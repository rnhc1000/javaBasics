/**
 * 
 */
package packageSolid;

/**
 * @author rnhc1
 * The Liskov Substitution Principle (LSP) states 
 * that any instance of a derived class should be 
 * substitutable for an instance of its base class 
 * without affecting the correctness of the program.
 * Class A extends Class B - Class B can substitute 
 * Class A without breaking the code
 */

interface Bike {
	void turnOnEngine();
	void accelerate();
}

public class LiskovSubstitution {

	class Motorbike implements Bike {

	    boolean isEngineOn;
	    int speed;

	    @Override
	    public void turnOnEngine() {
	        isEngineOn = true;
	    }

	    @Override
	    public void accelerate() {
	        speed += 5;
	    }
	}
	
	class Bicycle implements Bike {

	    boolean isEngineOn;
	    int speed;

	    @Override
	    public void turnOnEngine() {
	        throw new AssertionError("There is no engine!");
	    }

	    @Override
	    public void accelerate() {
	        speed += 5;
	    }
	}
	/**
	 * if the Bicycle class is considered a subtype of the Bike interface, 
	 * then according to the LSP, any instance of Bike should be replaceable 
	 * with an instance of Bicycle without altering the correctness of the program.
	 * But in this case, it's not true because Bicycle throws an AssertionError 
	 * while trying to turn on the engine. Therefore, the code violates the LSP.
	 */
}
