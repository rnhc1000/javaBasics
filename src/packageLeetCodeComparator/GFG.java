/**
 * 
 */
package packageLeetCodeComparator;

import java.util.Comparator;
import java.util.Vector;


/**
 * @author rnhc1
 *
 */
class GFG implements Comparator<Integer> {
	
	@Override 
	public int compare(Integer one, Integer two) {
		
		return one - two;
	}
	
    public void print(Vector<Integer> Numbers)
    {
    	System.out.print("[");
        for (Integer number : Numbers)
        {
            // Printing the elements
            System.out.print( number + ", " );
        }
        System.out.print("]");
    }
 
}
