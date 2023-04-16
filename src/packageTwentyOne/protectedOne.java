/**
 * 
 */
package packageTwentyOne;

import java.util.BitSet;
import java.util.Hashtable;

/**
 * @author rnhc1
 *
 */

class A {
	
	public int i;
	protected int j;
}

class B extends A {
	
	int j;
	void display() {
		
		super.j = 3;
		System.out.println(i + " " + j);
	}
}
public class protectedOne {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.i=1;
		obj.j=2;
		obj.display();
		try {
		BitSet obJ = new BitSet(10);
		for (int i=0; i<10; ++i) 
			obJ.set(i);
		//obJ.clear(2);
		System.out.println(obJ.length() + " " + obJ.size());
		System.out.println(obJ.toString());
		} catch(Exception e) {
			System.out.println("Erro....");
			e.printStackTrace();
		}
		Hashtable oBj = new Hashtable();
		oBj.put("A", new Integer("3"));
		oBj.put("B", new Integer("2"));
		oBj.put("C", new Integer("8"));
		System.out.println(oBj.toString().toLowerCase());
		
		//Graphics g = new Graphics();
		
	}

}
