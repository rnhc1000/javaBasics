/**
 * 
 */
package packageFourteen;

/**
 * @author rnhc1
 *
 */
public class OverloadMethods {

	int x;
	double y;
	/**
	 * same method but different signatures
	 * @param a
	 * @param b
	 */
	void add(int a, int b) {
		
		x = a + b;
	}
	
	void add (double c, double d) {
		
		y = c + d;
	}
	
	/**
	 * constructor 
	 */
	void overload() {
		
		this.x = 0;
		this.y = 0;
	}
}
