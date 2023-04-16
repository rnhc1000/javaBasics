/**
 * 
 */
package packageThirty;

/**
 * @author rnhc1
 *
 */
public class Robot {

	private int id;

	private class Brain {

		public void think() {

			System.out.println("Robot " + id + " is thinking");
		}
	}

	public class Battery {

		public void charge() {
			System.out.println("Battery Charging...");
		}
	}

	public Robot(int id) {

		this.id = id;
	}

	public void start() {
		System.out.println("Starting robot...");
		Brain brain = new Brain();
		brain.think();
	}

}
