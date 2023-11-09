/**
 * 
 */
package packageSolid;

/**
 * @author rnhc1
 * The Interface Segregation Principle (ISP) focuses on designing 
 * interfaces that are specific to their client's needs. 
 * It states that no client should be forced to depend 
 * on methods it does not use.
 */
public class InterfaceSegregation {
	
	interface Vehicle {
	    void startEngine();
	    void stopEngine();
	    void drive();
	    void fly();
	}
	
	class Car implements Vehicle {

	    @Override
	    public void startEngine() {
	        // implementation
	    }

	    @Override
	    public void stopEngine() {
	        // implementation
	    }

	    @Override
	    public void drive() {
	        // implementation
	    }

	    @Override
	    public void fly() {
	        throw new UnsupportedOperationException("This vehicle cannot fly.");
	    }
	}
	
	interface Drivable {
	    void startEngine();
	    void stopEngine();
	    void drive();
	}

	interface Flyable {
	    void fly();
	}
	
	class CarOne implements Drivable {

	    @Override
	    public void startEngine() {
	        // implementation
	    }

	    @Override
	    public void stopEngine() {
	        // implementation
	    }

	    @Override
	    public void drive() {
	        // implementation
	    }
	}
	
	class Airplane implements Drivable, Flyable {

	    @Override
	    public void startEngine() {
	        // implementation
	    }

	    @Override
	    public void stopEngine() {
	        // implementation
	    }

	    @Override
	    public void drive() {
	        // implementation
	    }

	    @Override
	    public void fly() {
	        // implementation
	    }
	}
}
