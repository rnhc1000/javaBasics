/**
 * 
 */
package packageThirty;

import packageThirty.Robot.Battery;

/**
 * @author rnhc1
 *
 */
public class InnerClassOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robot = new Robot(5);
		robot.start();
		Robot.Battery battery = robot.new Battery();
		battery.charge();

	}

}
