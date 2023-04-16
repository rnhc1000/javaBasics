/**
 * 
 */
package packageOne;

/**
 * @author rnhc1
 *
 */
public class Person {

	private String name;
	protected Person(String name) {
		this.name = name;
	}
	public void greet() {
		System.out.println("Hello there!");
	}

}
