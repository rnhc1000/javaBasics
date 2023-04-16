/**
 * 
 */
package packageThree;

/**
 * @author rnhc1
 *
 */
public class PolimorphismOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		Plant plant = new Plant();
		Tree tree = new Tree();
		
		/**
		 * The same object being referenced
		 * plantOne is a reference to the Object
		 * and now plan is attributed the same reference;
		 */
		Plant plantOne = plant;
		Plant plantTwo = tree;
		
		/**
		 * The method grow has been overridden
		 * in class Tree. The plantTwo variable is referencing
		 * the object tree so that is why the accessed method is
		 * the one overridden. 
		 */
		plantTwo.grow();
		
		/**
		 * This is the original method 
		 * created at Plant Class.
		 */
		plantOne.grow();
		
		
		tree.shedLeaves();

		doGrow(tree);
		
		
}
	/**
	 * 
	 * @param plant
	 * static
	 * 
	 */
	public static void doGrow(Plant plant) {
		plant.grow();
	}

}
