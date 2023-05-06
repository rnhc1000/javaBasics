/**
 * 
 */
package packageSolidOpenClosed;

/**
 * @author rnhc1
 * SOLID Design Pattern
 * Principle Number Two - Open-Closed -sOlid
 * Open to extensions
 * Closed to modifications
 * Point: To add a new Role
 * Have to change Footballer
 * Solution:
 * Create a Role class with
 * the positions needed
 * and have Footballer extends Role
 *
 */
public class SolidOpenClosed {

	/**
	 * @param args
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GoalkeeperRole goalkeeperOne = new GoalkeeperRole();
//		Footballer footballerTwo = new Footballer("Marco", 27, "goalkeeper");
		
//		System.out.println("One -> " + footballerTwo.getName().toString());
//		System.out.println("One -> " + footballerTwo.getAge());
		System.out.println("One -> " + goalkeeperOne.getRole());
		

	}

}
